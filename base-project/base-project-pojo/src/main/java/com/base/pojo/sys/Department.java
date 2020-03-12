package com.base.pojo.sys;

import java.util.Date;

public class Department {
    /** 部门编号*/
    private Integer departmentId;

    /** 部门名称*/
    private String departmentName;

    /** 上级部门id*/
    private Integer departmentParentId;

    /** 部门地址*/
    private String departmentAddress;

    /** 部门人员数*/
    private Long departmentNum;

    /** 部门联系电话*/
    private String departmentPhone;

    /** 创建人*/
    private Integer createId;

    /** 创建时间*/
    private Date createTime;

    /** 最后编辑人*/
    private Integer editId;

    /** 最后编辑时间*/
    private Date editTime;

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public Integer getDepartmentParentId() {
        return departmentParentId;
    }

    public void setDepartmentParentId(Integer departmentParentId) {
        this.departmentParentId = departmentParentId;
    }

    public String getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress == null ? null : departmentAddress.trim();
    }

    public Long getDepartmentNum() {
        return departmentNum;
    }

    public void setDepartmentNum(Long departmentNum) {
        this.departmentNum = departmentNum;
    }

    public String getDepartmentPhone() {
        return departmentPhone;
    }

    public void setDepartmentPhone(String departmentPhone) {
        this.departmentPhone = departmentPhone == null ? null : departmentPhone.trim();
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

    public Integer getEditId() {
        return editId;
    }

    public void setEditId(Integer editId) {
        this.editId = editId;
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }
}