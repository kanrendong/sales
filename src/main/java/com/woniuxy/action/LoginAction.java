package com.woniuxy.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.domain.SalesTree;
import com.woniuxy.domain.SalesUserinfo;
import com.woniuxy.service.SalesTreeService;
import com.woniuxy.service.SalesUserinfoService;
import com.woniuxy.util.MD5;


@Controller
public class LoginAction {
	@Resource
	private SalesUserinfoService salesUserinfoService;
	
	@Resource
	private SalesTreeService salesTreeService;
	/**   
	 * @Title: login   
	 * @Description: TODO(µÇÂ¼)   
	 * @param: @return      
	 * @return: String      
	 * @throws   
	 */ 
	@RequestMapping("/login")
	public String login(SalesUserinfo info,HttpServletRequest request){
		info.setUpass(MD5.md5s(info.getUpass()));
		info = salesUserinfoService.login(info);
		if(info==null){
			return "index";
		}else{
			request.getSession().setAttribute("info",info);
			return "redirect:/admin/index.jsp";
		}
	}
	
	
	
	/**   
	 * @Title: loginout   
	 * @Description: TODO(×¢Ïú)   
	 * @param: @return      
	 * @return: String      
	 * @throws   
	 */ 
	@RequestMapping("/logout")
	public String loginout(){
		return null;
	}

}
