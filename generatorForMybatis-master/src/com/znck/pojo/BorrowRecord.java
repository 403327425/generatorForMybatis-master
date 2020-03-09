package com.znck.pojo;

import java.util.Date;

public class BorrowRecord {
    /** 记录ID*/
    private Integer recordId;

    /** 用户ID*/
    private Integer userId;

    /** 物品ID*/
    private Integer goodsId;

    /** 借出时间*/
    private Date borrowTime;

    /** 归还时间*/
    private Date returnTime;

    /** */
    private Integer borrowNum;

    /** */
    private Integer returnNum;

    /** 状态（0、人为删除；1、已借出；2、已归还；3、拒绝归还）*/
    private Integer state;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Date getBorrowTime() {
        return borrowTime;
    }

    public void setBorrowTime(Date borrowTime) {
        this.borrowTime = borrowTime;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public Integer getBorrowNum() {
        return borrowNum;
    }

    public void setBorrowNum(Integer borrowNum) {
        this.borrowNum = borrowNum;
    }

    public Integer getReturnNum() {
        return returnNum;
    }

    public void setReturnNum(Integer returnNum) {
        this.returnNum = returnNum;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}