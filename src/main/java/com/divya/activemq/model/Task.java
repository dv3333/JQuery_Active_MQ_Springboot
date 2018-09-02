package com.divya.activemq.model;

public class Task {
	private Long id;
	private String name;
	private String eRole;
	
	public Task(){
	}

	public String geteRole() {
		return eRole;
	}

	public void seteRole(String eRole) {
		this.eRole = eRole;
	}

	public Task(Long id, String name, String eRole){
		this.id = id;
		this.name = name;

		this.eRole = eRole;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
