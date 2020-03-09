package com.gzwl.xyh.pojo.college;

import java.util.ArrayList;
import java.util.List;

public class CollegeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollegeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andCollegeIdIsNull() {
            addCriterion("college_id is null");
            return (Criteria) this;
        }

        public Criteria andCollegeIdIsNotNull() {
            addCriterion("college_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeIdEqualTo(String value) {
            addCriterion("college_id =", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotEqualTo(String value) {
            addCriterion("college_id <>", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdGreaterThan(String value) {
            addCriterion("college_id >", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdGreaterThanOrEqualTo(String value) {
            addCriterion("college_id >=", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdLessThan(String value) {
            addCriterion("college_id <", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdLessThanOrEqualTo(String value) {
            addCriterion("college_id <=", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdLike(String value) {
            addCriterion("college_id like", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotLike(String value) {
            addCriterion("college_id not like", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdIn(List<String> values) {
            addCriterion("college_id in", values, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotIn(List<String> values) {
            addCriterion("college_id not in", values, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdBetween(String value1, String value2) {
            addCriterion("college_id between", value1, value2, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotBetween(String value1, String value2) {
            addCriterion("college_id not between", value1, value2, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeSnIsNull() {
            addCriterion("college_sn is null");
            return (Criteria) this;
        }

        public Criteria andCollegeSnIsNotNull() {
            addCriterion("college_sn is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeSnEqualTo(String value) {
            addCriterion("college_sn =", value, "collegeSn");
            return (Criteria) this;
        }

        public Criteria andCollegeSnNotEqualTo(String value) {
            addCriterion("college_sn <>", value, "collegeSn");
            return (Criteria) this;
        }

        public Criteria andCollegeSnGreaterThan(String value) {
            addCriterion("college_sn >", value, "collegeSn");
            return (Criteria) this;
        }

        public Criteria andCollegeSnGreaterThanOrEqualTo(String value) {
            addCriterion("college_sn >=", value, "collegeSn");
            return (Criteria) this;
        }

        public Criteria andCollegeSnLessThan(String value) {
            addCriterion("college_sn <", value, "collegeSn");
            return (Criteria) this;
        }

        public Criteria andCollegeSnLessThanOrEqualTo(String value) {
            addCriterion("college_sn <=", value, "collegeSn");
            return (Criteria) this;
        }

        public Criteria andCollegeSnLike(String value) {
            addCriterion("college_sn like", value, "collegeSn");
            return (Criteria) this;
        }

        public Criteria andCollegeSnNotLike(String value) {
            addCriterion("college_sn not like", value, "collegeSn");
            return (Criteria) this;
        }

        public Criteria andCollegeSnIn(List<String> values) {
            addCriterion("college_sn in", values, "collegeSn");
            return (Criteria) this;
        }

        public Criteria andCollegeSnNotIn(List<String> values) {
            addCriterion("college_sn not in", values, "collegeSn");
            return (Criteria) this;
        }

        public Criteria andCollegeSnBetween(String value1, String value2) {
            addCriterion("college_sn between", value1, value2, "collegeSn");
            return (Criteria) this;
        }

        public Criteria andCollegeSnNotBetween(String value1, String value2) {
            addCriterion("college_sn not between", value1, value2, "collegeSn");
            return (Criteria) this;
        }

        public Criteria andCollegeNameIsNull() {
            addCriterion("college_name is null");
            return (Criteria) this;
        }

        public Criteria andCollegeNameIsNotNull() {
            addCriterion("college_name is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeNameEqualTo(String value) {
            addCriterion("college_name =", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotEqualTo(String value) {
            addCriterion("college_name <>", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameGreaterThan(String value) {
            addCriterion("college_name >", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameGreaterThanOrEqualTo(String value) {
            addCriterion("college_name >=", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameLessThan(String value) {
            addCriterion("college_name <", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameLessThanOrEqualTo(String value) {
            addCriterion("college_name <=", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameLike(String value) {
            addCriterion("college_name like", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotLike(String value) {
            addCriterion("college_name not like", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameIn(List<String> values) {
            addCriterion("college_name in", values, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotIn(List<String> values) {
            addCriterion("college_name not in", values, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameBetween(String value1, String value2) {
            addCriterion("college_name between", value1, value2, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotBetween(String value1, String value2) {
            addCriterion("college_name not between", value1, value2, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeParentIdIsNull() {
            addCriterion("college_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andCollegeParentIdIsNotNull() {
            addCriterion("college_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeParentIdEqualTo(String value) {
            addCriterion("college_parent_id =", value, "collegeParentId");
            return (Criteria) this;
        }

        public Criteria andCollegeParentIdNotEqualTo(String value) {
            addCriterion("college_parent_id <>", value, "collegeParentId");
            return (Criteria) this;
        }

        public Criteria andCollegeParentIdGreaterThan(String value) {
            addCriterion("college_parent_id >", value, "collegeParentId");
            return (Criteria) this;
        }

        public Criteria andCollegeParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("college_parent_id >=", value, "collegeParentId");
            return (Criteria) this;
        }

        public Criteria andCollegeParentIdLessThan(String value) {
            addCriterion("college_parent_id <", value, "collegeParentId");
            return (Criteria) this;
        }

        public Criteria andCollegeParentIdLessThanOrEqualTo(String value) {
            addCriterion("college_parent_id <=", value, "collegeParentId");
            return (Criteria) this;
        }

        public Criteria andCollegeParentIdLike(String value) {
            addCriterion("college_parent_id like", value, "collegeParentId");
            return (Criteria) this;
        }

        public Criteria andCollegeParentIdNotLike(String value) {
            addCriterion("college_parent_id not like", value, "collegeParentId");
            return (Criteria) this;
        }

        public Criteria andCollegeParentIdIn(List<String> values) {
            addCriterion("college_parent_id in", values, "collegeParentId");
            return (Criteria) this;
        }

        public Criteria andCollegeParentIdNotIn(List<String> values) {
            addCriterion("college_parent_id not in", values, "collegeParentId");
            return (Criteria) this;
        }

        public Criteria andCollegeParentIdBetween(String value1, String value2) {
            addCriterion("college_parent_id between", value1, value2, "collegeParentId");
            return (Criteria) this;
        }

        public Criteria andCollegeParentIdNotBetween(String value1, String value2) {
            addCriterion("college_parent_id not between", value1, value2, "collegeParentId");
            return (Criteria) this;
        }

        public Criteria andCollegeStateIsNull() {
            addCriterion("college_state is null");
            return (Criteria) this;
        }

        public Criteria andCollegeStateIsNotNull() {
            addCriterion("college_state is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeStateEqualTo(Integer value) {
            addCriterion("college_state =", value, "collegeState");
            return (Criteria) this;
        }

        public Criteria andCollegeStateNotEqualTo(Integer value) {
            addCriterion("college_state <>", value, "collegeState");
            return (Criteria) this;
        }

        public Criteria andCollegeStateGreaterThan(Integer value) {
            addCriterion("college_state >", value, "collegeState");
            return (Criteria) this;
        }

        public Criteria andCollegeStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("college_state >=", value, "collegeState");
            return (Criteria) this;
        }

        public Criteria andCollegeStateLessThan(Integer value) {
            addCriterion("college_state <", value, "collegeState");
            return (Criteria) this;
        }

        public Criteria andCollegeStateLessThanOrEqualTo(Integer value) {
            addCriterion("college_state <=", value, "collegeState");
            return (Criteria) this;
        }

        public Criteria andCollegeStateIn(List<Integer> values) {
            addCriterion("college_state in", values, "collegeState");
            return (Criteria) this;
        }

        public Criteria andCollegeStateNotIn(List<Integer> values) {
            addCriterion("college_state not in", values, "collegeState");
            return (Criteria) this;
        }

        public Criteria andCollegeStateBetween(Integer value1, Integer value2) {
            addCriterion("college_state between", value1, value2, "collegeState");
            return (Criteria) this;
        }

        public Criteria andCollegeStateNotBetween(Integer value1, Integer value2) {
            addCriterion("college_state not between", value1, value2, "collegeState");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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