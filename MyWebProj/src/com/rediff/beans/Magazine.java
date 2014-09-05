package com.rediff.beans;

public class Magazine {
	private String code;
	private String name;
	
	public Magazine(String code, String name) {
		// TODO Auto-generated constructor stub
		this.code = code;
		this.name = name;	
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
