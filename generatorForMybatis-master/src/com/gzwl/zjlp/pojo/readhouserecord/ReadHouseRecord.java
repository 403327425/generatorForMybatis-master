package com.gzwl.zjlp.pojo.readhouserecord;

import java.util.Date;

public class ReadHouseRecord {
    /** 看房记录表id*/
    private String readHouseRecordId;

    /** 客户id*/
    private String customerId;

    /** 房源id*/
    private String houseId;

    /** 销售顾问id*/
    private String salespersonId;

    /** 意向(1高、2中、3低)*/
    private Integer intention;

    /** 备注*/
    private String remark;

    /** 看房时间*/
    private Date readHouseTime;

    /** 状态(1显示、0否)*/
    private Integer status;

    /** 创建人*/
    private Integer createId;

    /** 创建时间*/
    private Date createTime;

    /** 编辑人*/
    private Integer editorId;

    /** 编辑时间*/
    private Date editorTime;

    public String getReadHouseRecordId() {
        return readHouseRecordId;
    }

    public void setReadHouseRecordId(String readHouseRecordId) {
        this.readHouseRecordId = readHouseRecordId == null ? null : readHouseRecordId.trim();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId == null ? null : houseId.trim();
    }

    public String getSalespersonId() {
        return salespersonId;
    }

    public void setSalespersonId(String salespersonId) {
        this.salespersonId = salespersonId == null ? null : salespersonId.trim();
    }

    public Integer getIntention() {
        return intention;
    }

    public void setIntention(Integer intention) {
        this.intention = intention;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getReadHouseTime() {
        return readHouseTime;
    }

    public void setReadHouseTime(Date readHouseTime) {
        this.readHouseTime = readHouseTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getEditorId() {
        return editorId;
    }

    public void setEditorId(Integer editorId) {
        this.editorId = editorId;
    }

    public Date getEditorTime() {
        return editorTime;
    }

    public void setEditorTime(Date editorTime) {
        this.editorTime = editorTime;
    }
}