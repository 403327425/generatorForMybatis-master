/**
 * 
 */
package com.base.service.impl.sys;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.base.dao.sys.MenuMapper;
import com.base.dao.sys.RoleMapper;
import com.base.dao.sys.RoleMenuMapper;
import com.base.example.sys.MenuExample;
import com.base.pojo.sys.Menu;
import com.base.pojo.sys.Role;
import com.base.pojo.sys.RoleMenuKey;
import com.base.service.sys.RoleMenuService;
import com.base.service.util.MenuAdapterUtil;


/**
 * 
 * <p>
 * Title: LwRolesMenusServiceImpl
 * </p>
 * 
 * <p>
 * Description:
 * </p>
 * 
 * @author lixinrong
 * 
 * @date 2019年3月29日
 * 
 */
@Service
public class RoleMenuServiceImpl implements RoleMenuService {
	@Resource
	private RoleMenuMapper roleMenuMapper;
	@Resource
	private RoleMapper roleMapper;
	@Resource
	private MenuMapper menuMapper;

	@Override
	public Role getRoleNoTree(RoleMenuKey record) {
		return roleMenuMapper.selectByExample(record.getRole().getRoleId());
	}

	@Override
	public Role getRole(RoleMenuKey record) {
		Role roles = null;
		if (record.getRole().getRoleId() == 1L) {
			// 超级管理拥有所有权限
			roles = roleMapper.selectByPrimaryKey(record.getRole().getRoleId());
			MenuExample menusExample = new MenuExample();
			menusExample.setOrderByClause("IFNULL(sorting,1) ASC");
			List<Menu> list = menuMapper.selectByExample(menusExample);
			roles.setMenuList(list);
		} else {
			roles = roleMenuMapper.selectByExample(record.getRole().getRoleId());
		}
		List<Menu> list = roles.getMenuList();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getPerms() != null && !"".equals(list.get(i).getPerms())) {
				roles.getPermsSet().add(list.get(i).getPerms());
			}
		}
		roles.setMenuList(MenuAdapterUtil.adapterMenuList(list));
		return roles;
	}

}
