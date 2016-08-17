package com.bootcamp.utilityservice.electricityplan.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "service")
public class ServicePlan implements Serializable{
	
	private static final long serialVersionUID = -5577579081118070434L;
	
	@Id
	@Column(name = "serviceId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int serviceId;
	private String servicePlan;
	private String serviceCharge;
	private String servicePeriod;
	
	/**
	 * @return the serviceId
	 */
	public int getServiceId() {
		return serviceId;
	}
	/**
	 * @param serviceId the serviceId to set
	 */
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	/**
	 * @return the servicePlan
	 */
	public String getServicePlan() {
		return servicePlan;
	}
	/**
	 * @param servicePlan the servicePlan to set
	 */
	public void setServicePlan(String servicePlan) {
		this.servicePlan = servicePlan;
	}
	/**
	 * @return the serviceCharge
	 */
	public String getServiceCharge() {
		return serviceCharge;
	}
	/**
	 * @param serviceCharge the serviceCharge to set
	 */
	public void setServiceCharge(String serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	/**
	 * @return the servicePeriod
	 */
	public String getServicePeriod() {
		return servicePeriod;
	}
	/**
	 * @param servicePeriod the servicePeriod to set
	 */
	public void setServicePeriod(String servicePeriod) {
		this.servicePeriod = servicePeriod;
	}

}
