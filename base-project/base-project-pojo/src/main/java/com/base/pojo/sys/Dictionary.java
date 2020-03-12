package com.base.pojo.sys;

public class Dictionary {
    /** id*/
    private Long dictionaryId;

    /** 表名*/
    private String dictionaryTable;

    /** 列名*/
    private String dictionaryColum;

    /** 值*/
    private String dictionaryValue;

    /** 字典序号*/
    private Integer dictionarySerialNumber;

    /** 状态1启用0不启用*/
    private Integer dictionaryStatus;

    /** 备注*/
    private String dictionaryRemarks;

    public Long getDictionaryId() {
        return dictionaryId;
    }

    public void setDictionaryId(Long dictionaryId) {
        this.dictionaryId = dictionaryId;
    }

    public String getDictionaryTable() {
        return dictionaryTable;
    }

    public void setDictionaryTable(String dictionaryTable) {
        this.dictionaryTable = dictionaryTable == null ? null : dictionaryTable.trim();
    }

    public String getDictionaryColum() {
        return dictionaryColum;
    }

    public void setDictionaryColum(String dictionaryColum) {
        this.dictionaryColum = dictionaryColum == null ? null : dictionaryColum.trim();
    }

    public String getDictionaryValue() {
        return dictionaryValue;
    }

    public void setDictionaryValue(String dictionaryValue) {
        this.dictionaryValue = dictionaryValue == null ? null : dictionaryValue.trim();
    }

    public Integer getDictionarySerialNumber() {
        return dictionarySerialNumber;
    }

    public void setDictionarySerialNumber(Integer dictionarySerialNumber) {
        this.dictionarySerialNumber = dictionarySerialNumber;
    }

    public Integer getDictionaryStatus() {
        return dictionaryStatus;
    }

    public void setDictionaryStatus(Integer dictionaryStatus) {
        this.dictionaryStatus = dictionaryStatus;
    }

    public String getDictionaryRemarks() {
        return dictionaryRemarks;
    }

    public void setDictionaryRemarks(String dictionaryRemarks) {
        this.dictionaryRemarks = dictionaryRemarks == null ? null : dictionaryRemarks.trim();
    }
}