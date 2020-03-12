package com.base.dao.sys;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.base.example.sys.JobExample;
import com.base.pojo.search.sys.JobFormBean;
import com.base.pojo.sys.Job;


/**
 * 
 * @ClassName:  JobMapper   
 * @Description:TODO 职位表-dao
 * @author: 李云飞
 * @date:   2019年11月29日 上午10:52:27   
 *   
 * 注意：本内容仅限于内部传阅，禁止外泄以及用于其他的商业目的
 */
public interface JobMapper {
    long countByExample(JobExample example);

    int deleteByExample(JobExample example);

    int deleteByPrimaryKey(Integer jobId);

    int insert(Job record);

    int insertSelective(Job record);

    List<Job> selectByExample(JobExample example);
    
    Job selectByConditions(JobExample example);

    Job selectByPrimaryKey(Integer jobId);

    int updateByExampleSelective(@Param("record") Job record, @Param("example") JobExample example);

    int updateByExample(@Param("record") Job record, @Param("example") JobExample example);

    int updateByPrimaryKeySelective(Job record);

    int updateByPrimaryKey(Job record);
    
    /**
        * 连表查询
     * @param example
     * @return
     */
    List<JobFormBean> customizationSelectByExample(JobExample example);
    
}