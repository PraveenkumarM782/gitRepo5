package com.health.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private String eid;
	private String ename;
	private String edept;
	
	public Employee() {
		super();
	}
	
	
	public Employee(String eid, String ename, String edept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edept = edept;
	}


	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdept() {
		return edept;
	}
	public void setEdept(String edept) {
		this.edept = edept;
	}
	
	
	
}
