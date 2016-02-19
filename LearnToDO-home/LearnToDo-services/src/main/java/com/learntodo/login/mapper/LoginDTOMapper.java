package com.learntodo.login.mapper;



import java.sql.Date;
import java.util.Calendar;

import com.learn.login.entity.LoginUser;
import com.learntodo.login.dto.LoginDTO;

public class LoginDTOMapper {
	
	/*
	 * This will map LoginDTO object data to Login User entity
	 */
	public static LoginUser LoginUserDtoToEntityMapper(LoginDTO userDtl){
		LoginUser loginUsr=new LoginUser();
		loginUsr.setLoginUserEmailId(userDtl.getLoginUserEmail());
		loginUsr.setLoginUserName(userDtl.getLoginUserName());
		loginUsr.setLoginUserPwd(userDtl.getLoginUserPwd());
		loginUsr.setLoginUserModifiedBy(userDtl.getLoginUserEmail());
		Calendar calendar = Calendar.getInstance();
		loginUsr.setLoginUserModifiedOn(new Date(calendar.getInstance().getTime().getTime()));
		return loginUsr;
	}
	/*
	 * This will map Login User entity data to LoginDTO object
	 */
   public static LoginDTO LoginEntityToLoginDTOMapper(LoginUser userDtl){
	   LoginDTO loginDto=new LoginDTO();
	   loginDto.setLoginUserEmail(userDtl.getLoginUserEmailId());
	   loginDto.setLoginUserName(userDtl.getLoginUserName());
	   loginDto.setLoginUserPwd(userDtl.getLoginUserPwd());
	   return loginDto;
	   
   }
}
