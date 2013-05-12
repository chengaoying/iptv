package com.novel.iptv.action.cart;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionServlet;
import org.apache.struts.actions.DispatchAction;
import org.springframework.beans.BeanUtils;

import cn.com.do1.ebusiness.exinterface.vo.request.xsd.AddShoppingCartsRequestVO;
import cn.com.do1.ebusiness.exinterface.vo.request.xsd.DelShoppingCartRequestVO;
import cn.com.do1.ebusiness.exinterface.vo.request.xsd.QueryShoppingCartRequestVO;
import cn.com.do1.ebusiness.exinterface.vo.request.xsd.ShoppingCartItem;
import cn.com.do1.ebusiness.exinterface.vo.request.xsd.ShoppingCartOrderRequestVO;
import cn.com.do1.ebusiness.exinterface.vo.response.xsd.AddShoppingCartResponseVO;
import cn.com.do1.ebusiness.exinterface.vo.response.xsd.DelShoppingCartResponseVO;
import cn.com.do1.ebusiness.exinterface.vo.response.xsd.QueryShoppingCartResponseVO;
import cn.com.do1.ebusiness.exinterface.vo.response.xsd.ShopCartInfo;
import cn.com.do1.ebusiness.exinterface.vo.response.xsd.ShoppingCartOrderResponseVO;
import cn.com.do1.ebusiness.exinterface.vo.xsd.MdShopCar;
import cn.com.do1.ebusiness.exinterface.vo.xsd.MerchantShopCar;

import com.novel.iptv.model.hibernate.CartItem;
import com.novel.iptv.model.hibernate.Tb_merchandise_info;
import com.novel.iptv.services.CartService;
import com.novel.iptv.services.IBaseService;
import com.novel.iptv.util.SpringFactory;
import com.novel.iptv.webservice.RequestHeadVO;
import com.novel.iptv.webservice.ServiceUtils;

public class UserCartAction extends DispatchAction {
	
	private CartService carService = (CartService) SpringFactory.getInstance().getSpringBean("cartService");
	
	private IBaseService baseService;
	public void setServlet(ActionServlet actionServlet)
	{
		super.setServlet(actionServlet);
		baseService=(IBaseService)SpringFactory.getInstance().getSpringBean("baseService");
	}

	/*
	 * 添加商品到购物车(数据库)中
	 */
	public ActionForward addCart(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String cardNo = null;
		if (request.getSession().getAttribute("userId") != null && request.getSession().getAttribute("userId") != "") {
			cardNo = request.getSession().getAttribute("userId").toString();
		} else {
			return mapping.findForward("index");
		}
		String cartId = request.getParameter("productCode");
		List merLis = baseService.findByProperty("Tb_merchandise_info", "code", cartId);
		Tb_merchandise_info mer =(Tb_merchandise_info)merLis.get(0);
		
		String num = request.getParameter("num");
		String num2 = request.getParameter("num2");
		String name = mer.getName();
		Double price = mer.getPrice();
		CartItem item = new CartItem();
		item.setCartItemId(cartId);
		item.setCartItemName(name);
		item.setCartItemPrice(price);
		item.setCardNo(cardNo);
 
		int j=1;
		if(num != null){
		   j = Integer.parseInt(num);
		}
		if (num2 != null) {
			item.setCartItemNum(Integer.parseInt(num2));
		} else {
			String[] str3 = { cartId };
			List cartItems3 = carService.getAllObject2("CartItem", str3, true);
			if (cartItems3 != null && cartItems3.size() > 0) {
				for (int i = 0; i < cartItems3.size(); i++) {
					CartItem ci = (CartItem) cartItems3.get(i);
					//int m = Integer.parseInt(num);
					item.setCartItemNum(ci.getCartItemNum() + j);
				}
			} else {
				//int m = Integer.parseInt(num);
				item.setCartItemNum(j);
			}
		}
		
		carService.saveOrUpdate(item);
		int pageNo = Integer.parseInt(request.getParameter("pageNo"));
		String[] str = { cardNo };
		int rpp = 8;
		List cartItems2 = carService.getAllObject("CartItem", str, true);
		int totalSize = cartItems2.size();
		int totalPage = (totalSize % rpp == 0) ? (totalSize / rpp) : ((totalSize / rpp) + 1);
		if (pageNo < 1) {
			pageNo = 1;
		}else if (pageNo > totalPage) {
			pageNo = totalPage;
		}
		List<CartItem> cartItems = carService.getAllObject("CartItem", str, true, pageNo, rpp);
		if (cartItems == null || cartItems2 == null) {
			return mapping.findForward("error");
		}
		request.setAttribute("cardNo",cardNo);
		request.setAttribute("cartItems", cartItems);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("pageNo", pageNo);
		return mapping.findForward("userCartAdd");
	}

