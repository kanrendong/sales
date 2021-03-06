package com.woniuxy.domain;

import java.io.Serializable;

public class SalesTree implements Serializable{
	
	private Boolean open = true;
	
	public Boolean getOpen() {
        return open;
    }
	public void setOpen(Boolean open) {
        this.open = open;
    }

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sales_tree.treeid
     *
     * @mbggenerated Sat Jan 05 13:36:43 CST 2019
     */
    private Integer treeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sales_tree.treename
     *
     * @mbggenerated Sat Jan 05 13:36:43 CST 2019
     */
    private String treename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sales_tree.treeurl
     *
     * @mbggenerated Sat Jan 05 13:36:43 CST 2019
     */
    private String treeurl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sales_tree.pid
     *
     * @mbggenerated Sat Jan 05 13:36:43 CST 2019
     */
    private Integer pid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sales_tree.icon
     *
     * @mbggenerated Sat Jan 05 13:36:43 CST 2019
     */
    private String icon;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sales_tree.treeid
     *
     * @return the value of sales_tree.treeid
     *
     * @mbggenerated Sat Jan 05 13:36:43 CST 2019
     */
    public Integer getTreeid() {
        return treeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sales_tree.treeid
     *
     * @param treeid the value for sales_tree.treeid
     *
     * @mbggenerated Sat Jan 05 13:36:43 CST 2019
     */
    public void setTreeid(Integer treeid) {
        this.treeid = treeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sales_tree.treename
     *
     * @return the value of sales_tree.treename
     *
     * @mbggenerated Sat Jan 05 13:36:43 CST 2019
     */
    public String getTreename() {
        return treename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sales_tree.treename
     *
     * @param treename the value for sales_tree.treename
     *
     * @mbggenerated Sat Jan 05 13:36:43 CST 2019
     */
    public void setTreename(String treename) {
        this.treename = treename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sales_tree.treeurl
     *
     * @return the value of sales_tree.treeurl
     *
     * @mbggenerated Sat Jan 05 13:36:43 CST 2019
     */
    public String getTreeurl() {
        return treeurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sales_tree.treeurl
     *
     * @param treeurl the value for sales_tree.treeurl
     *
     * @mbggenerated Sat Jan 05 13:36:43 CST 2019
     */
    public void setTreeurl(String treeurl) {
        this.treeurl = treeurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sales_tree.pid
     *
     * @return the value of sales_tree.pid
     *
     * @mbggenerated Sat Jan 05 13:36:43 CST 2019
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sales_tree.pid
     *
     * @param pid the value for sales_tree.pid
     *
     * @mbggenerated Sat Jan 05 13:36:43 CST 2019
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sales_tree.icon
     *
     * @return the value of sales_tree.icon
     *
     * @mbggenerated Sat Jan 05 13:36:43 CST 2019
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sales_tree.icon
     *
     * @param icon the value for sales_tree.icon
     *
     * @mbggenerated Sat Jan 05 13:36:43 CST 2019
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }
	@Override
	public String toString() {
		return "SalesTree [open=" + open + ", treeid=" + treeid + ", treename=" + treename + ", treeurl=" + treeurl
				+ ", pid=" + pid + ", icon=" + icon + "]";
	}
    
}