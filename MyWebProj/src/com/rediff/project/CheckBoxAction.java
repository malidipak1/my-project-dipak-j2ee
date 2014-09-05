package com.rediff.project;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.rediff.beans.Magazine;

public class CheckBoxAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private List<Magazine> magazines = null;
	
	public List<Magazine> getMagazineList () {
		
		List<Magazine> magazines = new ArrayList<Magazine>();
		magazines.add(new Magazine("001", "The Economist"));
		magazines.add(new Magazine("502", "Business Week"));
		magazines.add(new Magazine("103", "Fortune"));
		magazines.add(new Magazine("514", "The Entepreneur"));
		return magazines;
	}
	
	public String execute() {
		this.setMagazines(getMagazineList());
		return ERROR;
		//return SUCCESS;
	}
	
	public void setMagazine(String[] codes) {
		for(String code: codes) {
			System.out.println(code + " is selected");
		}
	}

	public List<Magazine> getMagazines() {
		return magazines;
	}

	public void setMagazines(List<Magazine> magazines) {
		this.magazines = magazines;
	}
	
	
}
