package com.learntodo.login.factory;

import java.util.HashMap;
import java.util.Map;

import com.learntodo.login.LoginRegister;
import com.learntodo.login.dto.LoginDTO;

public class LoginOrRegisterFactory {
	
	private HashMap<String,LoginRegister> maps;
	
	public LoginDTO getServiceForLogin(LoginDTO userDtl){
		LoginDTO login=maps.get(userDtl.getType()).getLoginUser(userDtl);
		return login;
	}

	public HashMap<String, LoginRegister> getMaps() {
		return maps;
	}

	public void setMaps(HashMap<String, LoginRegister> maps) {
		this.maps = maps;
	}

}
