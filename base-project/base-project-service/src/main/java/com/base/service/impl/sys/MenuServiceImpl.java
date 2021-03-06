/**
 * 
 */
package com.base.service.impl.sys;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageInfo;
import com.base.commons.ResultUtil;
import com.base.dao.sys.MenuMapper;
import com.base.dao.sys.RoleMenuMapper;
import com.base.example.sys.MenuExample;
import com.base.pojo.sys.Menu;
import com.base.pojo.sys.Role;
import com.base.pojo.sys.RoleMenuKey;
import com.base.service.sys.MenuService;
import com.base.service.util.MenuAdapterUtil;


/**
 * 
 * <p>
 * Title: LwMenusServiceImpl
 * </p>
 * 
 * <p>
 * Description:菜单接口实现
 * </p>
 * 
 * @author lixinrong
 * 
 * @date 2019年3月29日
 * 
 */
@Service
public class MenuServiceImpl implements MenuService {
	@Resource
	private MenuMapper menuMapper;
	@Resource
	private RoleMenuMapper roleMenuMapper;

	@Override
	@Transactional(rollbackFor = { RuntimeException.class, Exception.class })
	public int deleteByPrimaryKey(Long menuId) {
		Menu menu = getByPrimaryKey(menuId);
		if (menu == null) {
			return 0;
		}
		MenuExample example = new MenuExample();
		MenuExample.Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(menuId);
		int count = menuMapper.countByExample(example);
		if (count > 0) {
			return 0;
		}
		Menu oldMenu = roleMenuMapper.selectByMenuId(menuId);
		if (oldMenu != null) {
			List<RoleMenuKey> list = new ArrayList<RoleMenuKey>();
			for (Role role : oldMenu.getRoleList()) {
				list.add(new RoleMenuKey(role.getRoleId(), oldMenu.getMenuId()));
			}
			if (!list.isEmpty()) {
				roleMenuMapper.deleteBatchByPrimaryKey(list);
			}
		}
		return menuMapper.deleteByPrimaryKey(menu.getMenuId());
	}

	@Override
	public ResultUtil listByExample(Menu record) {
		MenuExample example = new MenuExample();
		example.setOrderByClause("IFNULL(menu.sorting,1) ASC");
		List<Menu> list = menuMapper.selectByExample(example);
		PageInfo<Menu> pageInfo = new PageInfo<Menu>(list);
		ResultUtil resultUtil = new ResultUtil();
		resultUtil.setCount(pageInfo.getTotal());
		resultUtil.setData(pageInfo.getList());
		resultUtil.setCode(0);
		return resultUtil;
	}

	@Override
	public List<Menu> listMenu() {
		return MenuAdapterUtil.adapterMenuList(menuMapper.selectByExample(new MenuExample()));
	}

	@Override
	public Menu getByPrimaryKey(Long menuId) {
		return menuMapper.selectByPrimaryKey(menuId);
	}

	@Override
	public int saveOrUpdate(Menu menu) {
		if (menu.getMenuId() == null) {
			menu.setSpread("false");
			return menuMapper.insertSelective(menu);
		} else {
			return menuMapper.updateByPrimaryKeySelective(menu);
		}
	}

}
