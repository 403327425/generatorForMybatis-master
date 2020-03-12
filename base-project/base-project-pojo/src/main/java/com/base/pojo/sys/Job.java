package com.base.pojo.sys;

import java.util.Date;

public class Job {
    /** 职位编号*/
    private Integer jobId;

    /** 职位名称*/
    private String jobName;

    /** 上级职位id*/
    private Integer jobParentId;

    /** 创建人*/
    private Integer createId;

    /** 创建时间*/
    private Date createTime;

    /** 最后编辑人*/
    private Integer editId;

    /** 最后编辑时间*/
    private Date editTime;

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public Integer getJobParentId() {
        return jobParentId;
    }

    public void setJobParentId(Integer jobParentId) {
        this.jobParentId = jobParentId;
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