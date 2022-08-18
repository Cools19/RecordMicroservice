package com.rec.entity;

public class Record {
	private Long cId;
	private String email;
	private String compName;
	private Long eId;
	public Record(Long cId, String email, String compName, Long eId) {
		super();
		this.cId = cId;
		this.email = email;
		this.compName = compName;
		this.eId = eId;
	}
	public Long getcId() {
		return cId;
	}
	public void setcId(Long cId) {
		this.cId = cId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public Long geteId() {
		return eId;
	}
	public void seteId(Long eId) {
		this.eId = eId;
	}
	

}
