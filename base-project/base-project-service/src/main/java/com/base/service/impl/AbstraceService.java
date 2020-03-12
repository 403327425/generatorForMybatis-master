package com.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.base.dao.sys.DictionaryMapper;
import com.base.dao.sys.DictionaryTypeMapper;


/**
 * 
 * 
 * <p>
 * Title: AbstraceService
 * </p>
 * 
 * <p>
 * Description: 公共业务基类
 * </p>
 * 
 * @author lixinrong
 * 
 * @date 2019年3月28日
 */
public abstract class AbstraceService {
	@Autowired
	protected DictionaryMapper dictionaryMapper;
	@Autowired
	protected DictionaryTypeMapper dictionaryTypeMapper;
}
