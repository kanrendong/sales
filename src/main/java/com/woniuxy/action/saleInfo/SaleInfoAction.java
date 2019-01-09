package com.woniuxy.action.saleInfo;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.woniuxy.domain.Page;
import com.woniuxy.domain.SaleInfo;
import com.woniuxy.service.SaleInfoService;
import com.woniuxy.util.Message;
import com.woniuxy.util.ParseExcel;

@Controller
@RequestMapping("admin/saleInfo")
public class SaleInfoAction {

	@Resource
	private SaleInfoService saleInfoService;

	@RequestMapping("findAll")
	public @ResponseBody Map findAll(Page page) {
		List<SaleInfo> list = saleInfoService.findAll(page);
		int total = saleInfoService.countAll();
		Map map = new HashMap();
		map.put("total", total);
		map.put("rows", list);
		return map;
	}

	@RequestMapping("delete")
	public @ResponseBody Message delete(SaleInfo info) {
		Message msg = null;
		try {
			saleInfoService.delete(info);
			msg = new Message(true, "用户删除成功啦！！！");
		} catch (Exception ex) {
			msg = new Message(false, "用户删除失败啦！！！" + ex);
		}
		return msg;
	}

	@RequestMapping("/saveSaleInfo")
	public String saveSaleInfo() {
		return "redirect:/admin/saleInfo/saveSaleInfo.jsp";
	}

	@RequestMapping("/saveInfomation")
	public String saveInfomation(SaleInfo info) {
		System.out.println("新用户" + info);
		saleInfoService.save(info);
		return null;
	}

	@RequestMapping("/uploadFile")
	public String springUpload(HttpServletRequest request) throws IllegalStateException, IOException {
		// 将当前上下文初始化给 CommonsMutipartResolver （多部分解析器）
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());
		// 检查form中是否有enctype="multipart/form-data"
		if (multipartResolver.isMultipart(request)) {
			// 将request变成多部分request
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
			// 获取multiRequest 中所有的文件名
			Iterator iter = multiRequest.getFileNames();

			while (iter.hasNext()) {
				// 一次遍历所有文件
				MultipartFile file = multiRequest.getFile(iter.next().toString());
				if (file != null) {
					String currentPath = new File("").getCanonicalPath();
					String path = currentPath+"/" + file.getOriginalFilename();
					// 上传
					file.transferTo(new File(path));
					ParseExcel.parseExcel(path);
				}

			}

		}
		return "admin/saleInfo/success";
	}

}
