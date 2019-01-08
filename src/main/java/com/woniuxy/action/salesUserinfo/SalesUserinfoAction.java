	package com.woniuxy.action.salesUserinfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.domain.Page;
import com.woniuxy.domain.SalesUserinfo;
import com.woniuxy.service.SalesRoleService;
import com.woniuxy.service.SalesUserinfoService;
import com.woniuxy.util.MD5;
import com.woniuxy.util.Message;

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
		return "/admin/salesUserinfo/list";
	}
	@RequestMapping("find")
	public @ResponseBody Map findAll(Page page){
		List<SalesUserinfo> list = salesUserinfoService.findAll(page);
		int total =salesUserinfoService.countAll();
		Map map = new HashMap();
		map.put("total", total);
		map.put("rows", list);
		//List salesRole = salesRoleService.findAll();
		//map.put("salesRole", salesRole);
		return map;
	}
	
	@RequestMapping("save")
	public String save(SalesUserinfo info,int[] roleids){
		//info.setUpass(MD5.md5s(info.getUpass()));
		salesUserinfoService.save(info, roleids);
		return "redirect:findAll";
	}
	
//	@RequestMapping("save")
//	public @ResponseBody Message save(SalesUserinfo info,int[] roleids){
//		Message msg = null;
//		try{
//			salesUserinfoService.save(info, roleids);
//			msg = new Message(true, "增加用户成功啦！！！");
//		}catch(Exception ex){
//			msg = new Message(false, "增加用户成功失败啦！！！"+ex);
//		}
//		return msg;
//	}
	
	@RequestMapping("update")
	public String update(SalesUserinfo info,int[] roleids){
		//if(info.getUpass()!=null)
			//info.setUpass(MD5.md5s(info.getUpass()));
		salesUserinfoService.update(info, roleids);
		return "redirect:findAll";
	}
	@RequestMapping("findById")
	public String findById(Integer uid,ModelMap map){
		SalesUserinfo userinfo =  salesUserinfoService.findById(uid);
		map.put("userinfo",userinfo);
		return "forward:goInput";
	}
	
	@RequestMapping("/goInput")
	public String goInput(ModelMap map){
		List salesRole = salesRoleService.findAll();
		map.put("salesRole", salesRole);
		return "/admin/salesUserinfo/input";
	}
	
}
