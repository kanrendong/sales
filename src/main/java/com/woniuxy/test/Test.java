package com.woniuxy.test;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.woniuxy.domain.Page;
import com.woniuxy.domain.SalesTree;
import com.woniuxy.mapper.SaleInfoMapper;
import com.woniuxy.service.SaleInfoService;
import com.woniuxy.service.SalesTreeService;


public class Test {
	public static void main(String[] args) {
		BeanFactory f = new ClassPathXmlApplicationContext("applicationContext*.xml");
		SalesTreeService s = f.getBean(SalesTreeService.class);
		
		List<SalesTree> list = s.findAll();
		
		for (SalesTree salesTree : list) {
			System.out.println(salesTree);
		}
		
	}
}
