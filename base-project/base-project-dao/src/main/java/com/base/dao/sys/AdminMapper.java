package com.base.dao.sys;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.base.example.sys.AdminExample;
import com.base.pojo.sys.Admin;

/**
 * 
 * @ClassName: EmployeeMapper
 * @Desc: 员工mapper
 * @author: lxr
 * @date: 2019年6月15日 下午4:37:56
 * @version 1.0
 */
public interface AdminMapper {
    int countByExample(AdminExample example);

    int deleteByExample(AdminExample example);

    int deleteByPrimaryKey(Integer adminId);

    int insert(Admin record);

    int insertSelective(Admin record);

    List<Admin> selectByExample(AdminExample example);
    
    List<Admin> customizationSelectByExample(AdminExample example);

    Admin selectByPrimaryKey(Integer adminId);
    
    Admin customizationSelectByPrimaryKey(Integer adminId);

    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
    /**批量设置角色ID部门ID职位ID为NULL*/
    int updatePropertyOfNull(List<Admin> adminList);
}