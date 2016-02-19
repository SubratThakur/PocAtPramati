package com.lerntodo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.learntodo.login.dto.LoginDTO;
import com.learntodo.login.factory.LoginOrRegisterFactory;

@Controller
public class LoginController {
	
	@Autowired
	private LoginOrRegisterFactory loginOrRegisterFactory;
	
	@RequestMapping("")
	public ModelAndView getStarted(){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("login/login");
		return mv;
	}
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public ModelAndView loginWithDetails(@RequestBody LoginDTO userDtl){
		ModelAndView mv=new ModelAndView();		
		try{
			userDtl=loginOrRegisterFactory.getServiceForLogin(userDtl);
		}
		catch(Exception ex){
			List<String> errorList=new ArrayList<String>();
			errorList.add(ex.getMessage());
			userDtl.setErrorList(errorList);
		}
		mv.addObject("loginDtl", userDtl);
		return mv;
	}

}
