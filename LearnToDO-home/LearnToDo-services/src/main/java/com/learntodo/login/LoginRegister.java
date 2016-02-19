package com.learntodo.login;

import com.learntodo.login.dto.LoginDTO;

public interface LoginRegister {
	
	public LoginDTO getLoginUser(LoginDTO userDto);
	
	public LoginDTO updateLoginDtl();

}
