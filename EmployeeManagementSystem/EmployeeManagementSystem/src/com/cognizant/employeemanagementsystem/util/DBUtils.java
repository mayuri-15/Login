package com.cognizant.employeemanagementsystem.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
       
       public static final String URL="jdbc:mysql://localhost:3306/test?useSSL=false";
       public static final String CLASS_NAME="com.mysql.jdbc.Driver";
       public static final String USER="root";
       public static final String PASSWORD="root";
       
       public static Connection getConnection() {
              Connection connection = null;
              
              try {
                    Class.forName(CLASS_NAME);
              connection = DriverManager.getConnection(URL,USER,PASSWORD);
              return connection;
              
              } catch (ClassNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
              } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
              }
              return null;
       }
       public static void closeConnection(Connection connection){
              
              try {
                    connection.close();
              } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
              }
       }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
}


