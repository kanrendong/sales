package com.woniuxy.domain;

import java.util.ArrayList;
import java.util.List;

public class SalesRelatedpersonExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sales_relatedperson
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sales_relatedperson
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sales_relatedperson
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_relatedperson
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public SalesRelatedpersonExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_relatedperson
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_relatedperson
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_relatedperson
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_relatedperson
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_relatedperson
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_relatedperson
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_relatedperson
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
     * This method corresponds to the database table sales_relatedperson
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
     * This method corresponds to the database table sales_relatedperson
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_relatedperson
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
     * This class corresponds to the database table sales_relatedperson
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

        public Criteria andRelatedpersonidIsNull() {
            addCriterion("relatedpersonid is null");
            return (Criteria) this;
        }

        public Criteria andRelatedpersonidIsNotNull() {
            addCriterion("relatedpersonid is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedpersonidEqualTo(Integer value) {
            addCriterion("relatedpersonid =", value, "relatedpersonid");
            return (Criteria) this;
        }

        public Criteria andRelatedpersonidNotEqualTo(Integer value) {
            addCriterion("relatedpersonid <>", value, "relatedpersonid");
            return (Criteria) this;
        }

        public Criteria andRelatedpersonidGreaterThan(Integer value) {
            addCriterion("relatedpersonid >", value, "relatedpersonid");
            return (Criteria) this;
        }

        public Criteria andRelatedpersonidGreaterThanOrEqualTo(Integer value) {
            addCriterion("relatedpersonid >=", value, "relatedpersonid");
            return (Criteria) this;
        }

        public Criteria andRelatedpersonidLessThan(Integer value) {
            addCriterion("relatedpersonid <", value, "relatedpersonid");
            return (Criteria) this;
        }

        public Criteria andRelatedpersonidLessThanOrEqualTo(Integer value) {
            addCriterion("relatedpersonid <=", value, "relatedpersonid");
            return (Criteria) this;
        }

        public Criteria andRelatedpersonidIn(List<Integer> values) {
            addCriterion("relatedpersonid in", values, "relatedpersonid");
            return (Criteria) this;
        }

        public Criteria andRelatedpersonidNotIn(List<Integer> values) {
            addCriterion("relatedpersonid not in", values, "relatedpersonid");
            return (Criteria) this;
        }

        public Criteria andRelatedpersonidBetween(Integer value1, Integer value2) {
            addCriterion("relatedpersonid between", value1, value2, "relatedpersonid");
            return (Criteria) this;
        }

        public Criteria andRelatedpersonidNotBetween(Integer value1, Integer value2) {
            addCriterion("relatedpersonid not between", value1, value2, "relatedpersonid");
            return (Criteria) this;
        }

        public Criteria andRelatedpersonnameIsNull() {
            addCriterion("relatedpersonname is null");
            return (Criteria) this;
        }

        public Criteria andRelatedpersonnameIsNotNull() {
            addCriterion("relatedpersonname is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedpersonnameEqualTo(String value) {
            addCriterion("relatedpersonname =", value, "relatedpersonname");
            return (Criteria) this;
        }

        public Criteria andRelatedpersonnameNotEqualTo(String value) {
            addCriterion("relatedpersonname <>", value, "relatedpersonname");
            return (Criteria) this;
        }

        public Criteria andRelatedpersonnameGreaterThan(String value) {
            addCriterion("relatedpersonname >", value, "relatedpersonname");
            return (Criteria) this;
        }

        public Criteria andRelatedpersonnameGreaterThanOrEqualTo(String value) {
            addCriterion("relatedpersonname >=", value, "relatedpersonname");
            return (Criteria) this;
        }

        public Criteria andRelatedpersonnameLessThan(String value) {
            addCriterion("relatedpersonname <", value, "relatedpersonname");
            return (Criteria) this;
        }

        public Criteria andRelatedpersonnameLessThanOrEqualTo(String value) {
            addCriterion("relatedpersonname <=", value, "relatedpersonname");
            return (Criteria) this;
        }

        public Criteria andRelatedpersonnameLike(String value) {
            addCriterion("relatedpersonname like", value, "relatedpersonname");
            return (Criteria) this;
        }

        public Criteria andRelatedpersonnameNotLike(String value) {
            addCriterion("relatedpersonname not like", value, "relatedpersonname");
            return (Criteria) this;
        }

        public Criteria andRelatedpersonnameIn(List<String> values) {
            addCriterion("relatedpersonname in", values, "relatedpersonname");
            return (Criteria) this;
        }

        public Criteria andRelatedpersonnameNotIn(List<String> values) {
            addCriterion("relatedpersonname not in", values, "relatedpersonname");
            return (Criteria) this;
        }

        public Criteria andRelatedpersonnameBetween(String value1, String value2) {
            addCriterion("relatedpersonname between", value1, value2, "relatedpersonname");
            return (Criteria) this;
        }

        public Criteria andRelatedpersonnameNotBetween(String value1, String value2) {
            addCriterion("relatedpersonname not between", value1, value2, "relatedpersonname");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(Boolean value) {
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(Boolean value) {
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(Boolean value) {
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(Boolean value) {
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(Boolean value) {
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<Boolean> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<Boolean> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(Boolean value1, Boolean value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("role not between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("isdelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isdelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Boolean value) {
            addCriterion("isdelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Boolean value) {
            addCriterion("isdelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Boolean value) {
            addCriterion("isdelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isdelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Boolean value) {
            addCriterion("isdelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("isdelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Boolean> values) {
            addCriterion("isdelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Boolean> values) {
            addCriterion("isdelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("isdelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isdelete not between", value1, value2, "isdelete");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sales_relatedperson
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
     * This class corresponds to the database table sales_relatedperson
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