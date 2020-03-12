package com.base.service.sys;

import java.util.List;

import com.base.commons.ResultUtil;
import com.base.pojo.search.sys.JobFormBean;
import com.base.pojo.sys.Job;


/**
 * 
 * @ClassName:  JobService   
 * @Description:TODO 职位表-接口类
 * @author: 李云飞
 * @date:   2019年11月29日 上午11:00:57   
 *   
 * 注意：本内容仅限于内部传阅，禁止外泄以及用于其他的商业目的
 */
public interface JobService {
	
	/**
	 * 新增职位
	 * @param job
	 * @return
	 */
	int save(Job job);
	
	/**
	 * 编辑职位
	 * @param job
	 * @return
	 */
	int update(Job job);
	
	/**
	 * 删除职位 
	 * @param jobId
	 * @return
	 */
	int delete(Integer jobId);
	
	/**
	 * 查询所有职位 or 条件查询职位
	 * @param jobFormBean
	 * @return
	 */
	ResultUtil listByPage(JobFormBean jobFormBean);
	
	/**
	 *  查询所有职位信息
	 * @param job
	 * @return
	 */
	List<Job> listDepartmentNonSort(Job job);
	
	/**
	 * 根据职位id查询
	 * @param jobId
	 * @return
	 */
	Job getJobById(Integer jobId);
	
	/**
	 * 自定义条件查询
	 * @param jobFormBean
	 * @return
	 */
	Job findByConditions(JobFormBean jobFormBean);

}
