package com.base.service.sys;

import java.util.List;

import com.base.commons.ResultUtil;
import com.base.pojo.search.sys.DepartmentFormBean;
import com.base.pojo.sys.Department;


/**
 * 
 * @ClassName:  DepartmentService   
 * @Description:TODO 部门表-接口类
 * @author: 李云飞
 * @date:   2019年11月29日 上午10:56:31   
 *   
 * 注意：本内容仅限于内部传阅，禁止外泄以及用于其他的商业目的
 */
public interface DepartmentService {
	
	/**
	 * 新增部门
	 * @param department
	 * @return
	 */
	int save(Department department);
	
	/**
	 * 编辑部门
	 * @param department
	 * @return
	 */
	int update(Department department);
	
	/**
	 * 删除部门 
	 * @param departmentId
	 * @return
	 */
	int delete(Integer departmentId);
	
	/**
	 * 查询所有部门 or 条件查询部门
	 * @param departmentFormBean
	 * @return
	 */
	ResultUtil listByPage(DepartmentFormBean departmentFormBean);
	
	/**
	 *  查询所有部门信息
	 * @param department
	 * @return
	 */
	List<Department> listDepartmentNonSort(Department department);
	
	/**
	 * 根据部门id查询
	 * @param departmentId
	 * @return
	 */
	Department getDepartmentById(Integer departmentId);
	
	/**
	 * 自定义条件查询
	 * @param departmentFormBean
	 * @return
	 */
	Department findByConditions(DepartmentFormBean departmentFormBean);
}
