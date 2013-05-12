package com.novel.iptv.action;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionServlet;
import org.apache.struts.actions.DispatchAction;

import com.novel.iptv.model.hibernate.Tb_merchandise_image;
import com.novel.iptv.model.hibernate.Tb_merchandise_info;
import com.novel.iptv.model.hibernate.Tb_sort;
import com.novel.iptv.services.IBaseService;
import com.novel.iptv.util.ConstConfig;
import com.novel.iptv.util.SpringFactory;

public class HeadAction extends DispatchAction{
	private transient final static Log log = LogFactory.getLog(LoginAction.class);
	private IBaseService baseService;
	public void setServlet(ActionServlet actionServlet)
	{
		super.setServlet(actionServlet);
		baseService=(IBaseService)SpringFactory.getInstance().getSpringBean("baseService");
	}
	
	public ActionForward headFind(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response) 
	{	
		log.info("查询菜单");
		request.setAttribute("isGo",1);//判断是否进入此Action
		String name = request.getParameter("name");
		String id_two="";
		List twoLis =new ArrayList();//2级菜单集合
		List threeLis =new ArrayList();//3级菜单集合
		HttpSession session =request.getSession();
		Tb_sort t_two = new Tb_sort();
		Tb_sort t_three = new Tb_sort();
		List all= new ArrayList();
		if(name!=null){		
					List one =baseService.findByProperty("Tb_sort", "code", name);
					if(one.size()==0){
						request.setAttribute("msg", "没有查到相关一级菜单信息!");
						return mapping.findForward("error");
					}
					Tb_sort sort =(Tb_sort)one.get(0);
					String imgId =request.getParameter("img_id");
					if(imgId!=null){
						String img =sort.getPhoto();
						request.setAttribute("img_tit", img);
					}
					List two =baseService.findByProperty("Tb_sort", "parent_id", sort.getId());	
					session.setAttribute("two", two); //存入2级菜单列表
					t_two=(Tb_sort)two.get(0);
					id_two = t_two.getId();
					if(request.getParameter("id_two")!=null)
						id_two = request.getParameter("id_two");
					List ls_three = baseService.findByProperty("Tb_sort", "parent_id",id_two);
					
					for(int j=0;j<ls_three.size();j++){
						Tb_sort sort_three =(Tb_sort)ls_three.get(j);
						String[] pro ={"sort_id","status"};
						String[] value={sort_three.getId(),"2"};
						all =baseService.findByProperty("Tb_merchandise_info",pro,value);
						if(all.size()>0){
							threeLis.add(sort_three);	
						}
						session.setAttribute("tit_two", id_two);
						session.setAttribute("one", name);
					}
					if(threeLis.size()>0)
						session.setAttribute("three", threeLis);//存3 级菜单
					else{
						session.setAttribute("three", threeLis);//存3 级菜单
						return mapping.findForward("merchandise_list");
					}	
					
					
					if(id_two!=""){
					String id_three ="";
					if(request.getParameter("id_three")!=null)
						id_three=request.getParameter("id_three");
					else{
						Tb_sort thr =(Tb_sort)threeLis.get(0);
						id_three=thr.getId();
						}
					int page =1;
					int pageSize =1;
					String[] pro ={"sort_id","status"};
					String[] value={id_three,"2"};
					List ls_all =baseService.findByProperty("Tb_merchandise_info",pro,value);
					if(request.getParameter("page")!=null)
						page=Integer.parseInt(request.getParameter("page"));
						if(ls_all.size() % 6 !=0)
							 pageSize =(ls_all.size() / 6)+1;
						else
							 pageSize =(ls_all.size() / 6);
						if(page>pageSize)	
							page=pageSize;
						if(page<1)
							page=1;
						
						List ls_info =baseService.findByProperty("Tb_merchandise_info",pro,value,page,6,null,false);
						if(ls_info.size()>0){
							List img =new ArrayList();
							for(int i=0;i<ls_info.size();i++){
								Tb_merchandise_info info =(Tb_merchandise_info)ls_info.get(i);
								List images =baseService.findByProperty("Tb_merchandise_image", "merchandise_code",info.getCode());
								String  s="";
								if(images.size()>0){
									Tb_merchandise_image image =(Tb_merchandise_image)images.get(0);
									String imgpath = image.getImage_path();
									s =imgpath.substring(0,imgpath.indexOf(".")) + ConstConfig.merList +imgpath.substring(imgpath.indexOf("."),imgpath.length());								
								}
								img.add(s);	
							}
							request.setAttribute("info", ls_info);
							request.setAttribute("img", img);
						}
						session.setAttribute("page",page);
					
					session.setAttribute("tit_three",id_three);
				}			
		}else{
			session.removeAttribute("two");
			session.removeAttribute("page");
			session.removeAttribute("tit_three");
			session.removeAttribute("tit_two");
			session.removeAttribute("one");
			session.removeAttribute("three");
		}
		    return mapping.findForward("merchandise_list");
	}
}
