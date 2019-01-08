package com.woniuxy.action.visit;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.domain.Page;
import com.woniuxy.domain.SaleVisit;
import com.woniuxy.service.SaleVisitService;
import com.woniuxy.util.Message;

@Controller
@RequestMapping("/admin/visit")
public class VisitAction { 

	@Resource
	private SaleVisitService service;
	
	@RequestMapping("findAll")
	public @ResponseBody Map findAll(Page page){
		List<SaleVisit> list = service.findAll(page);
		int total =service.countAll();
		Map map = new HashMap();
		map.put("total", total);
		map.put("rows", list);
		return map;
	}
	@RequestMapping("save")
	public @ResponseBody Message save(SaleVisit visit){
		Message msg = null;
		try{
			service.save(visit);
			msg = new Message(true, "用户成功啦！！！");
		}catch(Exception ex){
			msg = new Message(false, "用户成功啦！！！"+ex);
		}
		return msg;
	}
	@RequestMapping("delete")
	public @ResponseBody Message delete(SaleVisit visit){
		Message msg = null;
		try{
			service.delete(visit);
			msg = new Message(true, "用户删除成功啦！！！");
		}catch(Exception ex){
			msg = new Message(false, "用户删除成功啦！！！"+ex);
		}
		return msg;
	}
	
}