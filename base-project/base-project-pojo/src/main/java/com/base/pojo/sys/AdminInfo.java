package com.base.pojo.sys;

public class AdminInfo implements java.io.Serializable  {
	/**
	 * @Fields serialVersionUID: TODO
	 */
	private static final long serialVersionUID = 1L;

	/** 员工id */
	private Integer adminId;

	/** 员工名称 */
	private String adminName;

	/** 员工性别 */
	private String adminSex;

	/** 员工邮箱 */
	private String adminEmail;

	/** 员工电话 */
	private String adminPhone;

	/** 员工通讯地址 */
	private String adminAddr;

	public AdminInfo() {
	}

	public AdminInfo(Integer adminId) {
		this.adminId = adminId;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = (adminName == null || adminName.trim() == "") ? null : adminName.trim();
	}

	public String getAdminSex() {
		return adminSex;
	}

	public void setAdminSex(String adminSex) {
		this.adminSex = adminSex == null ? null : adminSex.trim();
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = (adminEmail == null || adminEmail.trim() == "") ? null : adminEmail.trim();
	}

	public String getAdminPhone() {
		return adminPhone;
	}

	public void setAdminPhone(String adminPhone) {
		this.adminPhone = (adminPhone == null || adminPhone.trim() == "") ? null : adminPhone.trim();
	}

	public String getAdminAddr() {
		return adminAddr;
	}

	public void setAdminAddr(String adminAddr) {
		this.adminAddr = (adminAddr == null || adminAddr.trim() == "") ? null : adminAddr.trim();
	}
}