	/*
	 * 查询购物车(数据库)中的商品
	 */
	public ActionForward selectCartItem(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String cardNo = null;
		if (request.getSession().getAttribute("userId") != null && request.getSession().getAttribute("userId") != "") {
			cardNo = request.getSession().getAttribute("userId").toString();
		} else {
			return mapping.findForward("index");
		}
		int pageNo = Integer.parseInt(request.getParameter("pageNo"));
		String[] str = { cardNo };// 智能卡号
		int rpp = 8;
		List<CartItem> cartItems2 = carService.getAllObject("CartItem", str, true);
		int totalSize = cartItems2.size();
		int totalPage = (totalSize % rpp == 0) ? (totalSize / rpp) : ((totalSize / rpp) + 1);
		if (pageNo < 1) {
			pageNo = 1;
		}else if (pageNo > totalPage) {
			pageNo = totalPage;
		}
		List<CartItem> cartItems = carService.getAllObject("CartItem", str, true, pageNo, rpp);
		if (cartItems == null || cartItems2 == null) {
			return mapping.findForward("none");
		}
		request.setAttribute("cardNo",cardNo);
		request.setAttribute("cartItems", cartItems);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("pageNo", pageNo);
		return mapping.findForward("userCartList");
	}

	/*
	 * 删除购物车中的商品
	 */
	public ActionForward deletCartItem(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int pageNo = Integer.parseInt(request.getParameter("pageNo"));
		String cartItemCode = request.getParameter("cartItemCode");
		String cardNo = request.getSession().getAttribute("userId").toString();
		List items = carService.findByProperty("CartItem", "cartItemId",cartItemCode);
		for (int i = 0; i < items.size(); i++) {
			CartItem item = (CartItem) items.get(i);
			carService.deleteObject(item);
		}
		String[] str = { cardNo };// 智能卡号
		int rpp = 8;
		List<CartItem> cartItems2 = carService.getAllObject("CartItem", str, true);
		int totalSize = cartItems2.size();
		int totalPage = (totalSize % rpp == 0) ? (totalSize / rpp) : ((totalSize / rpp) + 1);
		if (pageNo < 1) {
			pageNo = 1;
		}else if (pageNo > totalPage) {
			pageNo = totalPage;
		}
		List<CartItem> cartItems = carService.getAllObject("CartItem", str, true, pageNo,rpp);
		if (cartItems == null || cartItems2 == null) {
			return mapping.findForward("none");
		}
		request.setAttribute("cardNo",cardNo);
		request.setAttribute("cartItems", cartItems);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("pageNo", pageNo);
		return mapping.findForward("userCartList");
	}

