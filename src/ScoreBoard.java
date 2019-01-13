/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EZIO
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;




public class ScoreBoard {
    
    
    private static String dbURL = "LBoard;create=true;user=S2L2;password=s2l2";
    private static String tableName = "leaderboard";
    // jdbc Connection
    private static Connection conn = null;
    private static Statement stmt = null;
    
    
    public ScoreBoard(String p1,String p2,String win){

        createConnection();
        insertL(p1,p2,win);
        shutdown();


   }
    

    private static void createConnection() {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            //Get a connection
            conn = DriverManager.getConnection(dbURL); 
        }
        catch (Exception except)
        {
            except.printStackTrace();
        }
    }

    private static void insertL(String p1, String p2, String win) {
        
        try
        {
            stmt = conn.createStatement();
            stmt.execute("insert into " + tableName + " values (" +p1 + "','" + p2 +"','" + win +"')");
            stmt.close();
        }
        catch (SQLException sqlExcept)
        {
            sqlExcept.printStackTrace();
        }
        
        
    }

    

    private static void shutdown() {
        
        try
        {
            if (stmt != null)
            {
                stmt.close();
            }
            if (conn != null)
            {
                DriverManager.getConnection(dbURL + ";shutdown=true");
                conn.close();
            }           
        }
        catch (SQLException sqlExcept)
        {
            
        }

    }
        
        
    }
    
