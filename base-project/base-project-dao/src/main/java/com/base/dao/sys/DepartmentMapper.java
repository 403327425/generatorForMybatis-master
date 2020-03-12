package com.base.dao.sys;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.base.example.sys.DepartmentExample;
import com.base.pojo.search.sys.DepartmentFormBean;
import com.base.pojo.sys.Department;


/**
 * 
 * @ClassName:  DepartmentMapper   
 * @Description:TODO 部门表-dao
 * @author: 李云飞
 * @date:   2019年11月29日 上午10:51:57   
 *   
 * 注意：本内容仅限于内部传阅，禁止外泄以及用于其他的商业目的
 */
public interface DepartmentMapper {
    long countByExample(DepartmentExample example);

    int deleteByExample(DepartmentExample example);

    int deleteByPrimaryKey(Integer departmentId);

    int insert(Department record);

    int insertSelective(Department record);

    List<Department> selectByExample(DepartmentExample example);
    
    Department findByConditions(DepartmentExample example);

    Department selectByPrimaryKey(Integer departmentId);

    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByPrimaryKeySelective(Department record);
    
    int updateAddNumByPrimaryKey(Department record);
    
    int updateMinusNumByPrimaryKey(Department record);

    int updateByPrimaryKey(Department record);
    
    /**
         * 连表查询
     * @param example
     * @return
     */
    List<DepartmentFormBean> customizationSelectByExample(DepartmentExample example);
}