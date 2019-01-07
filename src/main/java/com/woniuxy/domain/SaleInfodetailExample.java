package com.woniuxy.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SaleInfodetailExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sale_infodetail
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sale_infodetail
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sale_infodetail
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale_infodetail
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public SaleInfodetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale_infodetail
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale_infodetail
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale_infodetail
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale_infodetail
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale_infodetail
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale_infodetail
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale_infodetail
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
     * This method corresponds to the database table sale_infodetail
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
     * This method corresponds to the database table sale_infodetail
     *
     * @mbggenerated Wed Jan 02 18:00:43 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale_infodetail
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
     * This class corresponds to the database table sale_infodetail
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andInfoidIsNull() {
            addCriterion("infoid is null");
            return (Criteria) this;
        }

        public Criteria andInfoidIsNotNull() {
            addCriterion("infoid is not null");
            return (Criteria) this;
        }

        public Criteria andInfoidEqualTo(Integer value) {
            addCriterion("infoid =", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotEqualTo(Integer value) {
            addCriterion("infoid <>", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidGreaterThan(Integer value) {
            addCriterion("infoid >", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("infoid >=", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidLessThan(Integer value) {
            addCriterion("infoid <", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidLessThanOrEqualTo(Integer value) {
            addCriterion("infoid <=", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidIn(List<Integer> values) {
            addCriterion("infoid in", values, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotIn(List<Integer> values) {
            addCriterion("infoid not in", values, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidBetween(Integer value1, Integer value2) {
            addCriterion("infoid between", value1, value2, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("infoid not between", value1, value2, "infoid");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andPlanjoindateIsNull() {
            addCriterion("planjoindate is null");
            return (Criteria) this;
        }

        public Criteria andPlanjoindateIsNotNull() {
            addCriterion("planjoindate is not null");
            return (Criteria) this;
        }

        public Criteria andPlanjoindateEqualTo(Date value) {
            addCriterionForJDBCDate("planjoindate =", value, "planjoindate");
            return (Criteria) this;
        }

        public Criteria andPlanjoindateNotEqualTo(Date value) {
            addCriterionForJDBCDate("planjoindate <>", value, "planjoindate");
            return (Criteria) this;
        }

        public Criteria andPlanjoindateGreaterThan(Date value) {
            addCriterionForJDBCDate("planjoindate >", value, "planjoindate");
            return (Criteria) this;
        }

        public Criteria andPlanjoindateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("planjoindate >=", value, "planjoindate");
            return (Criteria) this;
        }

        public Criteria andPlanjoindateLessThan(Date value) {
            addCriterionForJDBCDate("planjoindate <", value, "planjoindate");
            return (Criteria) this;
        }

        public Criteria andPlanjoindateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("planjoindate <=", value, "planjoindate");
            return (Criteria) this;
        }

        public Criteria andPlanjoindateIn(List<Date> values) {
            addCriterionForJDBCDate("planjoindate in", values, "planjoindate");
            return (Criteria) this;
        }

        public Criteria andPlanjoindateNotIn(List<Date> values) {
            addCriterionForJDBCDate("planjoindate not in", values, "planjoindate");
            return (Criteria) this;
        }

        public Criteria andPlanjoindateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("planjoindate between", value1, value2, "planjoindate");
            return (Criteria) this;
        }

        public Criteria andPlanjoindateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("planjoindate not between", value1, value2, "planjoindate");
            return (Criteria) this;
        }

        public Criteria andRealdateIsNull() {
            addCriterion("realdate is null");
            return (Criteria) this;
        }

        public Criteria andRealdateIsNotNull() {
            addCriterion("realdate is not null");
            return (Criteria) this;
        }

        public Criteria andRealdateEqualTo(Date value) {
            addCriterionForJDBCDate("realdate =", value, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("realdate <>", value, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateGreaterThan(Date value) {
            addCriterionForJDBCDate("realdate >", value, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("realdate >=", value, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateLessThan(Date value) {
            addCriterionForJDBCDate("realdate <", value, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("realdate <=", value, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateIn(List<Date> values) {
            addCriterionForJDBCDate("realdate in", values, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("realdate not in", values, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("realdate between", value1, value2, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("realdate not between", value1, value2, "realdate");
            return (Criteria) this;
        }

        public Criteria andIsexamIsNull() {
            addCriterion("isexam is null");
            return (Criteria) this;
        }

        public Criteria andIsexamIsNotNull() {
            addCriterion("isexam is not null");
            return (Criteria) this;
        }

        public Criteria andIsexamEqualTo(Boolean value) {
            addCriterion("isexam =", value, "isexam");
            return (Criteria) this;
        }

        public Criteria andIsexamNotEqualTo(Boolean value) {
            addCriterion("isexam <>", value, "isexam");
            return (Criteria) this;
        }

        public Criteria andIsexamGreaterThan(Boolean value) {
            addCriterion("isexam >", value, "isexam");
            return (Criteria) this;
        }

        public Criteria andIsexamGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isexam >=", value, "isexam");
            return (Criteria) this;
        }

        public Criteria andIsexamLessThan(Boolean value) {
            addCriterion("isexam <", value, "isexam");
            return (Criteria) this;
        }

        public Criteria andIsexamLessThanOrEqualTo(Boolean value) {
            addCriterion("isexam <=", value, "isexam");
            return (Criteria) this;
        }

        public Criteria andIsexamIn(List<Boolean> values) {
            addCriterion("isexam in", values, "isexam");
            return (Criteria) this;
        }

        public Criteria andIsexamNotIn(List<Boolean> values) {
            addCriterion("isexam not in", values, "isexam");
            return (Criteria) this;
        }

        public Criteria andIsexamBetween(Boolean value1, Boolean value2) {
            addCriterion("isexam between", value1, value2, "isexam");
            return (Criteria) this;
        }

        public Criteria andIsexamNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isexam not between", value1, value2, "isexam");
            return (Criteria) this;
        }

        public Criteria andOrdersetdateIsNull() {
            addCriterion("ordersetdate is null");
            return (Criteria) this;
        }

        public Criteria andOrdersetdateIsNotNull() {
            addCriterion("ordersetdate is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersetdateEqualTo(Date value) {
            addCriterionForJDBCDate("ordersetdate =", value, "ordersetdate");
            return (Criteria) this;
        }

        public Criteria andOrdersetdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ordersetdate <>", value, "ordersetdate");
            return (Criteria) this;
        }

        public Criteria andOrdersetdateGreaterThan(Date value) {
            addCriterionForJDBCDate("ordersetdate >", value, "ordersetdate");
            return (Criteria) this;
        }

        public Criteria andOrdersetdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ordersetdate >=", value, "ordersetdate");
            return (Criteria) this;
        }

        public Criteria andOrdersetdateLessThan(Date value) {
            addCriterionForJDBCDate("ordersetdate <", value, "ordersetdate");
            return (Criteria) this;
        }

        public Criteria andOrdersetdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ordersetdate <=", value, "ordersetdate");
            return (Criteria) this;
        }

        public Criteria andOrdersetdateIn(List<Date> values) {
            addCriterionForJDBCDate("ordersetdate in", values, "ordersetdate");
            return (Criteria) this;
        }

        public Criteria andOrdersetdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ordersetdate not in", values, "ordersetdate");
            return (Criteria) this;
        }

        public Criteria andOrdersetdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ordersetdate between", value1, value2, "ordersetdate");
            return (Criteria) this;
        }

        public Criteria andOrdersetdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ordersetdate not between", value1, value2, "ordersetdate");
            return (Criteria) this;
        }

        public Criteria andClassesdateIsNull() {
            addCriterion("classesdate is null");
            return (Criteria) this;
        }

        public Criteria andClassesdateIsNotNull() {
            addCriterion("classesdate is not null");
            return (Criteria) this;
        }

        public Criteria andClassesdateEqualTo(Date value) {
            addCriterionForJDBCDate("classesdate =", value, "classesdate");
            return (Criteria) this;
        }

        public Criteria andClassesdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("classesdate <>", value, "classesdate");
            return (Criteria) this;
        }

        public Criteria andClassesdateGreaterThan(Date value) {
            addCriterionForJDBCDate("classesdate >", value, "classesdate");
            return (Criteria) this;
        }

        public Criteria andClassesdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("classesdate >=", value, "classesdate");
            return (Criteria) this;
        }

        public Criteria andClassesdateLessThan(Date value) {
            addCriterionForJDBCDate("classesdate <", value, "classesdate");
            return (Criteria) this;
        }

        public Criteria andClassesdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("classesdate <=", value, "classesdate");
            return (Criteria) this;
        }

        public Criteria andClassesdateIn(List<Date> values) {
            addCriterionForJDBCDate("classesdate in", values, "classesdate");
            return (Criteria) this;
        }

        public Criteria andClassesdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("classesdate not in", values, "classesdate");
            return (Criteria) this;
        }

        public Criteria andClassesdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("classesdate between", value1, value2, "classesdate");
            return (Criteria) this;
        }

        public Criteria andClassesdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("classesdate not between", value1, value2, "classesdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateIsNull() {
            addCriterion("submitdate is null");
            return (Criteria) this;
        }

        public Criteria andSubmitdateIsNotNull() {
            addCriterion("submitdate is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitdateEqualTo(Date value) {
            addCriterionForJDBCDate("submitdate =", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("submitdate <>", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateGreaterThan(Date value) {
            addCriterionForJDBCDate("submitdate >", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("submitdate >=", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateLessThan(Date value) {
            addCriterionForJDBCDate("submitdate <", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("submitdate <=", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateIn(List<Date> values) {
            addCriterionForJDBCDate("submitdate in", values, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("submitdate not in", values, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("submitdate between", value1, value2, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("submitdate not between", value1, value2, "submitdate");
            return (Criteria) this;
        }

        public Criteria andJoindateIsNull() {
            addCriterion("joindate is null");
            return (Criteria) this;
        }

        public Criteria andJoindateIsNotNull() {
            addCriterion("joindate is not null");
            return (Criteria) this;
        }

        public Criteria andJoindateEqualTo(Date value) {
            addCriterionForJDBCDate("joindate =", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateNotEqualTo(Date value) {
            addCriterionForJDBCDate("joindate <>", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateGreaterThan(Date value) {
            addCriterionForJDBCDate("joindate >", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("joindate >=", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateLessThan(Date value) {
            addCriterionForJDBCDate("joindate <", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("joindate <=", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateIn(List<Date> values) {
            addCriterionForJDBCDate("joindate in", values, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateNotIn(List<Date> values) {
            addCriterionForJDBCDate("joindate not in", values, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("joindate between", value1, value2, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("joindate not between", value1, value2, "joindate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sale_infodetail
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
     * This class corresponds to the database table sale_infodetail
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