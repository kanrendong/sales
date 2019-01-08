package com.woniuxy.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.domain.Page;
import com.woniuxy.domain.SaleVisit;
import com.woniuxy.mapper.SaleVisitMapper;

@Service
public class SaleVisitService {

	@Resource
	private SaleVisitMapper mapper;
	@Transactional
	public void save(SaleVisit visit) {
		mapper.insert(visit);
	}
	@Transactional
	public void delete(SaleVisit visit) {
		mapper.deleteByPrimaryKey(visit.getVisitid());
	}
	@Transactional
	public void update(SaleVisit visit) {
		mapper.updateByPrimaryKey(visit);
	}
	@Transactional(readOnly=true)
	public SaleVisit findById(SaleVisit visit) {
		return mapper.selectByPrimaryKey(visit.getVisitid());
	}
	@Transactional(readOnly=true)
	public List findAll(Page page) {
		return mapper.selectByExample(null, new RowBounds(page.getBegin(),page.getRows()));
	}
	@Transactional(readOnly=true)
	public int countAll() {
		return mapper.countByExample(null);
	}
}
