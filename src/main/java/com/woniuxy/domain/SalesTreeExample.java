package com.woniuxy.domain;

import java.util.ArrayList;
import java.util.List;

public class SalesTreeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sales_tree
     *
     * @mbggenerated Sat Jan 05 13:36:43 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sales_tree
     *
     * @mbggenerated Sat Jan 05 13:36:43 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sales_tree
     *
     * @mbggenerated Sat Jan 05 13:36:43 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_tree
     *
     * @mbggenerated Sat Jan 05 13:36:43 CST 2019
     */
    public SalesTreeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_tree
     *
     * @mbggenerated Sat Jan 05 13:36:43 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_tree
     *
     * @mbggenerated Sat Jan 05 13:36:43 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_tree
     *
     * @mbggenerated Sat Jan 05 13:36:43 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_tree
     *
     * @mbggenerated Sat Jan 05 13:36:43 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_tree
     *
     * @mbggenerated Sat Jan 05 13:36:43 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_tree
     *
     * @mbggenerated Sat Jan 05 13:36:43 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_tree
     *
     * @mbggenerated Sat Jan 05 13:36:43 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_tree
     *
     * @mbggenerated Sat Jan 05 13:36:43 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_tree
     *
     * @mbggenerated Sat Jan 05 13:36:43 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_tree
     *
     * @mbggenerated Sat Jan 05 13:36:43 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sales_tree
     *
     * @mbggenerated Sat Jan 05 13:36:43 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTreeidIsNull() {
            addCriterion("treeid is null");
            return (Criteria) this;
        }

        public Criteria andTreeidIsNotNull() {
            addCriterion("treeid is not null");
            return (Criteria) this;
        }

        public Criteria andTreeidEqualTo(Integer value) {
            addCriterion("treeid =", value, "treeid");
            return (Criteria) this;
        }

        public Criteria andTreeidNotEqualTo(Integer value) {
            addCriterion("treeid <>", value, "treeid");
            return (Criteria) this;
        }

        public Criteria andTreeidGreaterThan(Integer value) {
            addCriterion("treeid >", value, "treeid");
            return (Criteria) this;
        }

        public Criteria andTreeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("treeid >=", value, "treeid");
            return (Criteria) this;
        }

        public Criteria andTreeidLessThan(Integer value) {
            addCriterion("treeid <", value, "treeid");
            return (Criteria) this;
        }

        public Criteria andTreeidLessThanOrEqualTo(Integer value) {
            addCriterion("treeid <=", value, "treeid");
            return (Criteria) this;
        }

        public Criteria andTreeidIn(List<Integer> values) {
            addCriterion("treeid in", values, "treeid");
            return (Criteria) this;
        }

        public Criteria andTreeidNotIn(List<Integer> values) {
            addCriterion("treeid not in", values, "treeid");
            return (Criteria) this;
        }

        public Criteria andTreeidBetween(Integer value1, Integer value2) {
            addCriterion("treeid between", value1, value2, "treeid");
            return (Criteria) this;
        }

        public Criteria andTreeidNotBetween(Integer value1, Integer value2) {
            addCriterion("treeid not between", value1, value2, "treeid");
            return (Criteria) this;
        }

        public Criteria andTreenameIsNull() {
            addCriterion("treename is null");
            return (Criteria) this;
        }

        public Criteria andTreenameIsNotNull() {
            addCriterion("treename is not null");
            return (Criteria) this;
        }

        public Criteria andTreenameEqualTo(String value) {
            addCriterion("treename =", value, "treename");
            return (Criteria) this;
        }

        public Criteria andTreenameNotEqualTo(String value) {
            addCriterion("treename <>", value, "treename");
            return (Criteria) this;
        }

        public Criteria andTreenameGreaterThan(String value) {
            addCriterion("treename >", value, "treename");
            return (Criteria) this;
        }

        public Criteria andTreenameGreaterThanOrEqualTo(String value) {
            addCriterion("treename >=", value, "treename");
            return (Criteria) this;
        }

        public Criteria andTreenameLessThan(String value) {
            addCriterion("treename <", value, "treename");
            return (Criteria) this;
        }

        public Criteria andTreenameLessThanOrEqualTo(String value) {
            addCriterion("treename <=", value, "treename");
            return (Criteria) this;
        }

        public Criteria andTreenameLike(String value) {
            addCriterion("treename like", value, "treename");
            return (Criteria) this;
        }

        public Criteria andTreenameNotLike(String value) {
            addCriterion("treename not like", value, "treename");
            return (Criteria) this;
        }

        public Criteria andTreenameIn(List<String> values) {
            addCriterion("treename in", values, "treename");
            return (Criteria) this;
        }

        public Criteria andTreenameNotIn(List<String> values) {
            addCriterion("treename not in", values, "treename");
            return (Criteria) this;
        }

        public Criteria andTreenameBetween(String value1, String value2) {
            addCriterion("treename between", value1, value2, "treename");
            return (Criteria) this;
        }

        public Criteria andTreenameNotBetween(String value1, String value2) {
            addCriterion("treename not between", value1, value2, "treename");
            return (Criteria) this;
        }

        public Criteria andTreeurlIsNull() {
            addCriterion("treeurl is null");
            return (Criteria) this;
        }

        public Criteria andTreeurlIsNotNull() {
            addCriterion("treeurl is not null");
            return (Criteria) this;
        }

        public Criteria andTreeurlEqualTo(String value) {
            addCriterion("treeurl =", value, "treeurl");
            return (Criteria) this;
        }

        public Criteria andTreeurlNotEqualTo(String value) {
            addCriterion("treeurl <>", value, "treeurl");
            return (Criteria) this;
        }

        public Criteria andTreeurlGreaterThan(String value) {
            addCriterion("treeurl >", value, "treeurl");
            return (Criteria) this;
        }

        public Criteria andTreeurlGreaterThanOrEqualTo(String value) {
            addCriterion("treeurl >=", value, "treeurl");
            return (Criteria) this;
        }

        public Criteria andTreeurlLessThan(String value) {
            addCriterion("treeurl <", value, "treeurl");
            return (Criteria) this;
        }

        public Criteria andTreeurlLessThanOrEqualTo(String value) {
            addCriterion("treeurl <=", value, "treeurl");
            return (Criteria) this;
        }

        public Criteria andTreeurlLike(String value) {
            addCriterion("treeurl like", value, "treeurl");
            return (Criteria) this;
        }

        public Criteria andTreeurlNotLike(String value) {
            addCriterion("treeurl not like", value, "treeurl");
            return (Criteria) this;
        }

        public Criteria andTreeurlIn(List<String> values) {
            addCriterion("treeurl in", values, "treeurl");
            return (Criteria) this;
        }

        public Criteria andTreeurlNotIn(List<String> values) {
            addCriterion("treeurl not in", values, "treeurl");
            return (Criteria) this;
        }

        public Criteria andTreeurlBetween(String value1, String value2) {
            addCriterion("treeurl between", value1, value2, "treeurl");
            return (Criteria) this;
        }

        public Criteria andTreeurlNotBetween(String value1, String value2) {
            addCriterion("treeurl not between", value1, value2, "treeurl");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sales_tree
     *
     * @mbggenerated do_not_delete_during_merge Sat Jan 05 13:36:43 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sales_tree
     *
     * @mbggenerated Sat Jan 05 13:36:43 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}