package com.cognizant.employeemanagementsystem.service;

import com.cognizant.employeemanagementsystem.bean.LoginBean;
import com.cognizant.employeemanagementsystem.dao.LoginDAO;
import com.cognizant.employeemanagementsystem.dao.LoginDAOImpl;

public class LoginServiceImpl implements LoginService {

	LoginDAO loginDao= new LoginDAOImpl();

	@Override
	public String insertLogin(LoginBean bean) {
		// TODO Auto-generated method stub
		
		return loginDao.insertLogin(bean);
	}

	@Override
	public boolean authenticateUser(LoginBean bean2) {
		// TODO Auto-generated method stub
		return loginDao.authenticateUser(bean2);
	}
}
