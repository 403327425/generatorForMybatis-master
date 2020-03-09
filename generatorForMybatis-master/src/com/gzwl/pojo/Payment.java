package com.gzwl.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Payment {
    /** 自增ID*/
    private Integer payId;

    /** 支付编号*/
    private String paySn;

    /** 支付价格*/
    private BigDecimal payPrice;

    /** 用户Id*/
    private Integer userId;

    /** 支付时间*/
    private Date payTime;

    /** 支付类型*/
    private Integer payType;

    public Integer getPayId() {
        return payId;
    }

    public void setPayId(Integer payId) {
        this.payId = payId;
    }

    public String getPaySn() {
        return paySn;
    }

    public void setPaySn(String paySn) {
        this.paySn = paySn == null ? null : paySn.trim();
    }

    public BigDecimal getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(BigDecimal payPrice) {
        this.payPrice = payPrice;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }
}