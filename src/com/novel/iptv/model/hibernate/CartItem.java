package com.novel.iptv.model.hibernate;

public class CartItem {
	private Integer id;  

	private String cardNo; //用户的智能卡号
    private	String cartItemId;  //对应产品的code
    private	String cartItemName; //产品名称
    private	Double cartItemPrice;//价格
	private	int cartItemNum;   //数量
    private	String cartItemStatus; //产品状态
    private Double cartItemCount; //总价
    
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


    
    public Double getCartItemCount() {
		return cartItemCount;
	}


	public void setCartItemCount(Double cartItemCount) {
		this.cartItemCount = cartItemCount;
	}


	public String getCartItemId() {
		return cartItemId;
	}


	public void setCartItemId(String cartItemId) {
		this.cartItemId = cartItemId;
	}



	public String getCartItemName() {
		return cartItemName;
	}



	public void setCartItemName(String cartItemName) {
		this.cartItemName = cartItemName;
	}



	public Double getCartItemPrice() {
		return cartItemPrice;
	}



	public void setCartItemPrice(Double cartItemPrice) {
		this.cartItemPrice = cartItemPrice;
	}



	public int getCartItemNum() {
		return cartItemNum;
	}



	public void setCartItemNum(int cartItemNum) {
		this.cartItemNum = cartItemNum;
	}



	public String getCartItemStatus() {
		return cartItemStatus;
	}



	public void setCartItemStatus(String cartItemStatus) {
		this.cartItemStatus = cartItemStatus;
	}



	


	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}



	public String getCardNo() {
		return cardNo;
	}
	

}
