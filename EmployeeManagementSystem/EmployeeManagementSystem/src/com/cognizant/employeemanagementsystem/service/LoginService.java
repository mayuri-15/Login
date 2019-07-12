package com.cognizant.employeemanagementsystem.service;

import com.cognizant.employeemanagementsystem.bean.LoginBean;

public interface LoginService {
	public String insertLogin(LoginBean bean);
	
	public boolean authenticateUser(LoginBean bean2);
}
