package net.code3java;
import java.sql.DriverManager;  
import java.sql.Connection;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.sql.Statement;  
		   
		public class SelectRecords {  
		   
		    private Connection connect() {  
		        // SQLite connection string  
		        String url = "jdbc:sqlite:C://sqlite/SSSIT.db";  
		        Connection conn = null;  
		        try {  
		            conn = DriverManager.getConnection(url);  
		        } catch (SQLException e) {  
		            System.out.println(e.getMessage());  
		        }  
		        return conn;  
		    }  
		    public void selectAll(){  
		        String sql = "SELECT * FROM movies"; 
		        String sql1 = "SELECT name FROM movies WHERE actor='Prabhas'";
		          
		        try {  
		            Connection conn = this.connect();  
		            Statement stmt  = conn.createStatement();  
		            ResultSet rs    = stmt.executeQuery(sql);
		            Statement stmt1  = conn.createStatement(); 
		            ResultSet rs1 = stmt1.executeQuery(sql1);
		              
		            // loop through the result set  
		            while (rs.next()) {  
		                System.out.println(rs.getString("name") + "\t" +  
		                                   rs.getString("actor") + "\t" +
		                                   rs.getString("actress") + "\t" +
		                                   rs.getString("director") + "\t" +
		                                   rs.getInt("year")); 
		            }
		            while (rs1.next()) {  
			                System.out.println(rs1.getString("name")); 
			                                   
			                
		                                   
		            }  
		        } catch (SQLException e) {  
		            System.out.println(e.getMessage());  
		        }  
		    }  
		      
		     
		    /** 
		     * @param args the command line arguments 
		     */  
		    public static void main(String[] args) {  
		        SelectRecords app = new SelectRecords();  
		        app.selectAll();  
		    }  
		   
		 

	}


