package com.ranjan.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name ="PLAN_CATEGORY")
@Data
public class PlanCategory {
	
	 @Id @GeneratedValue
	@Column(name ="CATEGORY_ID")
	public int categoryId;
	@Column(name ="CATEGORY_NAME")
	public String categoryName;
	@Column(name ="ACTIVE_SW")
	public String activeSw;
	@Column(name ="CREATE_DATE")
	public Date createDate;
	@Column(name ="UPDATE_DATE")
	public Date updateDate;
	@Column(name ="CREATED_BY")
	public String createdBy;
	@Column(name ="UPDATED_BY")
	public String updatedBy;
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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
		return "PlanCategory [categoryId=" + categoryId + ", categoryName=" + categoryName + ", activeSw=" + activeSw
				+ ", createDate=" + createDate + ", updateDate=" + updateDate + ", createdBy=" + createdBy
				+ ", updatedBy=" + updatedBy + "]";
	}
	
	

}
