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
import com.base.pojo.search.sys.JobFormBean;
import com.base.pojo.sys.Job;
import com.base.service.sys.JobService;
import com.base.shiro.ShiroUtils;


/**
 * 
 * @ClassName:  JobController   
 * @Description:TODO 职位表-控制层
 * @author: 李云飞
 * @date:   2019年11月29日 下午5:16:30   
 *   
 * 注意：本内容仅限于内部传阅，禁止外泄以及用于其他的商业目的
 */
@RequestMapping("/job")
@Controller
public class JobController {
	
	@Resource
	private JobService jobService;
	
	/**
	 * 打开职位主页面
	 * @return
	 */
	@RequestMapping("/listView")
	public String listView(Model model) {
		model.addAttribute("titleName", "职位信息");
		return "job/jobList";
	}
	
	/**
	 * 查询所有职位 or 条件查询职位
	 * @param jobFormBean
	 * @return
	 */
	@RequestMapping("/getData")
	@ResponseBody
	public ResultUtil getData(JobFormBean jobFormBean) {
		return jobService.listByPage(jobFormBean);
	}
	
	/**
	 * 进入新增页面
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/toInsert")
	public String toInsert(Model model) {
		//查询所有职位
		Job job = new Job();
		List<Job> jobList = jobService.listDepartmentNonSort(job);
		model.addAttribute("titleName", "新增");
		model.addAttribute("jobList", jobList);
		return "job/jobAdd";
	}
	
	/**
	 * 进入修改页面
	 * @param model
	 * @param jobId
	 * @return
	 */
	@RequestMapping(value = "/toUpdate")
	public String toUpdate(Model model,Integer jobId) {
		if(null != jobId) {
			//查询所有职位
			Job job = new Job();
			job.setJobId(jobId);
			List<Job> jobList = jobService.listDepartmentNonSort(job);
			Job jobs = jobService.getJobById(jobId);
			model.addAttribute("job", jobs);
			model.addAttribute("jobList", jobList);
			return "job/jobEdit";
		}else {
			return "error";
		}
	}
	
	/**
	 * 执行职位新增
	 * @param job
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/insert")
	@ResponseBody
	public ResultBean insert(Job job, HttpServletRequest request){
		job.setCreateId(ShiroUtils.getAdminId());
		job.setCreateTime(new Date());
		if (jobService.save(job) > 0) {
			return new ResultBean(true);
		} else {
			return new ResultBean(false);
		}
	}
	
	/**
	 * 执行职位修改
	 * @param job
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/update")
	@ResponseBody
	public ResultBean update(Job job, HttpServletRequest request) {
		if(job.getJobParentId() == null) {
			job.setJobParentId(0);
		}
		job.setEditId(ShiroUtils.getAdminId());
		job.setEditTime(new Date());
		if (jobService.update(job) > 0) {
			return new ResultBean(true);
		} else {
			return new ResultBean(false);
		}
	}
	
	/**
	 *  执行职位删除
	 * @param jobId
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/delete")
	@ResponseBody
	public ResultBean delete(Integer jobId, HttpServletRequest request) {
		Integer state = jobService.delete(jobId);
		if (state == 1) {
			return new ResultBean(true);
		}else if(state == 2) {
			return new ResultBean(false,"有员工存在该职位");
		} else {
			return new ResultBean(false);
		}
	}

}
