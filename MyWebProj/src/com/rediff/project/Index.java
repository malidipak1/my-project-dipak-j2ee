package com.rediff.project;

import com.opensymphony.xwork2.ActionSupport;

public class Index extends ActionSupport {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5110578473456324245L;

	private String name = "dipak";
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String execute() {
		
		return SUCCESS;
	}
}
