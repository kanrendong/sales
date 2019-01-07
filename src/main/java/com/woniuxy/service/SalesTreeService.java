package com.woniuxy.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.mapper.SalesTreeMapper;

/**   
 * @ClassName:  TreeService.java  
 * @Description:TODO(返回整个树)   
 * @author: x 
 * @date:   2019年1月3日 下午9:09:03  
 *     
 */  
@Service
public class SalesTreeService {
	
	@Resource
	private SalesTreeMapper salesTreeMapper;
	
	@Transactional(readOnly=true)
	public List findAll() {
		return salesTreeMapper.selectByExample(null);
	}
	/**   
	 * @Title: findAll   
	 * @Description: TODO(根据用户的id返回树)   
	 * @param: @return      
	 * @return: List      
	 * @throws   
	 */ 
	@Transactional(readOnly=true)
	public List findAll(Integer uid){
		return salesTreeMapper.findByUid(uid);
		
	}

}
