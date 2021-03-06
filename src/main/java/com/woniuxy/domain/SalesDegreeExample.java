package com.woniuxy.domain;

import java.util.ArrayList;
import java.util.List;

public class SalesDegreeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sales_degree
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sales_degree
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sales_degree
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_degree
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public SalesDegreeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_degree
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_degree
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_degree
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_degree
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_degree
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_degree
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_degree
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
     * This method corresponds to the database table sales_degree
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
     * This method corresponds to the database table sales_degree
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_degree
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
     * This class corresponds to the database table sales_degree
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

        public Criteria andDegreeidIsNull() {
            addCriterion("degreeid is null");
            return (Criteria) this;
        }

        public Criteria andDegreeidIsNotNull() {
            addCriterion("degreeid is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeidEqualTo(Integer value) {
            addCriterion("degreeid =", value, "degreeid");
            return (Criteria) this;
        }

        public Criteria andDegreeidNotEqualTo(Integer value) {
            addCriterion("degreeid <>", value, "degreeid");
            return (Criteria) this;
        }

        public Criteria andDegreeidGreaterThan(Integer value) {
            addCriterion("degreeid >", value, "degreeid");
            return (Criteria) this;
        }

        public Criteria andDegreeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("degreeid >=", value, "degreeid");
            return (Criteria) this;
        }

        public Criteria andDegreeidLessThan(Integer value) {
            addCriterion("degreeid <", value, "degreeid");
            return (Criteria) this;
        }

        public Criteria andDegreeidLessThanOrEqualTo(Integer value) {
            addCriterion("degreeid <=", value, "degreeid");
            return (Criteria) this;
        }

        public Criteria andDegreeidIn(List<Integer> values) {
            addCriterion("degreeid in", values, "degreeid");
            return (Criteria) this;
        }

        public Criteria andDegreeidNotIn(List<Integer> values) {
            addCriterion("degreeid not in", values, "degreeid");
            return (Criteria) this;
        }

        public Criteria andDegreeidBetween(Integer value1, Integer value2) {
            addCriterion("degreeid between", value1, value2, "degreeid");
            return (Criteria) this;
        }

        public Criteria andDegreeidNotBetween(Integer value1, Integer value2) {
            addCriterion("degreeid not between", value1, value2, "degreeid");
            return (Criteria) this;
        }

        public Criteria andDegreenameIsNull() {
            addCriterion("degreename is null");
            return (Criteria) this;
        }

        public Criteria andDegreenameIsNotNull() {
            addCriterion("degreename is not null");
            return (Criteria) this;
        }

        public Criteria andDegreenameEqualTo(String value) {
            addCriterion("degreename =", value, "degreename");
            return (Criteria) this;
        }

        public Criteria andDegreenameNotEqualTo(String value) {
            addCriterion("degreename <>", value, "degreename");
            return (Criteria) this;
        }

        public Criteria andDegreenameGreaterThan(String value) {
            addCriterion("degreename >", value, "degreename");
            return (Criteria) this;
        }

        public Criteria andDegreenameGreaterThanOrEqualTo(String value) {
            addCriterion("degreename >=", value, "degreename");
            return (Criteria) this;
        }

        public Criteria andDegreenameLessThan(String value) {
            addCriterion("degreename <", value, "degreename");
            return (Criteria) this;
        }

        public Criteria andDegreenameLessThanOrEqualTo(String value) {
            addCriterion("degreename <=", value, "degreename");
            return (Criteria) this;
        }

        public Criteria andDegreenameLike(String value) {
            addCriterion("degreename like", value, "degreename");
            return (Criteria) this;
        }

        public Criteria andDegreenameNotLike(String value) {
            addCriterion("degreename not like", value, "degreename");
            return (Criteria) this;
        }

        public Criteria andDegreenameIn(List<String> values) {
            addCriterion("degreename in", values, "degreename");
            return (Criteria) this;
        }

        public Criteria andDegreenameNotIn(List<String> values) {
            addCriterion("degreename not in", values, "degreename");
            return (Criteria) this;
        }

        public Criteria andDegreenameBetween(String value1, String value2) {
            addCriterion("degreename between", value1, value2, "degreename");
            return (Criteria) this;
        }

        public Criteria andDegreenameNotBetween(String value1, String value2) {
            addCriterion("degreename not between", value1, value2, "degreename");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sales_degree
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
     * This class corresponds to the database table sales_degree
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