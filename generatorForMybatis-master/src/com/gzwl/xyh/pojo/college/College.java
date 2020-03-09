package com.gzwl.xyh.pojo.college;

public class College {
    /** 学院ID*/
    private String collegeId;

    /** 学院编号*/
    private String collegeSn;

    /** 学院名称*/
    private String collegeName;

    /** 父级学院ID*/
    private String collegeParentId;

    /** 学院状态*/
    private Integer collegeState;

    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId == null ? null : collegeId.trim();
    }

    public String getCollegeSn() {
        return collegeSn;
    }

    public void setCollegeSn(String collegeSn) {
        this.collegeSn = collegeSn == null ? null : collegeSn.trim();
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName == null ? null : collegeName.trim();
    }

    public String getCollegeParentId() {
        return collegeParentId;
    }

    public void setCollegeParentId(String collegeParentId) {
        this.collegeParentId = collegeParentId == null ? null : collegeParentId.trim();
    }

    public Integer getCollegeState() {
        return collegeState;
    }

    public void setCollegeState(Integer collegeState) {
        this.collegeState = collegeState;
    }
}