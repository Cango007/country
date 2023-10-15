package com.slokam.CountryInfo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class States {
	
	@Id
	@GeneratedValue
	private Integer stateId;
	@Column
	private String statesList;
	public Integer getStateId() {
		return stateId;
	}
	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}
	public String getStatesList() {
		return statesList;
	}
	public void setStatesList(String statesList) {
		this.statesList = statesList;
	}
	@Override
	public String toString() {
		return "States [stateId=" + stateId + ", statesList=" + statesList + "]";
	}
	public States(Integer stateId, String statesList) {
		super();
		this.stateId = stateId;
		this.statesList = statesList;
	}
	public States() {
		super();
	}
	
	

}
