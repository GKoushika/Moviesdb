package net.code3java;

import java.sql.Connection; 
 
import java.sql.DriverManager;  
import java.sql.SQLException;  
import java.sql.Statement;  
		   
		public class sqlite2 {  
		   
		    public static void createNewTable() {  
		        // SQLite connection string  
		        String url = "jdbc:sqlite:C://sqlite/SSSIT.db";  
		          
		        // SQL statement for creating a new table  
		        String sql = "CREATE TABLE IF NOT EXISTS movies (\n"  
		               + " name text NOT NULL,\n"  
		                + " actor text NOT NULL,\n"
		                + " actress text NOT NULL,\n"
		                + " director text NOT NULL,\n"
		                + " year integer NOT NULL\n"
		                + ");";  
		          
		        try{  
		            Connection conn = DriverManager.getConnection(url);  
		            Statement stmt = conn.createStatement();  
		            stmt.execute(sql);  
		        } catch (SQLException e) {  
		            System.out.println(e.getMessage());  
		        }  
		    }  
		   
		    /** 
		     * @param args the command line arguments 
		     */  
		    public static void main(String[] args) {  
		        createNewTable();  
		    }  
		   


		}


