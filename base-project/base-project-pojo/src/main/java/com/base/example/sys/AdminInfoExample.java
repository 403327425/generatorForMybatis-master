package com.base.example.sys;

import java.util.ArrayList;
import java.util.List;

public class AdminInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminInfoExample() {
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

        public Criteria andAdminIdEqualTo(Long value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Long value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Long value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Long value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Long value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Long value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Long> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Long> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Long value1, Long value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Long value1, Long value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNull() {
            addCriterion("admin_name is null");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNotNull() {
            addCriterion("admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNameEqualTo(String value) {
            addCriterion("admin_name =", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotEqualTo(String value) {
            addCriterion("admin_name <>", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThan(String value) {
            addCriterion("admin_name >", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_name >=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThan(String value) {
            addCriterion("admin_name <", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThanOrEqualTo(String value) {
            addCriterion("admin_name <=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLike(String value) {
            addCriterion("admin_name like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotLike(String value) {
            addCriterion("admin_name not like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIn(List<String> values) {
            addCriterion("admin_name in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotIn(List<String> values) {
            addCriterion("admin_name not in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameBetween(String value1, String value2) {
            addCriterion("admin_name between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotBetween(String value1, String value2) {
            addCriterion("admin_name not between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminSexIsNull() {
            addCriterion("admin_sex is null");
            return (Criteria) this;
        }

        public Criteria andAdminSexIsNotNull() {
            addCriterion("admin_sex is not null");
            return (Criteria) this;
        }

        public Criteria andAdminSexEqualTo(String value) {
            addCriterion("admin_sex =", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexNotEqualTo(String value) {
            addCriterion("admin_sex <>", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexGreaterThan(String value) {
            addCriterion("admin_sex >", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexGreaterThanOrEqualTo(String value) {
            addCriterion("admin_sex >=", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexLessThan(String value) {
            addCriterion("admin_sex <", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexLessThanOrEqualTo(String value) {
            addCriterion("admin_sex <=", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexLike(String value) {
            addCriterion("admin_sex like", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexNotLike(String value) {
            addCriterion("admin_sex not like", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexIn(List<String> values) {
            addCriterion("admin_sex in", values, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexNotIn(List<String> values) {
            addCriterion("admin_sex not in", values, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexBetween(String value1, String value2) {
            addCriterion("admin_sex between", value1, value2, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexNotBetween(String value1, String value2) {
            addCriterion("admin_sex not between", value1, value2, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminEmailIsNull() {
            addCriterion("admin_email is null");
            return (Criteria) this;
        }

        public Criteria andAdminEmailIsNotNull() {
            addCriterion("admin_email is not null");
            return (Criteria) this;
        }

        public Criteria andAdminEmailEqualTo(String value) {
            addCriterion("admin_email =", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailNotEqualTo(String value) {
            addCriterion("admin_email <>", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailGreaterThan(String value) {
            addCriterion("admin_email >", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailGreaterThanOrEqualTo(String value) {
            addCriterion("admin_email >=", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailLessThan(String value) {
            addCriterion("admin_email <", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailLessThanOrEqualTo(String value) {
            addCriterion("admin_email <=", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailLike(String value) {
            addCriterion("admin_email like", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailNotLike(String value) {
            addCriterion("admin_email not like", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailIn(List<String> values) {
            addCriterion("admin_email in", values, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailNotIn(List<String> values) {
            addCriterion("admin_email not in", values, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailBetween(String value1, String value2) {
            addCriterion("admin_email between", value1, value2, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailNotBetween(String value1, String value2) {
            addCriterion("admin_email not between", value1, value2, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIsNull() {
            addCriterion("admin_phone is null");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIsNotNull() {
            addCriterion("admin_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneEqualTo(String value) {
            addCriterion("admin_phone =", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotEqualTo(String value) {
            addCriterion("admin_phone <>", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneGreaterThan(String value) {
            addCriterion("admin_phone >", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("admin_phone >=", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLessThan(String value) {
            addCriterion("admin_phone <", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLessThanOrEqualTo(String value) {
            addCriterion("admin_phone <=", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLike(String value) {
            addCriterion("admin_phone like", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotLike(String value) {
            addCriterion("admin_phone not like", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIn(List<String> values) {
            addCriterion("admin_phone in", values, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotIn(List<String> values) {
            addCriterion("admin_phone not in", values, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneBetween(String value1, String value2) {
            addCriterion("admin_phone between", value1, value2, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotBetween(String value1, String value2) {
            addCriterion("admin_phone not between", value1, value2, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminAddrIsNull() {
            addCriterion("admin_addr is null");
            return (Criteria) this;
        }

        public Criteria andAdminAddrIsNotNull() {
            addCriterion("admin_addr is not null");
            return (Criteria) this;
        }

        public Criteria andAdminAddrEqualTo(String value) {
            addCriterion("admin_addr =", value, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrNotEqualTo(String value) {
            addCriterion("admin_addr <>", value, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrGreaterThan(String value) {
            addCriterion("admin_addr >", value, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrGreaterThanOrEqualTo(String value) {
            addCriterion("admin_addr >=", value, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrLessThan(String value) {
            addCriterion("admin_addr <", value, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrLessThanOrEqualTo(String value) {
            addCriterion("admin_addr <=", value, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrLike(String value) {
            addCriterion("admin_addr like", value, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrNotLike(String value) {
            addCriterion("admin_addr not like", value, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrIn(List<String> values) {
            addCriterion("admin_addr in", values, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrNotIn(List<String> values) {
            addCriterion("admin_addr not in", values, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrBetween(String value1, String value2) {
            addCriterion("admin_addr between", value1, value2, "adminAddr");
            return (Criteria) this;
        }

        public Criteria andAdminAddrNotBetween(String value1, String value2) {
            addCriterion("admin_addr not between", value1, value2, "adminAddr");
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