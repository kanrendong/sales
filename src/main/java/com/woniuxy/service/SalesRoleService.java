package com.woniuxy.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.domain.SalesRole;
import com.woniuxy.domain.SalesTreeRoleExample;
import com.woniuxy.domain.SalesTreeRoleKey;
import com.woniuxy.mapper.SalesRoleMapper;
import com.woniuxy.mapper.SalesTreeRoleMapper;

@Service
public class SalesRoleService {
	@Resource
	private SalesRoleMapper salesRoleMapper;
	@Resource
	private SalesTreeRoleMapper salesTreeRoleMapper;
	
	/**   
	 * @Title: findAll   
	 * @Description: TODO(获取所有角色)   
	 * @param: @return      
	 * @return: List      
	 * @throws   
	 */ 
	@Transactional(readOnly=true)
	public List findAll(){
		return salesRoleMapper.selectByExample(null);
	}
	@Transactional
	public void save(SalesRole role,String ids){
		salesRoleMapper.insert(role);
		String[] id = ids.split(",");
		for (String string : id) {
			SalesTreeRoleKey rt = new SalesTreeRoleKey();
			rt.setRoleid(role.getRoleid());
			rt.setTreeid(Integer.parseInt(string));
			salesTreeRoleMapper.insert(rt);
		}
	}
	@Transactional
	public void update(SalesRole role,String ids){
		salesRoleMapper.updateByPrimaryKey(role);
		//先删除当前这个角色的所有权限
		SalesTreeRoleExample example = new SalesTreeRoleExample();
		example.createCriteria().andRoleidEqualTo(role.getRoleid());
		salesTreeRoleMapper.deleteByExample(example);

		String[] id = ids.split(",");
		for (String string : id) {
			SalesTreeRoleKey rt = new SalesTreeRoleKey();
			rt.setRoleid(role.getRoleid());
			rt.setTreeid(Integer.parseInt(string));
			salesTreeRoleMapper.insert(rt);
		}
	}
	@Transactional(readOnly=true)
	public SalesRole findById(Integer rid){
		return salesRoleMapper.selectByPrimaryKey(rid);
	}
}
