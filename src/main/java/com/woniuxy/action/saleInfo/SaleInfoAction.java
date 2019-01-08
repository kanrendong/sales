package com.woniuxy.action.saleInfo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.domain.Page;
import com.woniuxy.domain.SaleInfo;
import com.woniuxy.service.SaleInfoService;
import com.woniuxy.util.Message;

@Controller
@RequestMapping("/saleInfo")
public class SaleInfoAction {

	@Resource
	private SaleInfoService saleInfoService;
	
	@RequestMapping("findAll")
	public @ResponseBody Map findAll(Page page){
		List<SaleInfo> list = saleInfoService.findAll(page);
		int total =saleInfoService.countAll();
		Map map = new HashMap();
		map.put("total", total);
		map.put("rows", list);
		return map;
	}
	
	@RequestMapping("delete")
	public @ResponseBody Message delete(SaleInfo info){
		Message msg = null;
		try{
			saleInfoService.delete(info);
			msg = new Message(true, "用户删除成功啦！！！");
		}catch(Exception ex){
			msg = new Message(false, "用户删除成功失败啦！！！"+ex);
		}
		return msg;
	}
}
