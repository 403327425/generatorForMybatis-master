package com.base.controller.sys;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.base.commons.ResultBean;
import com.base.commons.ResultUtil;
import com.base.pojo.search.sys.DepartmentFormBean;
import com.base.pojo.sys.Department;
import com.base.service.sys.DepartmentService;
import com.base.shiro.ShiroUtils;


/**
 * 
 * @ClassName:  DepartmentController   
 * @Description:TODO 部门表-控制层
 * @author: 李云飞
 * @date:   2019年12月3日 上午10:14:34   
 *   
 * 注意：本内容仅限于内部传阅，禁止外泄以及用于其他的商业目的
 */
@RequestMapping("/department")
@Controller
public class DepartmentController {

	@Resource
	private DepartmentService departmentService;

	/**
	 * 打开部门主页面
	 * @return
	 */
	@RequestMapping("/listView")
	public String listView(Model model) {
		model.addAttribute("titleName", "部门信息");
		return "department/departmentList";
	}
	
	/**
	 * 查询所有部门 or 条件查询部门
	 * @param departmentFormBean
	 * @return
	 */
	@RequestMapping("/getData")
	@ResponseBody
	public ResultUtil getData(DepartmentFormBean departmentFormBean) {
		return departmentService.listByPage(departmentFormBean);
	}
	
	/**
	 * 进入新增页面
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/toInsert")
	public String toInsert(Model model) {
		//查询所有部门
		Department department = new Department();
		List<Department> departmentList = departmentService.listDepartmentNonSort(department);
		model.addAttribute("titleName", "新增");
		model.addAttribute("departmentList", departmentList);
		return "department/departmentAdd";
	}
	
	/**
	 * 进入修改页面
	 * @param model
	 * @param departmentId
	 * @return
	 */
	@RequestMapping(value = "/toUpdate")
	public String toUpdate(Model model,Integer departmentId) {
		if(null != departmentId) {
			//查询所有部门
			Department department = new Department();
			department.setDepartmentId(departmentId);
			List<Department> departmentList = departmentService.listDepartmentNonSort(department);
			Department departments = departmentService.getDepartmentById(departmentId);
			model.addAttribute("departments", departments);
			model.addAttribute("departmentList", departmentList);
			return "department/departmentEdit";
		}else {
			return "error";
		}
	}
	
	/**
	 * 执行部门新增
	 * @param department
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/insert")
	@ResponseBody
	public ResultBean insert(Department department, HttpServletRequest request){
		department.setCreateId(ShiroUtils.getAdminId());
		department.setCreateTime(new Date());
		if (departmentService.save(department) > 0) {
			return new ResultBean(true);
		} else {
			return new ResultBean(false);
		}
	}
	
	/**
	 * 执行部门修改
	 * @param department
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/update")
	@ResponseBody
	public ResultBean update(Department department, HttpServletRequest request) {
		if(department.getDepartmentParentId() == null) {
			department.setDepartmentParentId(0);
		}
		department.setEditId(ShiroUtils.getAdminId());
		department.setEditTime(new Date());
		if (departmentService.update(department) > 0) {
			return new ResultBean(true);
		} else {
			return new ResultBean(false);
		}
	}
	
	/**
	 *  执行部门删除
	 * @param departmentId
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/delete")
	@ResponseBody
	public ResultBean delete(Integer departmentId, HttpServletRequest request) {
		Integer state = departmentService.delete(departmentId);
		if (state == 1) {
			return new ResultBean(true);
		} else if(state == 2){
			return new ResultBean(false,"有员工存在该部门或者有部门在排班");
		}else {
			return new ResultBean(false);
		}
	}
	
}
