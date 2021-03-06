package com.woniuxy.mapper;

import com.woniuxy.domain.SalesTreeRoleExample;
import com.woniuxy.domain.SalesTreeRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesTreeRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_tree_role
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    int countByExample(SalesTreeRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_tree_role
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    int deleteByExample(SalesTreeRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_tree_role
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    int deleteByPrimaryKey(SalesTreeRoleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_tree_role
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    int insert(SalesTreeRoleKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_tree_role
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    int insertSelective(SalesTreeRoleKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_tree_role
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    List<SalesTreeRoleKey> selectByExample(SalesTreeRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_tree_role
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    int updateByExampleSelective(@Param("record") SalesTreeRoleKey record, @Param("example") SalesTreeRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_tree_role
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    int updateByExample(@Param("record") SalesTreeRoleKey record, @Param("example") SalesTreeRoleExample example);
}