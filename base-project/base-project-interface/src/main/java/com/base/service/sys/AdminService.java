package com.base.service.sys;

import java.util.List;

import com.base.commons.ResultUtil;
import com.base.pojo.sys.Admin;


/**
 * 
 * 
 * <p>
 * Title: AdminService
 * </p>
 * 
 * <p>
 * Description: 员工业务
 * </p>
 * 
 * @author lixinrong
 * 
 * @date 2019年4月4日
 */
public interface AdminService {

	/**
	 * 
	 * 
	 * <p>
	 * Title: deleteByPrimaryKey
	 * </p>
	 * 
	 * <p>
	 * Description:按主键删除单个
	 * </p>
	 * 
	 * @param adminId
	 * @return
	 */
	int deleteByPrimaryKey(Integer AdminId);

	/**
	 * 
	 * 
	 * <p>
	 * Title: listOrByWhere
	 * </p>
	 * 
	 * <p>
	 * Description:分页获取列表
	 * </p>
	 * 
	 * @param pageIndex
	 * @param pageSize
	 * @param record
	 * @return
	 */
	ResultUtil listOrByWhere(Integer pageIndex, Integer pageSize, Admin admin);

	/**
	 * 
	 * 
	 * <p>
	 * Title: getAdminByPrimaryKey
	 * </p>
	 * 
	 * <p>
	 * Description:按主键获取单个
	 * </p>
	 * 
	 * @param adminId
	 * @return
	 */
	Admin getAdminByPrimaryKey(Integer AdminId);

	/**
	 * 
	 * 
	 * <p>
	 * Title: getAdminByWhere
	 * </p>
	 * 
	 * <p>
	 * Description:按唯一条件获取单个
	 * </p>
	 * 
	 * @param record
	 * @return
	 */
	Admin getAdminByWhere(Admin admin);

	/**
	 * 
	 * 
	 * <p>
	 * Title: saveOrUpdate
	 * </p>
	 * 
	 * <p>
	 * Description:新增或更新
	 * </p>
	 * 
	 * @param Admin
	 * @param fkId
	 * @param skId
	 * @return
	 */
	int saveOrUpdate(Admin admin);
	
	/**
	 * 获取非admin的所有账号
	 * @return
	 */
	List<Admin> getNotAdmin();
	
	/**
	 * 根据openId获得
	 * @param openId
	 * @return
	 */
	Admin getByOpenId(String openId);
	
	/**
	 * 绑定openid
	 * @param admin
	 * @return
	 */
	int updateOpenId(Admin admin);
	
	/**
	 * 获取整个部门的人
	 */
	List<Admin> getByDepartmentId(Integer departmentId);
	
	Admin getAdminByName(String name);
}