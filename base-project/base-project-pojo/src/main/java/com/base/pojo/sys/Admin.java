package com.base.pojo.sys;



public class Admin implements java.io.Serializable{
	/**
	 * @Fields serialVersionUID: 
	 */
	private static final long serialVersionUID = 1L;

	/** 员工id*/
    private Integer adminId;

    /** 员工登录名称*/
    private String adminLoginName;

    /** 员工登录密码*/
    private String adminLoginPassword;

    /** 员工昵称*/
    private String adminNickName;

    /** 角色id*/
    private Integer roleId;

    /** 部门id*/
    private Integer departmentId;

    /** 职位id*/
    private Integer jobId;

    /** 状态(0未激活1正常)*/
    private Boolean adminStatus;
    /**openID*/
    private String openId;
    
    private AdminInfo adminInfo;
    private Department department;
    private Role role;
    private Job job;

    public Admin() {}

	public Admin(String adminLoginName) {
		this.adminLoginName = adminLoginName;
	}

	public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminLoginName() {
        return adminLoginName;
    }

    public void setAdminLoginName(String adminLoginName) {
        this.adminLoginName = adminLoginName == null ? null : adminLoginName.trim();
    }

    public String getAdminLoginPassword() {
        return adminLoginPassword;
    }

    public void setAdminLoginPassword(String adminLoginPassword) {
        this.adminLoginPassword = adminLoginPassword == null ? null : adminLoginPassword.trim();
    }

    public String getAdminNickName() {
        return adminNickName;
    }

    public void setAdminNickName(String adminNickName) {
        this.adminNickName = adminNickName == null ? null : adminNickName.trim();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }


	public Boolean getAdminStatus() {
		return adminStatus;
	}

	public void setAdminStatus(Boolean adminStatus) {
		this.adminStatus = adminStatus;
	}

	public AdminInfo getAdminInfo() {
		return adminInfo;
	}

	public void setAdminInfo(AdminInfo adminInfo) {
		this.adminInfo = adminInfo;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminLoginName=" + adminLoginName
				+ ", adminLoginPassword=" + adminLoginPassword + ", adminNickName=" + adminNickName
				+ ", roleId=" + roleId + ", departmentId=" + departmentId + ", jobId=" + jobId + ", adminStatus="
				+ adminStatus + "]";
	}
}