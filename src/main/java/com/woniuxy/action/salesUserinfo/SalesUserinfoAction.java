package com.woniuxy.action.salesUserinfo;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniuxy.domain.SalesUserinfo;
import com.woniuxy.service.SalesRoleService;
import com.woniuxy.service.SalesUserinfoService;
import com.woniuxy.util.MD5;

@Controller
@RequestMapping("/admin/salesUserinfo/")
public class SalesUserinfoAction {
	@Resource
	private SalesUserinfoService salesUserinfoService;
	@Resource
	private SalesRoleService salesRoleService;
	
	@RequestMapping("findAll")
	public String findAll(ModelMap map){
		List list = salesUserinfoService.findAll();
		map.put("list", list);
		return "/admin/userinfo/list";
	}
	@RequestMapping("save")
	public String save(SalesUserinfo info,int[] rids){
		System.out.println(info.getUname());
		//info.setUpass(MD5.md5s(info.getUpass()));
		salesUserinfoService.save(info, rids);
		return "redirect:findAll";
	}
	
	@RequestMapping("update")
	public String update(SalesUserinfo info,int[] rids){
		//if(info.getUpass()!=null)
			//info.setUpass(MD5.md5s(info.getUpass()));
		salesUserinfoService.update(info, rids);
		return "redirect:findAll";
	}
	@RequestMapping("findById")
	public String findById(Integer uid,ModelMap map){
		SalesUserinfo userinfo =  salesUserinfoService.findById(uid);
		map.put("userinfo",userinfo);
		return "forward:goInput";
	}
	
	@RequestMapping("goInput")
	public String goInput(ModelMap map){
		List roles = salesRoleService.findAll();
		map.put("roles", roles);
		return "/admin/userinfo/input";
	}
	
}
