package com.woniuxy.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalesMessageExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sales_message
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sales_message
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sales_message
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_message
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public SalesMessageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_message
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_message
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_message
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_message
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_message
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_message
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_message
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
     * This method corresponds to the database table sales_message
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
     * This method corresponds to the database table sales_message
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_message
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
     * This class corresponds to the database table sales_message
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

        public Criteria andMessageidIsNull() {
            addCriterion("messageid is null");
            return (Criteria) this;
        }

        public Criteria andMessageidIsNotNull() {
            addCriterion("messageid is not null");
            return (Criteria) this;
        }

        public Criteria andMessageidEqualTo(Integer value) {
            addCriterion("messageid =", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotEqualTo(Integer value) {
            addCriterion("messageid <>", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidGreaterThan(Integer value) {
            addCriterion("messageid >", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("messageid >=", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLessThan(Integer value) {
            addCriterion("messageid <", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLessThanOrEqualTo(Integer value) {
            addCriterion("messageid <=", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidIn(List<Integer> values) {
            addCriterion("messageid in", values, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotIn(List<Integer> values) {
            addCriterion("messageid not in", values, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidBetween(Integer value1, Integer value2) {
            addCriterion("messageid between", value1, value2, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotBetween(Integer value1, Integer value2) {
            addCriterion("messageid not between", value1, value2, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessagethemeIsNull() {
            addCriterion("messagetheme is null");
            return (Criteria) this;
        }

        public Criteria andMessagethemeIsNotNull() {
            addCriterion("messagetheme is not null");
            return (Criteria) this;
        }

        public Criteria andMessagethemeEqualTo(String value) {
            addCriterion("messagetheme =", value, "messagetheme");
            return (Criteria) this;
        }

        public Criteria andMessagethemeNotEqualTo(String value) {
            addCriterion("messagetheme <>", value, "messagetheme");
            return (Criteria) this;
        }

        public Criteria andMessagethemeGreaterThan(String value) {
            addCriterion("messagetheme >", value, "messagetheme");
            return (Criteria) this;
        }

        public Criteria andMessagethemeGreaterThanOrEqualTo(String value) {
            addCriterion("messagetheme >=", value, "messagetheme");
            return (Criteria) this;
        }

        public Criteria andMessagethemeLessThan(String value) {
            addCriterion("messagetheme <", value, "messagetheme");
            return (Criteria) this;
        }

        public Criteria andMessagethemeLessThanOrEqualTo(String value) {
            addCriterion("messagetheme <=", value, "messagetheme");
            return (Criteria) this;
        }

        public Criteria andMessagethemeLike(String value) {
            addCriterion("messagetheme like", value, "messagetheme");
            return (Criteria) this;
        }

        public Criteria andMessagethemeNotLike(String value) {
            addCriterion("messagetheme not like", value, "messagetheme");
            return (Criteria) this;
        }

        public Criteria andMessagethemeIn(List<String> values) {
            addCriterion("messagetheme in", values, "messagetheme");
            return (Criteria) this;
        }

        public Criteria andMessagethemeNotIn(List<String> values) {
            addCriterion("messagetheme not in", values, "messagetheme");
            return (Criteria) this;
        }

        public Criteria andMessagethemeBetween(String value1, String value2) {
            addCriterion("messagetheme between", value1, value2, "messagetheme");
            return (Criteria) this;
        }

        public Criteria andMessagethemeNotBetween(String value1, String value2) {
            addCriterion("messagetheme not between", value1, value2, "messagetheme");
            return (Criteria) this;
        }

        public Criteria andMessagetimeIsNull() {
            addCriterion("messagetime is null");
            return (Criteria) this;
        }

        public Criteria andMessagetimeIsNotNull() {
            addCriterion("messagetime is not null");
            return (Criteria) this;
        }

        public Criteria andMessagetimeEqualTo(Date value) {
            addCriterion("messagetime =", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeNotEqualTo(Date value) {
            addCriterion("messagetime <>", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeGreaterThan(Date value) {
            addCriterion("messagetime >", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("messagetime >=", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeLessThan(Date value) {
            addCriterion("messagetime <", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeLessThanOrEqualTo(Date value) {
            addCriterion("messagetime <=", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeIn(List<Date> values) {
            addCriterion("messagetime in", values, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeNotIn(List<Date> values) {
            addCriterion("messagetime not in", values, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeBetween(Date value1, Date value2) {
            addCriterion("messagetime between", value1, value2, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeNotBetween(Date value1, Date value2) {
            addCriterion("messagetime not between", value1, value2, "messagetime");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(Integer value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(Integer value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(Integer value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(Integer value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(Integer value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(Integer value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<Integer> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<Integer> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(Integer value1, Integer value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(Integer value1, Integer value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andIssystemIsNull() {
            addCriterion("isSystem is null");
            return (Criteria) this;
        }

        public Criteria andIssystemIsNotNull() {
            addCriterion("isSystem is not null");
            return (Criteria) this;
        }

        public Criteria andIssystemEqualTo(Boolean value) {
            addCriterion("isSystem =", value, "issystem");
            return (Criteria) this;
        }

        public Criteria andIssystemNotEqualTo(Boolean value) {
            addCriterion("isSystem <>", value, "issystem");
            return (Criteria) this;
        }

        public Criteria andIssystemGreaterThan(Boolean value) {
            addCriterion("isSystem >", value, "issystem");
            return (Criteria) this;
        }

        public Criteria andIssystemGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isSystem >=", value, "issystem");
            return (Criteria) this;
        }

        public Criteria andIssystemLessThan(Boolean value) {
            addCriterion("isSystem <", value, "issystem");
            return (Criteria) this;
        }

        public Criteria andIssystemLessThanOrEqualTo(Boolean value) {
            addCriterion("isSystem <=", value, "issystem");
            return (Criteria) this;
        }

        public Criteria andIssystemIn(List<Boolean> values) {
            addCriterion("isSystem in", values, "issystem");
            return (Criteria) this;
        }

        public Criteria andIssystemNotIn(List<Boolean> values) {
            addCriterion("isSystem not in", values, "issystem");
            return (Criteria) this;
        }

        public Criteria andIssystemBetween(Boolean value1, Boolean value2) {
            addCriterion("isSystem between", value1, value2, "issystem");
            return (Criteria) this;
        }

        public Criteria andIssystemNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isSystem not between", value1, value2, "issystem");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sales_message
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
     * This class corresponds to the database table sales_message
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