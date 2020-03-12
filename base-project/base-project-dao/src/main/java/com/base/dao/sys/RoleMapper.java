package com.base.dao.sys;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.base.example.sys.RoleExample;
import com.base.pojo.sys.Role;

/**
 * 
 * @ClassName: RoleMapper
 * @Desc: 角色mapper
 * @author: lxr
 * @date: 2019年6月15日 下午4:35:58
 * @version 1.0
 */
public interface RoleMapper {
    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(Long roleId);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(Long roleId);
    /**查询角色包含所有用户*/
    Role customizationSelectByPrimaryKey(Long roleId);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}