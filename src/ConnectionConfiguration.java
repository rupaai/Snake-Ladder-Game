/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author User
 */
public class ConnectionConfiguration {
   
    
    public static final String URL = "jdbc:mysql://localhost:3306/snake";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";

    public static Connection getConnection() {
        Connection connection = null;

	try {
	        Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
	
        } catch (Exception e) {
			
            e.printStackTrace();
	}

		return connection; //To change body of generated methods, choose Tools | Templates.
    }

}

