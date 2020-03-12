/**
 * 
 */
package com.base.service.impl.sys;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.base.commons.ResultUtil;
import com.base.dao.sys.AdminInfoMapper;
import com.base.dao.sys.AdminMapper;
import com.base.example.sys.AdminExample;
import com.base.pojo.sys.Admin;
import com.base.pojo.sys.AdminInfo;
import com.base.service.sys.AdminService;

/**
 * 
 * <p>
 * Title: AdminServiceImpl
 * </p>
 * 
 * <p>
 * Description:超级管理员不允许查询修改删除
 * </p>
 * 
 * @author lixinrong
 * 
 * @date 2019年3月29日
 * 
 */
@Service
public class AdminServiceImpl implements AdminService {

	@Resource
	private AdminMapper adminMapper;
	@Resource
	private AdminInfoMapper adminInfoMapper;

	@Override
	@Transactional(rollbackFor = { RuntimeException.class, Exception.class })
	public int deleteByPrimaryKey(Integer adminId) {
		if (adminId == 1) {
			return 0;
		}
		Admin admin = getAdminByPrimaryKey(adminId);
		if (admin == null) {
			return 0;
		}
		adminInfoMapper.deleteByPrimaryKey(adminId);
		return adminMapper.deleteByPrimaryKey(adminId);
	}

	@Override
	public ResultUtil listOrByWhere(Integer pageIndex, Integer pageSize, Admin admin) {
		PageHelper.startPage(pageIndex, pageSize);
		AdminExample example = new AdminExample();
		AdminExample.Criteria criteria = example.createCriteria();
		// 不显示超级管理员
		criteria.andAdminIdNotEqualTo(1);
		// 不显示自己
		criteria.andAdminIdNotEqualTo(admin.getAdminId());
		List<Admin> list = adminMapper.customizationSelectByExample(example);
		PageInfo<Admin> pageInfo = new PageInfo<Admin>(list);
		ResultUtil resultUtil = new ResultUtil();
		resultUtil.setCount(pageInfo.getTotal());
		resultUtil.setData(pageInfo.getList());
		resultUtil.setCode(0);
		return resultUtil;
	}

	@Override
	public Admin getAdminByPrimaryKey(Integer adminId) {
		if (adminId == 1) {
			return null;
		}
		return adminMapper.customizationSelectByPrimaryKey(adminId);
	}

	@Override
	public Admin getAdminByWhere(Admin admin) {
		AdminExample example = new AdminExample();
		AdminExample.Criteria criteria = example.createCriteria();
		criteria.andAdminLoginNameEqualTo(admin.getAdminLoginName());
		List<Admin> list = adminMapper.customizationSelectByExample(example);
		if (list.isEmpty() || list.size() > 1) {
			return null;
		}
		return list.get(0);
	}

	@Override
	@Transactional(rollbackFor = { RuntimeException.class, Exception.class })
	public int saveOrUpdate(Admin admin) {
		System.out.println("======="+admin.getAdminId());
		if (admin.getAdminId() == null) {
			Admin foundAdmin = getAdminByWhere(admin);
			if(foundAdmin!=null) {
				return -1;
			}
			/* admin.setAdminNickName(MyUtil.getRandomNickName()); */
			adminMapper.insertSelective(admin);
			return adminInfoMapper.insertSelective(new AdminInfo(admin.getAdminId()));
		} else {
//			if(admin.getAdminInfo()!=null) {
//				adminInfoMapper.updateByPrimaryKeySelective(admin.getAdminInfo());
//			}
			return adminMapper.updateByPrimaryKeySelective(admin);
		}
	}

	@Override
	public List<Admin> getNotAdmin() {
		AdminExample example = new AdminExample();
		AdminExample.Criteria criteria = example.createCriteria();
		criteria.andAdminLoginNameNotEqualTo("admin");
		return adminMapper.selectByExample(example);
	}

	@Override
	public Admin getByOpenId(String openId) {
		if(StringUtils.isEmpty(openId)) {
			return null;
		}
		AdminExample example = new AdminExample();
		AdminExample.Criteria criteria = example.createCriteria();
		criteria.andOpenIdEqualTo(openId);
		List<Admin> list = adminMapper.selectByExample(example);
		if(list == null || list.size() < 1) {
			return null;
		}
		return list.get(0);
	}

	@Override
	public int updateOpenId(Admin admin) {
		if(admin == null || admin.getAdminId() == null) {
			return 0;
		}
		Integer adminId = admin.getAdminId();
		Admin oldAdmin = getByOpenId(admin.getOpenId());
		if(oldAdmin == null) {
			//并无绑定改openid的账号
			return adminMapper.updateByPrimaryKeySelective(admin);
		}
		if(oldAdmin.getAdminId().intValue() == adminId) {
			//已经绑定的账号为同一个账号
			return 1;
		}
		//已有不同的账号绑定了
		return -1;
	}

	@Override
	public List<Admin> getByDepartmentId(Integer departmentId) {
		AdminExample example = new AdminExample();
		AdminExample.Criteria criteria = example.createCriteria();
		if(departmentId == null) {
			return null;
		}
		criteria.andDepartmentIdEqualTo(departmentId);
		return adminMapper.selectByExample(example);
	}

	@Override
	public Admin getAdminByName(String name) {
		AdminExample example = new AdminExample();
		AdminExample.Criteria criteria = example.createCriteria();
		criteria.andAdminLoginNameEqualTo(name);
		List<Admin> list = adminMapper.selectByExample(example);
		if(list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

}
