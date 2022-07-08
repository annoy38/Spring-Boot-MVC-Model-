package com.springMVCModel.springMVCmodel.patientData;

public class patientDataClass {
	
	private String pName;
	private String pAddress;
	private String pDisease;
	
	public patientDataClass() {
		super();
	}
	
	public patientDataClass(String pName, String pAddress, String pDisease) {
		this.pName = pName;
		this.pAddress = pAddress;
		this.pDisease = pDisease;
	}

	public String getpName() {
		return pName;
	}

	public String getpAddress() {
		return pAddress;
	}

	public String getpDisease() {
		return pDisease;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}

	public void setpDisease(String pDisease) {
		this.pDisease = pDisease;
	}
	
	public String toString() {
		return "Patient Data: "+pName+" "+pAddress+" "+pDisease+" ";
	}

}
