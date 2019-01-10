package com.cnten.partybuildInter.modular.platnotice.entity;

import java.io.Serializable;

public class PlatNotice implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String noticeId;
	private String noticeName;
	private String noticeContent;
	private String noticeStartDate; 
	private String noticeEndDate; 
	private String createTime; 
	private String updateTime; 
	private String createUser; 
	private String updateUser;
	public String getNoticeId() {
		return noticeId;
	}
	public void setNoticeId(String noticeId) {
		this.noticeId = noticeId;
	}
	public String getNoticeName() {
		return noticeName;
	}
	public void setNoticeName(String noticeName) {
		this.noticeName = noticeName;
	}
	public String getNoticeContent() {
		return noticeContent;
	}
	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}
	public String getNoticeStartDate() {
		return noticeStartDate;
	}
	public void setNoticeStartDate(String noticeStartDate) {
		this.noticeStartDate = noticeStartDate;
	}
	public String getNoticeEndDate() {
		return noticeEndDate;
	}
	public void setNoticeEndDate(String noticeEndDate) {
		this.noticeEndDate = noticeEndDate;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	
}