	// 生成订单(从数据库中把数据提交的服务器上,然后生成订单)
	public ActionForward makeOrder(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String cardNo = request.getSession().getAttribute("userId").toString();
		// 把购物车页面中的商品放入购物车中
		AddShoppingCartsRequestVO addShop = new AddShoppingCartsRequestVO();
		RequestHeadVO req = ServiceUtils.initHeadVO();
		BeanUtils.copyProperties(req, addShop);
		String mobile = request.getParameter("phone");
		String[] codeid_list = request.getParameter("codeid").trim().split(",");
		String[] numcount_list = request.getParameter("numcount").trim().split(",");
		
		ShoppingCartItem[] cartItems = new ShoppingCartItem[codeid_list.length];
		for (int i = 0; i < cartItems.length; i++) {
			ShoppingCartItem item = new ShoppingCartItem();
			item.setMerchandiseCode(codeid_list[i]);
//			item.setBuyNum(); 购买数量
			cartItems[i] = item;
		}
		addShop.setShoppingCartItems(cartItems);
		addShop.setInterfaceId("109");
		addShop.setCardNo(cardNo);
		addShop.setMobile(mobile);
		AddShoppingCartResponseVO resVO = ServiceUtils.getService4Order().addShoppingCarts(addShop);
		// 查询加入到购物车中的商品
		QueryShoppingCartRequestVO requ = new QueryShoppingCartRequestVO();
		RequestHeadVO requestheadvo = ServiceUtils.initHeadVO();
		BeanUtils.copyProperties(requestheadvo, requ);

		int pageNo = Integer.parseInt(request.getParameter("pageNo"));
		requ.setCardNo(cardNo);
		requ.setInterfaceId("111");
		requ.setPageSize(1000);
		requ.setMobile(mobile);
		requ.setCurrentPage(pageNo);
		QueryShoppingCartResponseVO res = ServiceUtils.getService4Order().queryShoppingCart(requ);
		MerchantShopCar[] cartList = res.getShopCartList();
		int totaleSize2 = res.getTotalSize();
		int totalPage = (totaleSize2 % 8 == 0) ? (totaleSize2 / 8) : ((totaleSize2 / 8) + 1);
		if (pageNo < 1) {
			pageNo = 1;
		}else if (pageNo > totalPage) {
			pageNo = totalPage;
		}
		// 初始化shopCartList[]
		MdShopCar mdshop = null;
		List<ShopCartInfo> shoplist=new ArrayList<ShopCartInfo>();
		int k = 0;
		for (int i = 0; i < cartList.length; i++) {
			MerchantShopCar merchant = (MerchantShopCar) cartList[i];
			MdShopCar[] mdcar = merchant.getMdList();
			for (int j = 0; j < mdcar.length; j++, k++) {
				ShopCartInfo shopCart = new ShopCartInfo();
				mdshop = mdcar[j];
				shopCart.setShopCartId(mdshop.getShopCarId());
				shopCart.setBuyNum(mdshop.getBuyNum());
				shoplist.add(shopCart);
//				shopCartList[k] = shopCart;
			}
		}
		ShopCartInfo[] shopCartList = shoplist.toArray(new ShopCartInfo[shoplist.size()]);
		
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("pageNo", pageNo);
		request.setAttribute("cartList", cartList);
		request.setAttribute("mobile", mobile);
		// 提交
		ShoppingCartOrderRequestVO cartOrder = new ShoppingCartOrderRequestVO();
		RequestHeadVO reqvo = ServiceUtils.initHeadVO();
		BeanUtils.copyProperties(reqvo, cartOrder);

		cartOrder.setInterfaceId("108");
		cartOrder.setCardNo(cardNo);
		cartOrder.setShopCartList(shopCartList);
		cartOrder.setDeliveryType(3);
		cartOrder.setPayType(3);
		cartOrder.setIsInvoiceNeeded(0);
		cartOrder.setMobile(mobile);
		cartOrder.setOrderSource(5);
		ShoppingCartOrderResponseVO VO = ServiceUtils.getService4Order().shoppingCartOrder(cartOrder);
		if ("0000".equals(VO.getRespCode())) {
			deleteCart(cardNo);
			return mapping.findForward("makeOrder");
		}else {
			request.setAttribute("msg", VO.getRespDesc());
			return mapping.findForward("error");
		}
	}

	// 生成订单后青空购物车(数据库)
	private void deleteCart(String cardNo) {
		List items = carService.findByProperty("CartItem", "cardNo", cardNo);
		for (int i = 0; i < items.size(); i++) {
			CartItem item = (CartItem) items.get(i);
			carService.deleteObject(item);
		}
	}
	
	public ActionForward deletCart(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception{
		String cardNo = null;
		if (request.getSession().getAttribute("userId") != null && request.getSession().getAttribute("userId") != "") {
			cardNo = request.getSession().getAttribute("userId").toString();
		} else {
			return mapping.findForward("index");
		}
		
		DelShoppingCartRequestVO delCart = new DelShoppingCartRequestVO();
		RequestHeadVO req = ServiceUtils.initHeadVO();
		BeanUtils.copyProperties(req, delCart);
		
		delCart.setInterfaceId("110");
		delCart.setCardNo(cardNo);
		
		DelShoppingCartResponseVO res = ServiceUtils.getService4Order().delShoppingCart(delCart);
		
		String code = res.getRespCode();
		String desc = res.getRespDesc();
		
		return mapping.findForward("index");
	} 
			
	

}
