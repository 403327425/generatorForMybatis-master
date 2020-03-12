package com.base.service.impl.sys;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.base.commons.ResultUtil;
import com.base.dao.sys.DepartmentMapper;
import com.base.example.sys.DepartmentExample;
import com.base.example.sys.DepartmentExample.Criteria;
import com.base.pojo.search.sys.DepartmentFormBean;
import com.base.pojo.sys.Department;
import com.base.service.sys.DepartmentService;

/**
 * 
 * @ClassName:  DepartmentServiceImpl   
 * @Description:TODO 部门表-接口实现类
 * @author: 李云飞
 * @date:   2019年11月29日 上午11:04:11   
 *   
 * 注意：本内容仅限于内部传阅，禁止外泄以及用于其他的商业目的
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Resource
	private DepartmentMapper departmentMapper;
	
//	@Resource
//	private UsersMapper usersMapper;
//	
//	@Resource
//	private SchedulingMapper schedulingMapper;

	/**
	 * 新增部门
	 */
	@Override
	public int save(Department department) {
		return departmentMapper.insertSelective(department);
	}

	/**
	 * 编辑部门
	 */
	@Override
	public int update(Department department) {
		return departmentMapper.updateByPrimaryKeySelective(department);
	}

	/**
	 * 删除部门 
	 */
	@Override
	public int delete(Integer departmentId) {
		int result = 0;
//		//查询是否存在员工在使用部门、查看部门是否存在排班
//		if(usersMapper.selectDepartment(departmentId) <= 0 && schedulingMapper.selectDepartment(departmentId) <= 0) {
//			//根据id删除部门
//			if(departmentMapper.deleteByPrimaryKey(departmentId) > 0) {
//				//编辑存在用上级部门的上级部门设置为0
//				Department record = new Department();
//				record.setDepartmentParentId(0);
//				DepartmentExample example = new DepartmentExample();
//				Criteria criteria = example.createCriteria();
//				criteria.andDepartmentParentIdEqualTo(departmentId);
//				departmentMapper.updateByExampleSelective(record, example);
//				result =  1;
//			}else {
//				result =  0;
//			}
//		}else {
//			result = 2;
//		}
		return result;
	}

	/**
	 * 查询所有部门 or 条件查询部门
	 */
	@Override
	public ResultUtil listByPage(DepartmentFormBean departmentFormBean) {
		PageHelper.startPage(departmentFormBean.getPage(), departmentFormBean.getLimit());
		DepartmentExample example = new DepartmentExample();
		Criteria criteria = example.createCriteria();

		if (!StringUtils.isEmpty(departmentFormBean.getDepartmentName())) {
			criteria.andDepartmentNameLike("%"+departmentFormBean.getDepartmentName()+"%");
		}

		if (!StringUtils.isEmpty(departmentFormBean.getDepartmentAddress())) {
			criteria.andDepartmentAddressLike("%"+departmentFormBean.getDepartmentAddress()+"%");
		}

		List<DepartmentFormBean> logs = departmentMapper.customizationSelectByExample(example);
		PageInfo<DepartmentFormBean> pageInfo = new PageInfo<DepartmentFormBean>(logs);
		ResultUtil resultUtil = new ResultUtil();
		resultUtil.setCode(0);
		resultUtil.setCount(pageInfo.getTotal());
		resultUtil.setData(pageInfo.getList());
		return resultUtil;
	}

	/**
	 *  查询所有部门信息
	 */
	@Override
	public List<Department> listDepartmentNonSort(Department department) {
		DepartmentExample example = new DepartmentExample();
		Criteria criteria = example.createCriteria();
		if (!StringUtils.isEmpty(department.getDepartmentId())) {
			criteria.andDepartmentIdNotEqualTo(department.getDepartmentId());
		}
		return departmentMapper.selectByExample(example);
	}

	/**
	 * 根据部门id查询
	 */
	@Override
	public Department getDepartmentById(Integer departmentId) {
		return departmentMapper.selectByPrimaryKey(departmentId);
	}
	
	/**
	 * 自定义条件查询
	 */
	@Override
	public Department findByConditions(DepartmentFormBean departmentFormBean) {
		DepartmentExample example = new DepartmentExample();
		Criteria criteria = example.createCriteria();
		if (!StringUtils.isEmpty(departmentFormBean.getDepartmentName())) {
			criteria.andDepartmentNameEqualTo(departmentFormBean.getDepartmentName());
		}
		return departmentMapper.findByConditions(example);
	}

}
