package com.znck.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andFaceIdIsNull() {
            addCriterion("face_Id is null");
            return (Criteria) this;
        }

        public Criteria andFaceIdIsNotNull() {
            addCriterion("face_Id is not null");
            return (Criteria) this;
        }

        public Criteria andFaceIdEqualTo(String value) {
            addCriterion("face_Id =", value, "faceId");
            return (Criteria) this;
        }

        public Criteria andFaceIdNotEqualTo(String value) {
            addCriterion("face_Id <>", value, "faceId");
            return (Criteria) this;
        }

        public Criteria andFaceIdGreaterThan(String value) {
            addCriterion("face_Id >", value, "faceId");
            return (Criteria) this;
        }

        public Criteria andFaceIdGreaterThanOrEqualTo(String value) {
            addCriterion("face_Id >=", value, "faceId");
            return (Criteria) this;
        }

        public Criteria andFaceIdLessThan(String value) {
            addCriterion("face_Id <", value, "faceId");
            return (Criteria) this;
        }

        public Criteria andFaceIdLessThanOrEqualTo(String value) {
            addCriterion("face_Id <=", value, "faceId");
            return (Criteria) this;
        }

        public Criteria andFaceIdLike(String value) {
            addCriterion("face_Id like", value, "faceId");
            return (Criteria) this;
        }

        public Criteria andFaceIdNotLike(String value) {
            addCriterion("face_Id not like", value, "faceId");
            return (Criteria) this;
        }

        public Criteria andFaceIdIn(List<String> values) {
            addCriterion("face_Id in", values, "faceId");
            return (Criteria) this;
        }

        public Criteria andFaceIdNotIn(List<String> values) {
            addCriterion("face_Id not in", values, "faceId");
            return (Criteria) this;
        }

        public Criteria andFaceIdBetween(String value1, String value2) {
            addCriterion("face_Id between", value1, value2, "faceId");
            return (Criteria) this;
        }

        public Criteria andFaceIdNotBetween(String value1, String value2) {
            addCriterion("face_Id not between", value1, value2, "faceId");
            return (Criteria) this;
        }

        public Criteria andFingerprintIsNull() {
            addCriterion("fingerprint is null");
            return (Criteria) this;
        }

        public Criteria andFingerprintIsNotNull() {
            addCriterion("fingerprint is not null");
            return (Criteria) this;
        }

        public Criteria andFingerprintEqualTo(String value) {
            addCriterion("fingerprint =", value, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintNotEqualTo(String value) {
            addCriterion("fingerprint <>", value, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintGreaterThan(String value) {
            addCriterion("fingerprint >", value, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintGreaterThanOrEqualTo(String value) {
            addCriterion("fingerprint >=", value, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintLessThan(String value) {
            addCriterion("fingerprint <", value, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintLessThanOrEqualTo(String value) {
            addCriterion("fingerprint <=", value, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintLike(String value) {
            addCriterion("fingerprint like", value, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintNotLike(String value) {
            addCriterion("fingerprint not like", value, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintIn(List<String> values) {
            addCriterion("fingerprint in", values, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintNotIn(List<String> values) {
            addCriterion("fingerprint not in", values, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintBetween(String value1, String value2) {
            addCriterion("fingerprint between", value1, value2, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintNotBetween(String value1, String value2) {
            addCriterion("fingerprint not between", value1, value2, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andIcCardIsNull() {
            addCriterion("ic_card is null");
            return (Criteria) this;
        }

        public Criteria andIcCardIsNotNull() {
            addCriterion("ic_card is not null");
            return (Criteria) this;
        }

        public Criteria andIcCardEqualTo(String value) {
            addCriterion("ic_card =", value, "icCard");
            return (Criteria) this;
        }

        public Criteria andIcCardNotEqualTo(String value) {
            addCriterion("ic_card <>", value, "icCard");
            return (Criteria) this;
        }

        public Criteria andIcCardGreaterThan(String value) {
            addCriterion("ic_card >", value, "icCard");
            return (Criteria) this;
        }

        public Criteria andIcCardGreaterThanOrEqualTo(String value) {
            addCriterion("ic_card >=", value, "icCard");
            return (Criteria) this;
        }

        public Criteria andIcCardLessThan(String value) {
            addCriterion("ic_card <", value, "icCard");
            return (Criteria) this;
        }

        public Criteria andIcCardLessThanOrEqualTo(String value) {
            addCriterion("ic_card <=", value, "icCard");
            return (Criteria) this;
        }

        public Criteria andIcCardLike(String value) {
            addCriterion("ic_card like", value, "icCard");
            return (Criteria) this;
        }

        public Criteria andIcCardNotLike(String value) {
            addCriterion("ic_card not like", value, "icCard");
            return (Criteria) this;
        }

        public Criteria andIcCardIn(List<String> values) {
            addCriterion("ic_card in", values, "icCard");
            return (Criteria) this;
        }

        public Criteria andIcCardNotIn(List<String> values) {
            addCriterion("ic_card not in", values, "icCard");
            return (Criteria) this;
        }

        public Criteria andIcCardBetween(String value1, String value2) {
            addCriterion("ic_card between", value1, value2, "icCard");
            return (Criteria) this;
        }

        public Criteria andIcCardNotBetween(String value1, String value2) {
            addCriterion("ic_card not between", value1, value2, "icCard");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNull() {
            addCriterion("bar_code is null");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNotNull() {
            addCriterion("bar_code is not null");
            return (Criteria) this;
        }

        public Criteria andBarCodeEqualTo(String value) {
            addCriterion("bar_code =", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotEqualTo(String value) {
            addCriterion("bar_code <>", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThan(String value) {
            addCriterion("bar_code >", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bar_code >=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThan(String value) {
            addCriterion("bar_code <", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThanOrEqualTo(String value) {
            addCriterion("bar_code <=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLike(String value) {
            addCriterion("bar_code like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotLike(String value) {
            addCriterion("bar_code not like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeIn(List<String> values) {
            addCriterion("bar_code in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotIn(List<String> values) {
            addCriterion("bar_code not in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeBetween(String value1, String value2) {
            addCriterion("bar_code between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotBetween(String value1, String value2) {
            addCriterion("bar_code not between", value1, value2, "barCode");
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