package com.base.pojo.search.sys;

import com.base.pojo.sys.Job;

/**
 * 
 * @ClassName:  Job   
 * @Description:TODO 职位表-前端页面表单对象基类
 * @author: 李云飞
 * @date:   2019年11月29日 上午10:33:25   
 *   
 * 注意：本内容仅限于内部传阅，禁止外泄以及用于其他的商业目的
 */
public class JobFormBean extends Job{
    
	/** 页码 */
	protected int page;
	/** 条目数 */
	protected int limit;
	/** 开始时间 */
	private String beginDate;
	/** 结束时间*/
   	private String endDate;
   	
   	/**连表查询**/
   	private String superiorName;
   	private String creatorName;
   	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public String getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getSuperiorName() {
		return superiorName;
	}
	public void setSuperiorName(String superiorName) {
		this.superiorName = superiorName;
	}
	public String getCreatorName() {
		return creatorName;
	}
	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}
	
}