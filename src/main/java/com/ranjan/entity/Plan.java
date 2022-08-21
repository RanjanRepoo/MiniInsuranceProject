package com.ranjan.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "PLAN_MASTER")
@Data
public class Plan {
	
	 @Id @GeneratedValue
	@Column(name = "PLAN_ID")
	public int planId;
	@Column(name = "PLAN_NAME")
	public String planName;
	@Column(name = "PLAN_START_DATE")
	public Date planStartDate;
	@Column(name = "PLAN_END_DATE")
	public Date planEndDate;
	@Column(name = "PLAN_CATEGORY_ID")
	public int planCategoryId;
	@Column(name = "ACTIVE_SW")
	public String activeSw;
	@Column(name = "CREATE_DATE")
	public Date createDate;
	@Column(name = "UPDATE_DATE")
	public Date updateDate;
	@Column(name = "CREATED_BY")
	public String createdBy;
	@Column(name = "UPDATED_BY")
	public String updatedBy;
	
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public Date getPlanStartDate() {
		return planStartDate;
	}
	public void setPlanStartDate(Date planStartDate) {
		this.planStartDate = planStartDate;
	}
	public Date getPlanEndDate() {
		return planEndDate;
	}
	public void setPlanEndDate(Date planEndDate) {
		this.planEndDate = planEndDate;
	}
	public int getPlanCategoryId() {
		return planCategoryId;
	}
	public void setPlanCategoryId(int planCategoryId) {
		this.planCategoryId = planCategoryId;
	}
	public String getActiveSw() {
		return activeSw;
	}
	public void setActiveSw(String activeSw) {
		this.activeSw = activeSw;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	@Override
	public String toString() {
		return "Plan [planId=" + planId + ", planName=" + planName + ", planStartDate=" + planStartDate
				+ ", planEndDate=" + planEndDate + ", planCategoryId=" + planCategoryId + ", activeSw=" + activeSw
				+ ", createDate=" + createDate + ", updateDate=" + updateDate + ", createdBy=" + createdBy
				+ ", updatedBy=" + updatedBy + "]";
	}
	
	

}
