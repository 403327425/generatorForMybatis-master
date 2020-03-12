package com.base.example.sys;

import java.util.ArrayList;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("admin.admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminLoginNameIsNull() {
            addCriterion("admin_login_name is null");
            return (Criteria) this;
        }

        public Criteria andAdminLoginNameIsNotNull() {
            addCriterion("admin_login_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminLoginNameEqualTo(String value) {
            addCriterion("admin_login_name =", value, "adminLoginName");
            return (Criteria) this;
        }

        public Criteria andAdminLoginNameNotEqualTo(String value) {
            addCriterion("admin_login_name <>", value, "adminLoginName");
            return (Criteria) this;
        }

        public Criteria andAdminLoginNameGreaterThan(String value) {
            addCriterion("admin_login_name >", value, "adminLoginName");
            return (Criteria) this;
        }

        public Criteria andAdminLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_login_name >=", value, "adminLoginName");
            return (Criteria) this;
        }

        public Criteria andAdminLoginNameLessThan(String value) {
            addCriterion("admin_login_name <", value, "adminLoginName");
            return (Criteria) this;
        }

        public Criteria andAdminLoginNameLessThanOrEqualTo(String value) {
            addCriterion("admin_login_name <=", value, "adminLoginName");
            return (Criteria) this;
        }

        public Criteria andAdminLoginNameLike(String value) {
            addCriterion("admin_login_name like", value, "adminLoginName");
            return (Criteria) this;
        }

        public Criteria andAdminLoginNameNotLike(String value) {
            addCriterion("admin_login_name not like", value, "adminLoginName");
            return (Criteria) this;
        }

        public Criteria andAdminLoginNameIn(List<String> values) {
            addCriterion("admin_login_name in", values, "adminLoginName");
            return (Criteria) this;
        }

        public Criteria andAdminLoginNameNotIn(List<String> values) {
            addCriterion("admin_login_name not in", values, "adminLoginName");
            return (Criteria) this;
        }

        public Criteria andAdminLoginNameBetween(String value1, String value2) {
            addCriterion("admin_login_name between", value1, value2, "adminLoginName");
            return (Criteria) this;
        }

        public Criteria andAdminLoginNameNotBetween(String value1, String value2) {
            addCriterion("admin_login_name not between", value1, value2, "adminLoginName");
            return (Criteria) this;
        }

        public Criteria andAdminLoginPasswordIsNull() {
            addCriterion("admin_login_password is null");
            return (Criteria) this;
        }

        public Criteria andAdminLoginPasswordIsNotNull() {
            addCriterion("admin_login_password is not null");
            return (Criteria) this;
        }

        public Criteria andAdminLoginPasswordEqualTo(String value) {
            addCriterion("admin_login_password =", value, "adminLoginPassword");
            return (Criteria) this;
        }

        public Criteria andAdminLoginPasswordNotEqualTo(String value) {
            addCriterion("admin_login_password <>", value, "adminLoginPassword");
            return (Criteria) this;
        }

        public Criteria andAdminLoginPasswordGreaterThan(String value) {
            addCriterion("admin_login_password >", value, "adminLoginPassword");
            return (Criteria) this;
        }

        public Criteria andAdminLoginPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("admin_login_password >=", value, "adminLoginPassword");
            return (Criteria) this;
        }

        public Criteria andAdminLoginPasswordLessThan(String value) {
            addCriterion("admin_login_password <", value, "adminLoginPassword");
            return (Criteria) this;
        }

        public Criteria andAdminLoginPasswordLessThanOrEqualTo(String value) {
            addCriterion("admin_login_password <=", value, "adminLoginPassword");
            return (Criteria) this;
        }

        public Criteria andAdminLoginPasswordLike(String value) {
            addCriterion("admin_login_password like", value, "adminLoginPassword");
            return (Criteria) this;
        }

        public Criteria andAdminLoginPasswordNotLike(String value) {
            addCriterion("admin_login_password not like", value, "adminLoginPassword");
            return (Criteria) this;
        }

        public Criteria andAdminLoginPasswordIn(List<String> values) {
            addCriterion("admin_login_password in", values, "adminLoginPassword");
            return (Criteria) this;
        }

        public Criteria andAdminLoginPasswordNotIn(List<String> values) {
            addCriterion("admin_login_password not in", values, "adminLoginPassword");
            return (Criteria) this;
        }

        public Criteria andAdminLoginPasswordBetween(String value1, String value2) {
            addCriterion("admin_login_password between", value1, value2, "adminLoginPassword");
            return (Criteria) this;
        }

        public Criteria andAdminLoginPasswordNotBetween(String value1, String value2) {
            addCriterion("admin_login_password not between", value1, value2, "adminLoginPassword");
            return (Criteria) this;
        }

        public Criteria andAdminNickNameIsNull() {
            addCriterion("admin_nick_name is null");
            return (Criteria) this;
        }

        public Criteria andAdminNickNameIsNotNull() {
            addCriterion("admin_nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNickNameEqualTo(String value) {
            addCriterion("admin_nick_name =", value, "adminNickName");
            return (Criteria) this;
        }

        public Criteria andAdminNickNameNotEqualTo(String value) {
            addCriterion("admin_nick_name <>", value, "adminNickName");
            return (Criteria) this;
        }

        public Criteria andAdminNickNameGreaterThan(String value) {
            addCriterion("admin_nick_name >", value, "adminNickName");
            return (Criteria) this;
        }

        public Criteria andAdminNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_nick_name >=", value, "adminNickName");
            return (Criteria) this;
        }

        public Criteria andAdminNickNameLessThan(String value) {
            addCriterion("admin_nick_name <", value, "adminNickName");
            return (Criteria) this;
        }

        public Criteria andAdminNickNameLessThanOrEqualTo(String value) {
            addCriterion("admin_nick_name <=", value, "adminNickName");
            return (Criteria) this;
        }

        public Criteria andAdminNickNameLike(String value) {
            addCriterion("admin_nick_name like", value, "adminNickName");
            return (Criteria) this;
        }

        public Criteria andAdminNickNameNotLike(String value) {
            addCriterion("admin_nick_name not like", value, "adminNickName");
            return (Criteria) this;
        }

        public Criteria andAdminNickNameIn(List<String> values) {
            addCriterion("admin_nick_name in", values, "adminNickName");
            return (Criteria) this;
        }

        public Criteria andAdminNickNameNotIn(List<String> values) {
            addCriterion("admin_nick_name not in", values, "adminNickName");
            return (Criteria) this;
        }

        public Criteria andAdminNickNameBetween(String value1, String value2) {
            addCriterion("admin_nick_name between", value1, value2, "adminNickName");
            return (Criteria) this;
        }

        public Criteria andAdminNickNameNotBetween(String value1, String value2) {
            addCriterion("admin_nick_name not between", value1, value2, "adminNickName");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
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

        public Criteria andJobIdIsNull() {
            addCriterion("job_id is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("job_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(Integer value) {
            addCriterion("job_id =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(Integer value) {
            addCriterion("job_id <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(Integer value) {
            addCriterion("job_id >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_id >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(Integer value) {
            addCriterion("job_id <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(Integer value) {
            addCriterion("job_id <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<Integer> values) {
            addCriterion("job_id in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<Integer> values) {
            addCriterion("job_id not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(Integer value1, Integer value2) {
            addCriterion("job_id between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(Integer value1, Integer value2) {
            addCriterion("job_id not between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andAdminStatusIsNull() {
            addCriterion("admin_status is null");
            return (Criteria) this;
        }

        public Criteria andAdminStatusIsNotNull() {
            addCriterion("admin_status is not null");
            return (Criteria) this;
        }

        public Criteria andAdminStatusEqualTo(Boolean value) {
            addCriterion("admin_status =", value, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusNotEqualTo(Boolean value) {
            addCriterion("admin_status <>", value, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusGreaterThan(Boolean value) {
            addCriterion("admin_status >", value, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("admin_status >=", value, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusLessThan(Boolean value) {
            addCriterion("admin_status <", value, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("admin_status <=", value, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusLike(Boolean value) {
            addCriterion("admin_status like", value, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusNotLike(Boolean value) {
            addCriterion("admin_status not like", value, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusIn(List<Boolean> values) {
            addCriterion("admin_status in", values, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusNotIn(List<Boolean> values) {
            addCriterion("admin_status not in", values, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("admin_status between", value1, value2, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("admin_status not between", value1, value2, "adminStatus");
            return (Criteria) this;
        }
        
        public Criteria andOpenIdEqualTo(String value) {
        	addCriterion("admin.open_id =", value, "openId");
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