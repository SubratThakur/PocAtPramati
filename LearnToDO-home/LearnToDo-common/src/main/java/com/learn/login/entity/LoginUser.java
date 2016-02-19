package com.learn.login.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author Subrat
 *
 */
@Entity
@Table(name="login_user")
public class LoginUser {
	
 @Id
 @Column(name="login_user_id")
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private int login_user_id;
 
 @Column(name="login_user_name")
	private String loginUserName;
 @Column(name="login_user_pwd")
	private String loginUserPwd;
 @Column(name="login_user_type")
	private String loginUserType;
 @Column(name="login_user_created_on")
	private Date loginUserCreatedOn;
 @Column(name="login_user_modified_on")
	private Date loginUserModifiedOn;
 @Column(name="login_user_modified_by")
	private String loginUserModifiedBy;
 @Column(name="login_user_email")
    private String loginUserEmailId;
 

public int getLogin_user_id() {
	return login_user_id;
}
public void setLogin_user_id(int login_user_id) {
	this.login_user_id = login_user_id;
}
public String getLoginUserName() {
	return loginUserName;
}
public void setLoginUserName(String loginUserName) {
	this.loginUserName = loginUserName;
}
public String getLoginUserPwd() {
	return loginUserPwd;
}
public void setLoginUserPwd(String loginUserPwd) {
	this.loginUserPwd = loginUserPwd;
}
public String getLoginUserType() {
	return loginUserType;
}
public void setLoginUserType(String loginUserType) {
	this.loginUserType = loginUserType;
}
public Date getLoginUserCreatedOn() {
	return loginUserCreatedOn;
}
public void setLoginUserCreatedOn(Date loginUserCreatedOn) {
	this.loginUserCreatedOn = loginUserCreatedOn;
}
public Date getLoginUserModifiedOn() {
	return loginUserModifiedOn;
}
public void setLoginUserModifiedOn(Date loginUserModifiedOn) {
	this.loginUserModifiedOn = loginUserModifiedOn;
}
public String getLoginUserModifiedBy() {
	return loginUserModifiedBy;
}
public void setLoginUserModifiedBy(String loginUserModifiedBy) {
	this.loginUserModifiedBy = loginUserModifiedBy;
}
public String getLoginUserEmailId() {
	return loginUserEmailId;
}
public void setLoginUserEmailId(String loginUserEmailId) {
	this.loginUserEmailId = loginUserEmailId;
}

@Override
public String toString() {
	return "LoginUser [login_user_id=" + login_user_id + ", loginUserName="
			+ loginUserName + ", loginUserPwd=" + loginUserPwd
			+ ", loginUserType=" + loginUserType + ", loginUserCreatedOn="
			+ loginUserCreatedOn + ", loginUserModifiedOn="
			+ loginUserModifiedOn + ", loginUserModifiedBy="
			+ loginUserModifiedBy + ", loginUserEmailId=" + loginUserEmailId
			+ "]";
}

}
