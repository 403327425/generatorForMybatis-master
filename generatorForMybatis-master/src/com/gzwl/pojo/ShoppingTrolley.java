package com.gzwl.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ShoppingTrolley {
    /** 购物车Id*/
    private Integer shoppingTrolleyId;

    /** 用户ID*/
    private Integer userId;

    /** 音乐ID*/
    private Integer musicId;

    /** 英文区历史价格（加入购物车时价格）*/
    private BigDecimal historicalPriceEn;

    /** 中文区历史价格（加入购物车时价格）*/
    private BigDecimal historicalPriceCn;

    /** 状态（1,已加入购物车；0,已购买或已从购物车中删除）*/
    private Integer state;

    /** 加入购物车时间*/
    private Date createTime;

    public Integer getShoppingTrolleyId() {
        return shoppingTrolleyId;
    }

    public void setShoppingTrolleyId(Integer shoppingTrolleyId) {
        this.shoppingTrolleyId = shoppingTrolleyId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMusicId() {
        return musicId;
    }

    public void setMusicId(Integer musicId) {
        this.musicId = musicId;
    }

    public BigDecimal getHistoricalPriceEn() {
        return historicalPriceEn;
    }

    public void setHistoricalPriceEn(BigDecimal historicalPriceEn) {
        this.historicalPriceEn = historicalPriceEn;
    }

    public BigDecimal getHistoricalPriceCn() {
        return historicalPriceCn;
    }

    public void setHistoricalPriceCn(BigDecimal historicalPriceCn) {
        this.historicalPriceCn = historicalPriceCn;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}