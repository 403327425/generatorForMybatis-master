package com.gzwl.zjlp.pojo.readhouserecord;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReadHouseRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReadHouseRecordExample() {
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

        public Criteria andReadHouseRecordIdIsNull() {
            addCriterion("read_house_record_id is null");
            return (Criteria) this;
        }

        public Criteria andReadHouseRecordIdIsNotNull() {
            addCriterion("read_house_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andReadHouseRecordIdEqualTo(String value) {
            addCriterion("read_house_record_id =", value, "readHouseRecordId");
            return (Criteria) this;
        }

        public Criteria andReadHouseRecordIdNotEqualTo(String value) {
            addCriterion("read_house_record_id <>", value, "readHouseRecordId");
            return (Criteria) this;
        }

        public Criteria andReadHouseRecordIdGreaterThan(String value) {
            addCriterion("read_house_record_id >", value, "readHouseRecordId");
            return (Criteria) this;
        }

        public Criteria andReadHouseRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("read_house_record_id >=", value, "readHouseRecordId");
            return (Criteria) this;
        }

        public Criteria andReadHouseRecordIdLessThan(String value) {
            addCriterion("read_house_record_id <", value, "readHouseRecordId");
            return (Criteria) this;
        }

        public Criteria andReadHouseRecordIdLessThanOrEqualTo(String value) {
            addCriterion("read_house_record_id <=", value, "readHouseRecordId");
            return (Criteria) this;
        }

        public Criteria andReadHouseRecordIdLike(String value) {
            addCriterion("read_house_record_id like", value, "readHouseRecordId");
            return (Criteria) this;
        }

        public Criteria andReadHouseRecordIdNotLike(String value) {
            addCriterion("read_house_record_id not like", value, "readHouseRecordId");
            return (Criteria) this;
        }

        public Criteria andReadHouseRecordIdIn(List<String> values) {
            addCriterion("read_house_record_id in", values, "readHouseRecordId");
            return (Criteria) this;
        }

        public Criteria andReadHouseRecordIdNotIn(List<String> values) {
            addCriterion("read_house_record_id not in", values, "readHouseRecordId");
            return (Criteria) this;
        }

        public Criteria andReadHouseRecordIdBetween(String value1, String value2) {
            addCriterion("read_house_record_id between", value1, value2, "readHouseRecordId");
            return (Criteria) this;
        }

        public Criteria andReadHouseRecordIdNotBetween(String value1, String value2) {
            addCriterion("read_house_record_id not between", value1, value2, "readHouseRecordId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("customer_id like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("customer_id not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andHouseIdIsNull() {
            addCriterion("house_id is null");
            return (Criteria) this;
        }

        public Criteria andHouseIdIsNotNull() {
            addCriterion("house_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseIdEqualTo(String value) {
            addCriterion("house_id =", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotEqualTo(String value) {
            addCriterion("house_id <>", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThan(String value) {
            addCriterion("house_id >", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThanOrEqualTo(String value) {
            addCriterion("house_id >=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThan(String value) {
            addCriterion("house_id <", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThanOrEqualTo(String value) {
            addCriterion("house_id <=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLike(String value) {
            addCriterion("house_id like", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotLike(String value) {
            addCriterion("house_id not like", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdIn(List<String> values) {
            addCriterion("house_id in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotIn(List<String> values) {
            addCriterion("house_id not in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdBetween(String value1, String value2) {
            addCriterion("house_id between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotBetween(String value1, String value2) {
            addCriterion("house_id not between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andSalespersonIdIsNull() {
            addCriterion("salesperson_id is null");
            return (Criteria) this;
        }

        public Criteria andSalespersonIdIsNotNull() {
            addCriterion("salesperson_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalespersonIdEqualTo(String value) {
            addCriterion("salesperson_id =", value, "salespersonId");
            return (Criteria) this;
        }

        public Criteria andSalespersonIdNotEqualTo(String value) {
            addCriterion("salesperson_id <>", value, "salespersonId");
            return (Criteria) this;
        }

        public Criteria andSalespersonIdGreaterThan(String value) {
            addCriterion("salesperson_id >", value, "salespersonId");
            return (Criteria) this;
        }

        public Criteria andSalespersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("salesperson_id >=", value, "salespersonId");
            return (Criteria) this;
        }

        public Criteria andSalespersonIdLessThan(String value) {
            addCriterion("salesperson_id <", value, "salespersonId");
            return (Criteria) this;
        }

        public Criteria andSalespersonIdLessThanOrEqualTo(String value) {
            addCriterion("salesperson_id <=", value, "salespersonId");
            return (Criteria) this;
        }

        public Criteria andSalespersonIdLike(String value) {
            addCriterion("salesperson_id like", value, "salespersonId");
            return (Criteria) this;
        }

        public Criteria andSalespersonIdNotLike(String value) {
            addCriterion("salesperson_id not like", value, "salespersonId");
            return (Criteria) this;
        }

        public Criteria andSalespersonIdIn(List<String> values) {
            addCriterion("salesperson_id in", values, "salespersonId");
            return (Criteria) this;
        }

        public Criteria andSalespersonIdNotIn(List<String> values) {
            addCriterion("salesperson_id not in", values, "salespersonId");
            return (Criteria) this;
        }

        public Criteria andSalespersonIdBetween(String value1, String value2) {
            addCriterion("salesperson_id between", value1, value2, "salespersonId");
            return (Criteria) this;
        }

        public Criteria andSalespersonIdNotBetween(String value1, String value2) {
            addCriterion("salesperson_id not between", value1, value2, "salespersonId");
            return (Criteria) this;
        }

        public Criteria andIntentionIsNull() {
            addCriterion("intention is null");
            return (Criteria) this;
        }

        public Criteria andIntentionIsNotNull() {
            addCriterion("intention is not null");
            return (Criteria) this;
        }

        public Criteria andIntentionEqualTo(Integer value) {
            addCriterion("intention =", value, "intention");
            return (Criteria) this;
        }

        public Criteria andIntentionNotEqualTo(Integer value) {
            addCriterion("intention <>", value, "intention");
            return (Criteria) this;
        }

        public Criteria andIntentionGreaterThan(Integer value) {
            addCriterion("intention >", value, "intention");
            return (Criteria) this;
        }

        public Criteria andIntentionGreaterThanOrEqualTo(Integer value) {
            addCriterion("intention >=", value, "intention");
            return (Criteria) this;
        }

        public Criteria andIntentionLessThan(Integer value) {
            addCriterion("intention <", value, "intention");
            return (Criteria) this;
        }

        public Criteria andIntentionLessThanOrEqualTo(Integer value) {
            addCriterion("intention <=", value, "intention");
            return (Criteria) this;
        }

        public Criteria andIntentionIn(List<Integer> values) {
            addCriterion("intention in", values, "intention");
            return (Criteria) this;
        }

        public Criteria andIntentionNotIn(List<Integer> values) {
            addCriterion("intention not in", values, "intention");
            return (Criteria) this;
        }

        public Criteria andIntentionBetween(Integer value1, Integer value2) {
            addCriterion("intention between", value1, value2, "intention");
            return (Criteria) this;
        }

        public Criteria andIntentionNotBetween(Integer value1, Integer value2) {
            addCriterion("intention not between", value1, value2, "intention");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andReadHouseTimeIsNull() {
            addCriterion("read_house_time is null");
            return (Criteria) this;
        }

        public Criteria andReadHouseTimeIsNotNull() {
            addCriterion("read_house_time is not null");
            return (Criteria) this;
        }

        public Criteria andReadHouseTimeEqualTo(Date value) {
            addCriterion("read_house_time =", value, "readHouseTime");
            return (Criteria) this;
        }

        public Criteria andReadHouseTimeNotEqualTo(Date value) {
            addCriterion("read_house_time <>", value, "readHouseTime");
            return (Criteria) this;
        }

        public Criteria andReadHouseTimeGreaterThan(Date value) {
            addCriterion("read_house_time >", value, "readHouseTime");
            return (Criteria) this;
        }

        public Criteria andReadHouseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("read_house_time >=", value, "readHouseTime");
            return (Criteria) this;
        }

        public Criteria andReadHouseTimeLessThan(Date value) {
            addCriterion("read_house_time <", value, "readHouseTime");
            return (Criteria) this;
        }

        public Criteria andReadHouseTimeLessThanOrEqualTo(Date value) {
            addCriterion("read_house_time <=", value, "readHouseTime");
            return (Criteria) this;
        }

        public Criteria andReadHouseTimeIn(List<Date> values) {
            addCriterion("read_house_time in", values, "readHouseTime");
            return (Criteria) this;
        }

        public Criteria andReadHouseTimeNotIn(List<Date> values) {
            addCriterion("read_house_time not in", values, "readHouseTime");
            return (Criteria) this;
        }

        public Criteria andReadHouseTimeBetween(Date value1, Date value2) {
            addCriterion("read_house_time between", value1, value2, "readHouseTime");
            return (Criteria) this;
        }

        public Criteria andReadHouseTimeNotBetween(Date value1, Date value2) {
            addCriterion("read_house_time not between", value1, value2, "readHouseTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andEditorIdIsNull() {
            addCriterion("editor_id is null");
            return (Criteria) this;
        }

        public Criteria andEditorIdIsNotNull() {
            addCriterion("editor_id is not null");
            return (Criteria) this;
        }

        public Criteria andEditorIdEqualTo(Integer value) {
            addCriterion("editor_id =", value, "editorId");
            return (Criteria) this;
        }

        public Criteria andEditorIdNotEqualTo(Integer value) {
            addCriterion("editor_id <>", value, "editorId");
            return (Criteria) this;
        }

        public Criteria andEditorIdGreaterThan(Integer value) {
            addCriterion("editor_id >", value, "editorId");
            return (Criteria) this;
        }

        public Criteria andEditorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("editor_id >=", value, "editorId");
            return (Criteria) this;
        }

        public Criteria andEditorIdLessThan(Integer value) {
            addCriterion("editor_id <", value, "editorId");
            return (Criteria) this;
        }

        public Criteria andEditorIdLessThanOrEqualTo(Integer value) {
            addCriterion("editor_id <=", value, "editorId");
            return (Criteria) this;
        }

        public Criteria andEditorIdIn(List<Integer> values) {
            addCriterion("editor_id in", values, "editorId");
            return (Criteria) this;
        }

        public Criteria andEditorIdNotIn(List<Integer> values) {
            addCriterion("editor_id not in", values, "editorId");
            return (Criteria) this;
        }

        public Criteria andEditorIdBetween(Integer value1, Integer value2) {
            addCriterion("editor_id between", value1, value2, "editorId");
            return (Criteria) this;
        }

        public Criteria andEditorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("editor_id not between", value1, value2, "editorId");
            return (Criteria) this;
        }

        public Criteria andEditorTimeIsNull() {
            addCriterion("editor_time is null");
            return (Criteria) this;
        }

        public Criteria andEditorTimeIsNotNull() {
            addCriterion("editor_time is not null");
            return (Criteria) this;
        }

        public Criteria andEditorTimeEqualTo(Date value) {
            addCriterion("editor_time =", value, "editorTime");
            return (Criteria) this;
        }

        public Criteria andEditorTimeNotEqualTo(Date value) {
            addCriterion("editor_time <>", value, "editorTime");
            return (Criteria) this;
        }

        public Criteria andEditorTimeGreaterThan(Date value) {
            addCriterion("editor_time >", value, "editorTime");
            return (Criteria) this;
        }

        public Criteria andEditorTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("editor_time >=", value, "editorTime");
            return (Criteria) this;
        }

        public Criteria andEditorTimeLessThan(Date value) {
            addCriterion("editor_time <", value, "editorTime");
            return (Criteria) this;
        }

        public Criteria andEditorTimeLessThanOrEqualTo(Date value) {
            addCriterion("editor_time <=", value, "editorTime");
            return (Criteria) this;
        }

        public Criteria andEditorTimeIn(List<Date> values) {
            addCriterion("editor_time in", values, "editorTime");
            return (Criteria) this;
        }

        public Criteria andEditorTimeNotIn(List<Date> values) {
            addCriterion("editor_time not in", values, "editorTime");
            return (Criteria) this;
        }

        public Criteria andEditorTimeBetween(Date value1, Date value2) {
            addCriterion("editor_time between", value1, value2, "editorTime");
            return (Criteria) this;
        }

        public Criteria andEditorTimeNotBetween(Date value1, Date value2) {
            addCriterion("editor_time not between", value1, value2, "editorTime");
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