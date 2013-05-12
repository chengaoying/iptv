package com.novel.iptv.group.temp;

import com.novel.iptv.IndexServlet;
import com.novel.iptv.group.internal.IGroupTemp;
import com.novel.iptv.group.internal.impl.GroupDisedetailsTemp;
import com.novel.iptv.group.internal.impl.GroupListTemp;
import com.novel.iptv.util.ConstConfig;
import com.novel.iptv.util.FileUtil;

public class GroupTemp {

	public static void crTempgroup(){
		try {
			FileUtil.deletefile(IndexServlet.contextPath+ConstConfig.html_path);
			FileUtil.creactFile(IndexServlet.contextPath+ConstConfig.html_path);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//团购列表生成html
		IGroupTemp service=new GroupListTemp();
		service.publishHtmletan();
		//团购详情生成html
		IGroupTemp service1=new GroupDisedetailsTemp();
		service1.publishHtmletan();
	}
	
}
