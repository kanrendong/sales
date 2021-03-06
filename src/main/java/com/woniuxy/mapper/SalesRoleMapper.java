package com.woniuxy.mapper;

import com.woniuxy.domain.SalesRole;
import com.woniuxy.domain.SalesRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_role
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    int countByExample(SalesRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_role
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    int deleteByExample(SalesRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_role
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    int deleteByPrimaryKey(Integer roleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_role
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    int insert(SalesRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_role
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    int insertSelective(SalesRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_role
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    List<SalesRole> selectByExample(SalesRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_role
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    SalesRole selectByPrimaryKey(Integer roleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_role
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    int updateByExampleSelective(@Param("record") SalesRole record, @Param("example") SalesRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_role
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    int updateByExample(@Param("record") SalesRole record, @Param("example") SalesRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_role
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    int updateByPrimaryKeySelective(SalesRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_role
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    int updateByPrimaryKey(SalesRole record);
}