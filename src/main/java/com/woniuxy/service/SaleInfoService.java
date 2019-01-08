package com.woniuxy.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.domain.Page;
import com.woniuxy.domain.SaleInfo;
import com.woniuxy.domain.SaleInfoExample;
import com.woniuxy.domain.SaleInfoExample.Criteria;
import com.woniuxy.mapper.SaleInfoMapper;

@Service
public class SaleInfoService {
	
	@Resource
	private SaleInfoMapper saleInfoMapper;
	
	@Transactional
	public void save(SaleInfo info){
		saleInfoMapper.insert(info);
	}
	@Transactional
	public void update(SaleInfo info){
		saleInfoMapper.updateByPrimaryKey(info);
	}
	@Transactional
	public void delete(SaleInfo info){
		saleInfoMapper.deleteByPrimaryKey(info.getInfoid());
	}
	@Transactional(readOnly=true)
	public SaleInfo findById(Integer infoid){
		return saleInfoMapper.selectByPrimaryKey(infoid);
	}
	@Transactional(readOnly=true)
	public List findAll(Page page){
		return saleInfoMapper.selectByExample(null,new RowBounds(page.getBegin(), page.getRows()));
	}
	
	@Transactional(readOnly=true)
	public int countAll(){
		return saleInfoMapper.countByExample(null);
	}
	
	public static void main(String[] args) {
		SaleInfoService s = new SaleInfoService();
		SaleInfo info = new SaleInfo();
		info.setInfoid(50420);
		s.delete(info);
	}
	
}
