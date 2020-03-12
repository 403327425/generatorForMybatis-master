package com.base.example.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartmentExample() {
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

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Integer value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Integer value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Integer value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Integer value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Integer> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Integer> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNull() {
            addCriterion("department_name is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNotNull() {
            addCriterion("department_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameEqualTo(String value) {
            addCriterion("department_name =", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotEqualTo(String value) {
            addCriterion("department_name <>", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThan(String value) {
            addCriterion("department_name >", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("department_name >=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThan(String value) {
            addCriterion("department_name <", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("department_name <=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLike(String value) {
            addCriterion("department.department_name like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotLike(String value) {
            addCriterion("department_name not like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIn(List<String> values) {
            addCriterion("department_name in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotIn(List<String> values) {
            addCriterion("department_name not in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameBetween(String value1, String value2) {
            addCriterion("department_name between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("department_name not between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentParentIdIsNull() {
            addCriterion("department_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentParentIdIsNotNull() {
            addCriterion("department_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentParentIdEqualTo(Integer value) {
            addCriterion("department_parent_id =", value, "departmentParentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentParentIdNotEqualTo(Integer value) {
            addCriterion("department_parent_id <>", value, "departmentParentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentParentIdGreaterThan(Integer value) {
            addCriterion("department_parent_id >", value, "departmentParentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_parent_id >=", value, "departmentParentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentParentIdLessThan(Integer value) {
            addCriterion("department_parent_id <", value, "departmentParentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("department_parent_id <=", value, "departmentParentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentParentIdIn(List<Integer> values) {
            addCriterion("department_parent_id in", values, "departmentParentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentParentIdNotIn(List<Integer> values) {
            addCriterion("department_parent_id not in", values, "departmentParentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentParentIdBetween(Integer value1, Integer value2) {
            addCriterion("department_parent_id between", value1, value2, "departmentParentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("department_parent_id not between", value1, value2, "departmentParentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddressIsNull() {
            addCriterion("department_address is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddressIsNotNull() {
            addCriterion("department_address is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddressEqualTo(String value) {
            addCriterion("department_address =", value, "departmentAddress");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddressNotEqualTo(String value) {
            addCriterion("department_address <>", value, "departmentAddress");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddressGreaterThan(String value) {
            addCriterion("department_address >", value, "departmentAddress");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddressGreaterThanOrEqualTo(String value) {
            addCriterion("department_address >=", value, "departmentAddress");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddressLessThan(String value) {
            addCriterion("department_address <", value, "departmentAddress");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddressLessThanOrEqualTo(String value) {
            addCriterion("department_address <=", value, "departmentAddress");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddressLike(String value) {
            addCriterion("department.department_address like", value, "departmentAddress");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddressNotLike(String value) {
            addCriterion("department_address not like", value, "departmentAddress");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddressIn(List<String> values) {
            addCriterion("department_address in", values, "departmentAddress");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddressNotIn(List<String> values) {
            addCriterion("department_address not in", values, "departmentAddress");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddressBetween(String value1, String value2) {
            addCriterion("department_address between", value1, value2, "departmentAddress");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddressNotBetween(String value1, String value2) {
            addCriterion("department_address not between", value1, value2, "departmentAddress");
            return (Criteria) this;
        }

        public Criteria andDepartmentNumIsNull() {
            addCriterion("department_num is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNumIsNotNull() {
            addCriterion("department_num is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNumEqualTo(Long value) {
            addCriterion("department_num =", value, "departmentNum");
            return (Criteria) this;
        }

        public Criteria andDepartmentNumNotEqualTo(Long value) {
            addCriterion("department_num <>", value, "departmentNum");
            return (Criteria) this;
        }

        public Criteria andDepartmentNumGreaterThan(Long value) {
            addCriterion("department_num >", value, "departmentNum");
            return (Criteria) this;
        }

        public Criteria andDepartmentNumGreaterThanOrEqualTo(Long value) {
            addCriterion("department_num >=", value, "departmentNum");
            return (Criteria) this;
        }

        public Criteria andDepartmentNumLessThan(Long value) {
            addCriterion("department_num <", value, "departmentNum");
            return (Criteria) this;
        }

        public Criteria andDepartmentNumLessThanOrEqualTo(Long value) {
            addCriterion("department_num <=", value, "departmentNum");
            return (Criteria) this;
        }

        public Criteria andDepartmentNumIn(List<Long> values) {
            addCriterion("department_num in", values, "departmentNum");
            return (Criteria) this;
        }

        public Criteria andDepartmentNumNotIn(List<Long> values) {
            addCriterion("department_num not in", values, "departmentNum");
            return (Criteria) this;
        }

        public Criteria andDepartmentNumBetween(Long value1, Long value2) {
            addCriterion("department_num between", value1, value2, "departmentNum");
            return (Criteria) this;
        }

        public Criteria andDepartmentNumNotBetween(Long value1, Long value2) {
            addCriterion("department_num not between", value1, value2, "departmentNum");
            return (Criteria) this;
        }

        public Criteria andDepartmentPhoneIsNull() {
            addCriterion("department_phone is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentPhoneIsNotNull() {
            addCriterion("department_phone is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentPhoneEqualTo(String value) {
            addCriterion("department_phone =", value, "departmentPhone");
            return (Criteria) this;
        }

        public Criteria andDepartmentPhoneNotEqualTo(String value) {
            addCriterion("department_phone <>", value, "departmentPhone");
            return (Criteria) this;
        }

        public Criteria andDepartmentPhoneGreaterThan(String value) {
            addCriterion("department_phone >", value, "departmentPhone");
            return (Criteria) this;
        }

        public Criteria andDepartmentPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("department_phone >=", value, "departmentPhone");
            return (Criteria) this;
        }

        public Criteria andDepartmentPhoneLessThan(String value) {
            addCriterion("department_phone <", value, "departmentPhone");
            return (Criteria) this;
        }

        public Criteria andDepartmentPhoneLessThanOrEqualTo(String value) {
            addCriterion("department_phone <=", value, "departmentPhone");
            return (Criteria) this;
        }

        public Criteria andDepartmentPhoneLike(String value) {
            addCriterion("department_phone like", value, "departmentPhone");
            return (Criteria) this;
        }

        public Criteria andDepartmentPhoneNotLike(String value) {
            addCriterion("department_phone not like", value, "departmentPhone");
            return (Criteria) this;
        }

        public Criteria andDepartmentPhoneIn(List<String> values) {
            addCriterion("department_phone in", values, "departmentPhone");
            return (Criteria) this;
        }

        public Criteria andDepartmentPhoneNotIn(List<String> values) {
            addCriterion("department_phone not in", values, "departmentPhone");
            return (Criteria) this;
        }

        public Criteria andDepartmentPhoneBetween(String value1, String value2) {
            addCriterion("department_phone between", value1, value2, "departmentPhone");
            return (Criteria) this;
        }

        public Criteria andDepartmentPhoneNotBetween(String value1, String value2) {
            addCriterion("department_phone not between", value1, value2, "departmentPhone");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(Integer value) {
            addCriterion("create_id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(Integer value) {
            addCriterion("create_id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(Integer value) {
            addCriterion("create_id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(Integer value) {
            addCriterion("create_id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(Integer value) {
            addCriterion("create_id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<Integer> values) {
            addCriterion("create_id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<Integer> values) {
            addCriterion("create_id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(Integer value1, Integer value2) {
            addCriterion("create_id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("create_id not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andEditIdIsNull() {
            addCriterion("edit_id is null");
            return (Criteria) this;
        }

        public Criteria andEditIdIsNotNull() {
            addCriterion("edit_id is not null");
            return (Criteria) this;
        }

        public Criteria andEditIdEqualTo(Integer value) {
            addCriterion("edit_id =", value, "editId");
            return (Criteria) this;
        }

        public Criteria andEditIdNotEqualTo(Integer value) {
            addCriterion("edit_id <>", value, "editId");
            return (Criteria) this;
        }

        public Criteria andEditIdGreaterThan(Integer value) {
            addCriterion("edit_id >", value, "editId");
            return (Criteria) this;
        }

        public Criteria andEditIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("edit_id >=", value, "editId");
            return (Criteria) this;
        }

        public Criteria andEditIdLessThan(Integer value) {
            addCriterion("edit_id <", value, "editId");
            return (Criteria) this;
        }

        public Criteria andEditIdLessThanOrEqualTo(Integer value) {
            addCriterion("edit_id <=", value, "editId");
            return (Criteria) this;
        }

        public Criteria andEditIdIn(List<Integer> values) {
            addCriterion("edit_id in", values, "editId");
            return (Criteria) this;
        }

        public Criteria andEditIdNotIn(List<Integer> values) {
            addCriterion("edit_id not in", values, "editId");
            return (Criteria) this;
        }

        public Criteria andEditIdBetween(Integer value1, Integer value2) {
            addCriterion("edit_id between", value1, value2, "editId");
            return (Criteria) this;
        }

        public Criteria andEditIdNotBetween(Integer value1, Integer value2) {
            addCriterion("edit_id not between", value1, value2, "editId");
            return (Criteria) this;
        }

        public Criteria andEditTimeIsNull() {
            addCriterion("edit_time is null");
            return (Criteria) this;
        }

        public Criteria andEditTimeIsNotNull() {
            addCriterion("edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andEditTimeEqualTo(Date value) {
            addCriterion("edit_time =", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotEqualTo(Date value) {
            addCriterion("edit_time <>", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeGreaterThan(Date value) {
            addCriterion("edit_time >", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("edit_time >=", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeLessThan(Date value) {
            addCriterion("edit_time <", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("edit_time <=", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeIn(List<Date> values) {
            addCriterion("edit_time in", values, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotIn(List<Date> values) {
            addCriterion("edit_time not in", values, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeBetween(Date value1, Date value2) {
            addCriterion("edit_time between", value1, value2, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("edit_time not between", value1, value2, "editTime");
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