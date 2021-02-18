package com.task.resoucemanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "RESOURCES")
public class Resource {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "RESOURCE_ID")
	private int resourceId;
	
	@NotNull(message = "Name is mandatory")
	@Column(name = "RESOURCE_NAME")
	private String resourceName;

	@NotNull(message = "Enterprize ID is mandatory")
	@Column(name = "RESOURCE_ENT_ID")
	private String resourceEntId;

	@Email(message = "Email ID is mandatory")
	@Column(name = "RESOURCE_EMAIL_ID")
	private String resourceEmailId;

	@NotNull(message = "SAP Number is mandatory")
	@Column(name = "RESOURCE_SAP_NUMBER")
	private double resourceSAPNo;

	@NotNull(message = "State Y or N")
	@Column(name = "BILLABLE")
	private String billability;

	@NotNull(message = "State OnShone or OffShore")
	@Column(name = "LOCATION")
	private String location;

	public int getResourceId() {
		return resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getResourceEntId() {
		return resourceEntId;
	}

	public void setResourceEntId(String resourceEntId) {
		this.resourceEntId = resourceEntId;
	}

	public String getResourceEmailId() {
		return resourceEmailId;
	}

	public void setResourceEmailId(String resourceEmailId) {
		this.resourceEmailId = resourceEmailId;
	}

	public double getResourceSAPNo() {
		return resourceSAPNo;
	}

	public void setResourceSAPNo(double resourceSAPNo) {
		this.resourceSAPNo = resourceSAPNo;
	}

	public String getBillability() {
		return billability;
	}

	public void setBillability(String billability) {
		this.billability = billability;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
