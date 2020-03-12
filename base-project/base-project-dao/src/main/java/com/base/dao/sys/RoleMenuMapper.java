package com.base.dao.sys;

import java.util.List;

import com.base.pojo.sys.Menu;
import com.base.pojo.sys.Role;
import com.base.pojo.sys.RoleMenuKey;


public interface RoleMenuMapper {

	int deleteByPrimaryKey(RoleMenuKey key);

	int insert(RoleMenuKey record);

	/** 角色一对多菜单 */
	Role selectByExample(Long roleId);
	
	int insertBatch(List<RoleMenuKey> roleMenuKeyList);
	
	int deleteBatchByPrimaryKey(List<RoleMenuKey> roleMenuKeyList);
	
	/** 菜单一对多角色 */
	Menu selectByMenuId(Long menuId);

}