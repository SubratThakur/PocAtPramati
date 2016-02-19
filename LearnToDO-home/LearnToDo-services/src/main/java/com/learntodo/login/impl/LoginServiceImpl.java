package com.learntodo.login.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.login.entity.LoginUser;
import com.learntodo.login.LoginDao;
import com.learntodo.login.dto.LoginDTO;
import com.learntodo.login.mapper.LoginDTOMapper;

@Service
public class LoginServiceImpl extends LoginRegisterAbstract{
	
	@Autowired
	private LoginDao loginDao;

	@Override
	public LoginDTO getLoginUser(LoginDTO userdtl) {
		LoginUser user=LoginDTOMapper.LoginUserDtoToEntityMapper(userdtl);
		user=loginDao.getUser(user);
		LoginDTO logindtl=LoginDTOMapper.LoginEntityToLoginDTOMapper(user);
		return logindtl;
	}

}
