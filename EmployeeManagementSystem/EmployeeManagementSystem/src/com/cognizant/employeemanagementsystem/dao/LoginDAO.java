package com.cognizant.employeemanagementsystem.dao;

import com.cognizant.employeemanagementsystem.bean.LoginBean;

public interface LoginDAO {
	
	public String insertLogin(LoginBean bean);
	
	public boolean authenticateUser(LoginBean bean2);

}
