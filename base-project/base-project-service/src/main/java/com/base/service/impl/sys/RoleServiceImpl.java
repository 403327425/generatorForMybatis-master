/**
 * 
 */
package com.base.service.impl.sys;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.base.commons.ResultUtil;
import com.base.dao.sys.AdminMapper;
import com.base.dao.sys.RoleMapper;
import com.base.dao.sys.RoleMenuMapper;
import com.base.example.sys.RoleExample;
import com.base.pojo.sys.Menu;
import com.base.pojo.sys.Role;
import com.base.pojo.sys.RoleMenuKey;
import com.base.service.sys.RoleService;

/**
 * 
 * <p>
 * Title: LwRolesServiceImpl
 * </p>
 * 
 * <p>
 * Description:超级管理员角色不允许查询修改删除
 * </p>
 * 
 * @author lixinrong
 * 
 * @date 2019年3月29日
 * 
 */
@Service
public class RoleServiceImpl implements RoleService {
	@Resource
	private RoleMapper roleMapper;
	@Resource
	private RoleMenuMapper roleMenuMapper;
	@Resource
	private AdminMapper employeeMapper;

	@Override
	@Transactional(rollbackFor = { RuntimeException.class, Exception.class })
	public int deleteByPrimaryKey(Long roleId) {
		if (roleId == 1L) {
			return 0;
		}
		Role roles = roleMapper.customizationSelectByPrimaryKey(roleId);
		if (roles == null) {
			return 0;
		}
		if(!roles.getEmployeeList().isEmpty()) {
			employeeMapper.updatePropertyOfNull(roles.getEmployeeList());
		}
		
		List<RoleMenuKey> rolesMenusKeys = adapterRolesMenusKeys(roleId);
		if (!rolesMenusKeys.isEmpty()) {
			roleMenuMapper.deleteBatchByPrimaryKey(rolesMenusKeys);
		}
		return roleMapper.deleteByPrimaryKey(roleId);
	}

	private int insertSelective(Role record) {
		int i = roleMapper.insertSelective(record);
		List<RoleMenuKey> list = new ArrayList<RoleMenuKey>();
		for (Menu menu : record.getMenuList()) {
			list.add(new RoleMenuKey(record.getRoleId(), menu.getMenuId()));
		}
		roleMenuMapper.insertBatch(list);
		return i;
	}

	@Override
	@Transactional(rollbackFor = { RuntimeException.class, Exception.class })
	public int saveOrUpdate(Role role) {
		if (role.getRoleId() == null) {
			return insertSelective(role);
		} else {
			List<RoleMenuKey> rolesMenusKeys = adapterRolesMenusKeys(role.getRoleId());
			if (!rolesMenusKeys.isEmpty()) {
				roleMenuMapper.deleteBatchByPrimaryKey(rolesMenusKeys);
			}
			List<Menu> menuList = role.getMenuList();
			if (!menuList.isEmpty()) {
				List<RoleMenuKey> list = new ArrayList<RoleMenuKey>();
				for (Menu menu : menuList) {
					list.add(new RoleMenuKey(role.getRoleId(), menu.getMenuId()));
				}
				roleMenuMapper.insertBatch(list);
			}
			return roleMapper.updateByPrimaryKeySelective(role);
		}
	}

	@Override
	public ResultUtil listByExample(Integer pageIndex, Integer pageSize, Role record) {
		PageHelper.startPage(pageIndex, pageSize);
		RoleExample example = new RoleExample();
		RoleExample.Criteria criteria = example.createCriteria();
		criteria.andRoleIdNotEqualTo(1L);
		List<Role> list = roleMapper.selectByExample(example);
		PageInfo<Role> pageInfo = new PageInfo<Role>(list);
		ResultUtil resultUtil = new ResultUtil();
		resultUtil.setCount(pageInfo.getTotal());
		resultUtil.setData(pageInfo.getList());
		resultUtil.setCode(0);
		return resultUtil;
	}

	@Override
	public List<Role> list() {
		RoleExample example = new RoleExample();
		RoleExample.Criteria criteria = example.createCriteria();
		criteria.andRoleIdNotEqualTo(1L);
		return roleMapper.selectByExample(example);
	}

	private List<RoleMenuKey> adapterRolesMenusKeys(Long roleId) {
		List<RoleMenuKey> list = new ArrayList<RoleMenuKey>();
		Role roles = roleMenuMapper.selectByExample(roleId);
		if (roles != null) {
			List<Menu> menuList = roles.getMenuList();
			for (Menu menu : menuList) {
				list.add(new RoleMenuKey(roleId, menu.getMenuId()));
			}
		}
		return list;
	}

}
