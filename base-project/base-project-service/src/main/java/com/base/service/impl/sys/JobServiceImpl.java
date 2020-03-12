package com.base.service.impl.sys;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.base.commons.ResultUtil;
import com.base.dao.sys.JobMapper;
import com.base.example.sys.JobExample.Criteria;
import com.base.example.sys.JobExample;
import com.base.pojo.search.sys.JobFormBean;
import com.base.pojo.sys.Job;
import com.base.service.sys.JobService;


/**
 * 
 * @ClassName:  JobServiceImpl   
 * @Description:TODO 职位表-接口实现类
 * @author: 李云飞
 * @date:   2019年11月29日 上午11:41:42   
 *   
 * 注意：本内容仅限于内部传阅，禁止外泄以及用于其他的商业目的
 */
@Service
public class JobServiceImpl implements JobService{
	
	@Resource
	private JobMapper jobMapper;
	
//	@Resource
//	private UsersMapper usersMapper;

	/**
	 * 新增职位
	 */
	@Override
	public int save(Job job) {
		return jobMapper.insertSelective(job);
	}

	/**
	 * 编辑职位
	 */
	@Override
	public int update(Job job) {
		return jobMapper.updateByPrimaryKeySelective(job);
	}

	/**
	 * 删除职位 
	 */
	@Override
	public int delete(Integer jobId) {
		int result = 0;
//		//查询是否存在员工在使用职位 
//		if(usersMapper.selectJob(jobId) <= 0) {
//			//删除职位
//			if(jobMapper.deleteByPrimaryKey(jobId) > 0) {
//				//编辑存在用上级职位的上职位设置为0
//				Job record = new Job();
//				record.setJobParentId(0);
//				JobExample example = new JobExample();
//				Criteria criteria = example.createCriteria();
//				criteria.andJobParentIdEqualTo(jobId);
//				jobMapper.updateByExampleSelective(record, example);
//				result = 1;
//			}
//			result = 0;
//		}else {
//			result = 2;
//		}
		return result;
	}

	/**
	 * 查询所有职位 or 条件查询职位
	 */
	@Override
	public ResultUtil listByPage(JobFormBean jobFormBean) {
		PageHelper.startPage(jobFormBean.getPage(), jobFormBean.getLimit());
		JobExample example = new JobExample();
		Criteria criteria = example.createCriteria();

		if (!StringUtils.isEmpty(jobFormBean.getJobName())) {
			criteria.andJobNameLike("%"+jobFormBean.getJobName()+"%");
		}

		List<JobFormBean> logs = jobMapper.customizationSelectByExample(example);
		PageInfo<JobFormBean> pageInfo = new PageInfo<JobFormBean>(logs);
		ResultUtil resultUtil = new ResultUtil();
		resultUtil.setCode(0);
		resultUtil.setCount(pageInfo.getTotal());
		resultUtil.setData(pageInfo.getList());
		return resultUtil;
	}

	/**
	 * 查询所有职位信息
	 */
	@Override
	public List<Job> listDepartmentNonSort(Job job) {
		JobExample example = new JobExample();
		Criteria criteria = example.createCriteria();

		if (!StringUtils.isEmpty(job.getJobId())) {
			criteria.andJobIdNotEqualTo(job.getJobId());
		}
		return jobMapper.selectByExample(example);
	}

	/**
	 * 根据职位id查询
	 */
	@Override
	public Job getJobById(Integer jobId) {
		return jobMapper.selectByPrimaryKey(jobId);
	}
	
	/**
	 * 自定义条件查询
	 */
	@Override
	public Job findByConditions(JobFormBean jobFormBean) {
		JobExample example = new JobExample();
		Criteria criteria = example.createCriteria();
		if (!StringUtils.isEmpty(jobFormBean.getJobName())) {
			criteria.andJobNameEqualTo(jobFormBean.getJobName());
		}
		return jobMapper.selectByConditions(example);
	}

}
