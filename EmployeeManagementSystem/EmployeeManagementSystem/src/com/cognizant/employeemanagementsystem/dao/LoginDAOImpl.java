package com.cognizant.employeemanagementsystem.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.cognizant.employeemanagementsystem.bean.LoginBean;
import com.cognizant.employeemanagementsystem.util.DBUtils;
public class LoginDAOImpl implements LoginDAO {

	@Override
	public String insertLogin(LoginBean bean) {
		// TODO Auto-generated method stub
		Connection connection= null;
		PreparedStatement preparedStatement= null;
		try{
		connection=DBUtils.getConnection();
		String query="insert into login(username,pwd) values(?,?)";
		preparedStatement=connection.prepareStatement(query);
	     preparedStatement.setString(1, bean.getUserName());
         preparedStatement.setString(2, bean.getPassword());
         connection.commit();
		}
		catch (SQLException e) {
            // TODO Auto-generated catch block
			try{
				connection.rollback();
			}
			catch(SQLException e1)
			{
				e1.printStackTrace();
			}
            e.printStackTrace();
        }
		finally{
			 DBUtils.closeConnection(connection);
		}
		
		return null;
	}
	

	@Override
	public boolean authenticateUser(LoginBean bean2) {
		Connection connection1= null;
		
        
        try{
        PreparedStatement preparedStatement1 = null;
        	
        ResultSet resultSet = null;
        String query1 = "select * from login where username=? and pwd=?";
		connection1=DBUtils.getConnection();
		preparedStatement1 = connection1.prepareStatement(query1);
		preparedStatement1.setString(1, bean2.getUserName());
	    preparedStatement1.setString(2, bean2.getPassword());
        resultSet = preparedStatement1.executeQuery();
		 if(resultSet.next())
		 {
			return true; 
		 }
		 else
			 return false;
        }
        catch(SQLException e2)
        {
        	e2.printStackTrace();
        }
        finally{
			 DBUtils.closeConnection(connection1);
		}
		
		return false;

	}
}
