package com.woniuxy.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.domain.SalesUserRoleExample;
import com.woniuxy.domain.SalesUserRoleKey;
import com.woniuxy.domain.SalesUserinfo;
import com.woniuxy.domain.SalesUserinfoExample;
import com.woniuxy.domain.SalesUserinfoExample.Criteria;
import com.woniuxy.mapper.SalesUserRoleMapper;
import com.woniuxy.mapper.SalesUserinfoMapper;

@Service
public class SalesUserinfoService {
	@Resource
	private SalesUserinfoMapper salesUserinfoMapper;
	
	@Resource
	private SalesUserRoleMapper salesUserRoleMapper;
	
	/**   
	 * @Title: login   
	 * @Description: TODO(判断登录)   
	 * @param: @param info
	 * @param: @return      
	 * @return: SalesUserinfo      
	 * @throws   
	 */ 
	public SalesUserinfo login(SalesUserinfo info){
		SalesUserinfoExample example = new SalesUserinfoExample();
		Criteria c = example.createCriteria();
		c.andUnameEqualTo(info.getUname());
		c.andUpassEqualTo(info.getUpass());
		List<SalesUserinfo> list = salesUserinfoMapper.selectByExample(example);
		if(list.size()>0)
			return list.get(0);
		return null;
	}
	
	/**   
	 * @Title: save   
	 * @Description: TODO(增加用户（userinfo userinforole做到都是增加）)   
	 * @param: @param info      
	 * @return: void      
	 * @throws   
	 */ 
	@Transactional
	public void save(SalesUserinfo info,int[] rids){
		salesUserinfoMapper.insert(info);
		if(rids.length>0)
		{
			for (int i : rids) {
				SalesUserRoleKey key = new SalesUserRoleKey();
				key.setUid(info.getUid());
				key.setRoleid(i);
				salesUserRoleMapper.insert(key);
			}
		}
	}
	
	/**   
	 * @Title: update   
	 * @Description: TODO(修改用户)   
	 * @param: @param info
	 * @param: @param rids      
	 * @return: void      
	 * @throws   
	 */ 
	@Transactional
	public void update(SalesUserinfo info,int[] rids){
		salesUserinfoMapper.updateByPrimaryKeySelective(info);
		
		//先删除完这个用户的所有角色
		SalesUserRoleExample example = new SalesUserRoleExample();
		example.createCriteria().andUidEqualTo(info.getUid());
		salesUserRoleMapper.deleteByExample(example);
		//先删除完这个用户的所有角色
		
		if(rids.length>0)
		{
			for (int i : rids) {
				SalesUserRoleKey key = new SalesUserRoleKey();
				key.setUid(info.getUid());
				key.setRoleid(i);
				salesUserRoleMapper.insert(key);
			}
		}
	}
	@Transactional(readOnly=true)
	public List findAll(){
		return salesUserinfoMapper.selectByExample(null);
	}
	
	@Transactional(readOnly=true)
	public SalesUserinfo findById(Integer uid){
		return salesUserinfoMapper.selectByPrimaryKey(uid);
	}
}
