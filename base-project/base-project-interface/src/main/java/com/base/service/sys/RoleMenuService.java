package com.base.service.sys;

import com.base.pojo.sys.Role;
import com.base.pojo.sys.RoleMenuKey;

/**
 * 
 * 
 * <p>
 * Title: RoleMenuService
 * </p>
 * 
 * <p>
 * Description: 角色连接菜单中间表
 * </p>
 * 
 * @author lixinrong
 * 
 * @date 2019年3月29日
 */
public interface RoleMenuService {

	/**
	 * 带树状结构菜单
	 * 
	 * @param record
	 * @return
	 */
	Role getRole(RoleMenuKey record);

	/**
	 * 带非树状结构菜单
	 * 
	 * @param record
	 * @return
	 */
	Role getRoleNoTree(RoleMenuKey record);

}