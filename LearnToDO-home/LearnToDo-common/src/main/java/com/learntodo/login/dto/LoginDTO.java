package com.learntodo.login.dto;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class LoginDTO {
	
	private String lgnUserName;
	private String lgnUserEmail;
	private String lgnUserPwd;
	private String type;
	private List<String> errorList;
	
	public String getLoginUserName() {
		return lgnUserName;
	}
	public void setLoginUserName(String loginUserName) {
		lgnUserName = loginUserName;
	}
	public String getLoginUserEmail() {
		return lgnUserEmail;
	}
	public void setLoginUserEmail(String loginUserEmail) {
		lgnUserEmail = loginUserEmail;
	}
	public String getLoginUserPwd() {
		return lgnUserPwd;
	}
	public void setLoginUserPwd(String loginUserPwd) {
		lgnUserPwd = loginUserPwd;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<String> getErrorList() {
		return errorList;
	}
	public void setErrorList(List<String> errorList) {
		this.errorList = errorList;
	}
	@Override
	public String toString() {
		return "LoginDTO [LoginUserName=" + lgnUserName + ", LoginUserEmail="
				+ lgnUserEmail + ", LoginUserPwd=" + lgnUserPwd + "]";
	}
	

}
