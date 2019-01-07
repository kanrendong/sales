package com.woniuxy.action.salesRole;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.woniuxy.domain.SalesRole;
import com.woniuxy.service.SalesRoleService;
import com.woniuxy.service.SalesTreeService;

@Controller
@RequestMapping("/admin/role")
public class SalesRoleAction {
	@Resource
	private SalesRoleService salesRoleService;
	@Resource
	private SalesTreeService salesTreeService;
	
	@RequestMapping("findAll")
	public String findAll(ModelMap map){
		List list = salesRoleService.findAll();
		map.put("list", list);
		return "/admin/role/list";
	}
	
	@RequestMapping("save")
	public String save(SalesRole role,String ids){
		salesRoleService.save(role,ids);
		return "redirect:findAll";
	}
	
	@RequestMapping("update")
	public String update(SalesRole role,String ids){
		salesRoleService.update(role,ids);
		return "redirect:findAll";
	}
	
	@RequestMapping("findById")
	public String findById(Integer rid,ModelMap map){
		SalesRole role =  salesRoleService.findById(rid);
		map.put("role",role);
		return "forward:goInput";
	}
	
	@RequestMapping("goInput")
	public String goInput(ModelMap map) throws JsonProcessingException{
		List trees = salesTreeService.findAll();
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(trees);
		map.put("json", json);
		return "/admin/role/input";
	}
	
//	public static void main(String[] args) throws Exception {
//		BeanFactory f = new ClassPathXmlApplicationContext("applicationContext*.xml");
//		SalesTreeService t = f.getBean(SalesTreeService.class);
//		List list = t.findAll();
//		ObjectMapper mapper = new ObjectMapper();
//		String json =  mapper.writeValueAsString(list); 
//		System.out.println(json);
//	}
}
