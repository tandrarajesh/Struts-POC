package com.journaldev.struts2.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private String name;
	private String pwd;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String execute() throws Exception {
		if("pankaj".equals(getName()) && "admin".equals(getPwd()))
			return "SUCCESS";
			else return "ERROR";
		
	}
	
	@Override
	public void validate() {
		if("".equals(getName())) {
			addFieldError(name, "user name required");
		}
		if ("".equals(getPwd())) {
			addFieldError(pwd,"password required");
		}
	}
}
