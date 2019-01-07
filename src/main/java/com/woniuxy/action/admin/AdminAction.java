package com.woniuxy.action.admin;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.domain.SalesUserinfo;
import com.woniuxy.service.SalesTreeService;

@Controller
@RequestMapping("/admin")
public class AdminAction {

	@Resource
	private SalesTreeService salesTreeService;
	
	@RequestMapping("/getTree")
	public @ResponseBody List getTree(HttpServletRequest request){
		SalesUserinfo info = (SalesUserinfo)request.getSession().getAttribute("info");
		List trees = salesTreeService.findAll(info.getUid());
		request.getSession().setAttribute("trees", trees);
		return trees;
	}
	
	
}
