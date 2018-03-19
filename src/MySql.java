import java.sql.*;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


class MySql{  

public void userReg(String name, String email, String password, String gender, String address){
	String sql1= "INSERT INTO `registered_employees` (`Name`, `Email`, `Password`, `Gender`, `Address`) VALUES ('"+name+"', '"+ email +"', '"+ password +"', '"+ gender +"', '"+ address +"')";
	
   Statement stmt=null;
   //ResultSet rs = null;
  
	try{  
		Class.forName("com.mysql.jdbc.Driver");  
		  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/tfis-database","root","");  
		  
		  
		 stmt=con.createStatement();  
		  
		 stmt.executeUpdate(sql1);  
		
		  
		con.close();  
		  
		}catch(Exception e){
			System.out.println(e);}  
		  
		}  


public boolean userCheckLogin(String username, String password){
	String sql2= "Select * from `registered_employees` where Email = '"+ username +"' and Password='"+ password +"' ";
	
	   Statement stmt=null;
	   ResultSet rs = null;
	   boolean status = false;
	  
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/tfis-database","root","");  

			 stmt=con.createStatement();  
 
			 rs = stmt.executeQuery(sql2);    
			
			
			status = rs.next();
			
			
			con.close();
			
			
			}catch(Exception e){ System.out.println(e);}  
			  
			return status;
			
	}

public boolean adminCheckLogin(String username, String password){
		 String sql = "Select * from `admin` where Email = '"+ username +"'and Password = '"+ password +"' ";
		 Statement stmt=null;
		 ResultSet rs = null;
		 boolean status = false;
		 try{
			 Class.forName("com.mysql.jdbc.Driver");  
			 Connection con=DriverManager.getConnection(  
			 "jdbc:mysql://localhost:3306/tfis-database","root","");  
			 stmt=con.createStatement();  
			 rs = stmt.executeQuery(sql);    
			 status = rs.next();
			 con.close();
		 }catch(Exception e){
			 e.printStackTrace();
		 }
		 
		 return status;
	}


public String[] cpuList(){
	 String sql = "Select * from `cpu_list`";
	 Statement stmt = null;
	 ResultSet rs = null;
	 String arr[] = new String[100];
	 try{
		 Class.forName("com.mysql.jdbc.Driver");  
		 Connection con=DriverManager.getConnection(  
		 "jdbc:mysql://localhost:3306/tfis-database","root","");  
		 stmt=con.createStatement();  
		 rs = stmt.executeQuery(sql);  
		int index=0; 
		
		 while(rs.next()){
			if(rs.getString("Model")!=null){
				arr[index]= rs.getString("Model");
			
			 index++;
			
			}
		 }
		 con.close();
		 
		 
	 }catch(Exception e){
		 e.printStackTrace();
	 }
	 
	 return arr;
}

public String[] gpuList(){
	 String sql = "Select * from `gpu_list`";
	 Statement stmt = null;
	 ResultSet rs = null;
	 String arr[] = new String[100];
	 try{
		 Class.forName("com.mysql.jdbc.Driver");  
		 Connection con=DriverManager.getConnection(  
		 "jdbc:mysql://localhost:3306/tfis-database","root","");  
		 stmt=con.createStatement();  
		 rs = stmt.executeQuery(sql);  
		int index = 0; 	
		 while(rs.next()){
			if(rs.getString("Model")!=null){
				arr[index]= rs.getString("Model");
			
			 index++;
			}
		 }
		 con.close();
		 
		 
	 }catch(Exception e){
		 e.printStackTrace();
	 }
	 
	 return arr;
}




}




