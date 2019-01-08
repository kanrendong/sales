package com.woniuxy.domain;

import java.util.ArrayList;
import java.util.List;

public class SalesResultExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sales_result
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sales_result
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sales_result
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_result
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public SalesResultExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_result
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_result
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_result
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_result
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_result
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_result
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_result
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_result
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
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
     * This method corresponds to the database table sales_result
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_result
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sales_result
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
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

        public Criteria andResultidIsNull() {
            addCriterion("resultid is null");
            return (Criteria) this;
        }

        public Criteria andResultidIsNotNull() {
            addCriterion("resultid is not null");
            return (Criteria) this;
        }

        public Criteria andResultidEqualTo(Integer value) {
            addCriterion("resultid =", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidNotEqualTo(Integer value) {
            addCriterion("resultid <>", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidGreaterThan(Integer value) {
            addCriterion("resultid >", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidGreaterThanOrEqualTo(Integer value) {
            addCriterion("resultid >=", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidLessThan(Integer value) {
            addCriterion("resultid <", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidLessThanOrEqualTo(Integer value) {
            addCriterion("resultid <=", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidIn(List<Integer> values) {
            addCriterion("resultid in", values, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidNotIn(List<Integer> values) {
            addCriterion("resultid not in", values, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidBetween(Integer value1, Integer value2) {
            addCriterion("resultid between", value1, value2, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidNotBetween(Integer value1, Integer value2) {
            addCriterion("resultid not between", value1, value2, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultnameIsNull() {
            addCriterion("resultname is null");
            return (Criteria) this;
        }

        public Criteria andResultnameIsNotNull() {
            addCriterion("resultname is not null");
            return (Criteria) this;
        }

        public Criteria andResultnameEqualTo(String value) {
            addCriterion("resultname =", value, "resultname");
            return (Criteria) this;
        }

        public Criteria andResultnameNotEqualTo(String value) {
            addCriterion("resultname <>", value, "resultname");
            return (Criteria) this;
        }

        public Criteria andResultnameGreaterThan(String value) {
            addCriterion("resultname >", value, "resultname");
            return (Criteria) this;
        }

        public Criteria andResultnameGreaterThanOrEqualTo(String value) {
            addCriterion("resultname >=", value, "resultname");
            return (Criteria) this;
        }

        public Criteria andResultnameLessThan(String value) {
            addCriterion("resultname <", value, "resultname");
            return (Criteria) this;
        }

        public Criteria andResultnameLessThanOrEqualTo(String value) {
            addCriterion("resultname <=", value, "resultname");
            return (Criteria) this;
        }

        public Criteria andResultnameLike(String value) {
            addCriterion("resultname like", value, "resultname");
            return (Criteria) this;
        }

        public Criteria andResultnameNotLike(String value) {
            addCriterion("resultname not like", value, "resultname");
            return (Criteria) this;
        }

        public Criteria andResultnameIn(List<String> values) {
            addCriterion("resultname in", values, "resultname");
            return (Criteria) this;
        }

        public Criteria andResultnameNotIn(List<String> values) {
            addCriterion("resultname not in", values, "resultname");
            return (Criteria) this;
        }

        public Criteria andResultnameBetween(String value1, String value2) {
            addCriterion("resultname between", value1, value2, "resultname");
            return (Criteria) this;
        }

        public Criteria andResultnameNotBetween(String value1, String value2) {
            addCriterion("resultname not between", value1, value2, "resultname");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sales_result
     *
     * @mbggenerated do_not_delete_during_merge Wed Jan 02 18:00:43 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sales_result
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
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