package com.carsdirect.model;

import java.io.Serializable;

public class CpVendor implements Serializable {

	protected Integer CpVendorID;

	protected Integer VendorID;
	
	protected String Name;
	
	protected String Description;
	
	
	public Integer getCpVendorID() {
		return CpVendorID;
	}

	public void setCpVendorID(Integer cpVendorID) {
		CpVendorID = cpVendorID;
	}

	public Integer getVendorID() {
		return VendorID;
	}

	public void setVendorID(Integer vendorID) {
		VendorID = vendorID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
	
	
	
	
}
