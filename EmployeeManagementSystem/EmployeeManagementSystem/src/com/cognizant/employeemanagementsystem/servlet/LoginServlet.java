package com.cognizant.employeemanagementsystem.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cognizant.employeemanagementsystem.bean.LoginBean;
import com.cognizant.employeemanagementsystem.service.LoginService;
import com.cognizant.employeemanagementsystem.service.LoginServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userId = request.getParameter("userName");
        String password1= request.getParameter("password");
        LoginBean bean= new LoginBean();
        bean.setUserName(userId);
        bean.setPassword(password1);
        LoginService loginService=new LoginServiceImpl();
        if(loginService.authenticateUser(bean))
        {
        	System.out.println("Successful");
        }
        else
        	System.out.println("Failed");

	}
}
