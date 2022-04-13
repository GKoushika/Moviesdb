package net.code3java;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;  
import java.sql.SQLException;  
public class InsertRecords {	   
	 
		   
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
		   
		  
		    public void insert(String name, String actor,String actress,String director,int year) {  
		        String sql = "INSERT INTO movies(name,actor,actress,director,year) VALUES(?,?,?,?,?)";  
		   
		        try{  
		            Connection conn = this.connect();  
		            PreparedStatement pstmt = conn.prepareStatement(sql);  
		            pstmt.setString(1, name);  
		            pstmt.setString(2, actor);
		            pstmt.setString(3, actress);
		            pstmt.setString(4, director);
		            pstmt.setInt(5, year);  
		            pstmt.executeUpdate();  
		        } catch (SQLException e) {  
		            System.out.println(e.getMessage());  
		        }  
		    }  
		   
		    public static void main(String[] args) {  
		   
		        InsertRecords app = new InsertRecords();  
		        // insert three new rows  
		        app.insert("Raadheshyam","Prabhas","Pooja","RadhaKrishna",2022);  
		        app.insert("Saaho","Prabhas","ShreddhaKapur","Sujith",2019);  
		        app.insert("ShyamSingarroy","Nani","Saipallavi","Rahul",2021);  
		        app.insert("MCA","Nani","Saipallavi","Veenu",2021);  
		    }  
		   
		






	}


