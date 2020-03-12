package com.base.pojo.sys;

public class DictionaryType {
    /** id*/
    private Long dictionaryTypeId;

    /** 字典名*/
    private String dictionaryTypeName;

    /** 字典值*/
    private String dictionaryTypeValue;

    /** 字典类型1表2字段*/
    private String dictionaryTypeType;

    /** 父级id*/
    private String parentId;

    public Long getDictionaryTypeId() {
        return dictionaryTypeId;
    }

    public void setDictionaryTypeId(Long dictionaryTypeId) {
        this.dictionaryTypeId = dictionaryTypeId;
    }

    public String getDictionaryTypeName() {
        return dictionaryTypeName;
    }

    public void setDictionaryTypeName(String dictionaryTypeName) {
        this.dictionaryTypeName = dictionaryTypeName == null ? null : dictionaryTypeName.trim();
    }

    public String getDictionaryTypeValue() {
        return dictionaryTypeValue;
    }

    public void setDictionaryTypeValue(String dictionaryTypeValue) {
        this.dictionaryTypeValue = dictionaryTypeValue == null ? null : dictionaryTypeValue.trim();
    }

    public String getDictionaryTypeType() {
        return dictionaryTypeType;
    }

    public void setDictionaryTypeType(String dictionaryTypeType) {
        this.dictionaryTypeType = dictionaryTypeType == null ? null : dictionaryTypeType.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }
}