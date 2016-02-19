package com.learntodo.login.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.login.entity.LoginUser;
import com.learntodo.login.LoginDao;
import com.learntodo.util.HibernateUtil;

@Repository
public class LoginDaoImpl implements LoginDao {


	private final Logger logger = LoggerFactory.getLogger(LoginDaoImpl.class);
	 // Prep work
	

    @Autowired
	private SessionFactory sessionFactory;

	public LoginUser getUser(LoginUser user) {
		return null;
	}

}
