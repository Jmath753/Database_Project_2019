package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


/*Steps to connect JDBC
*1. import -------> java.sql
*2. Load and register the driver --> com.mysql.jdbc.Driver
*3. Create connection
*4. Create a statement 
*5. execute the query
*6. process the results
*7.close
*/

public class Driver {
	
	public static void main (String [] args) {
	
		
		int result = result.nextInt();
		
	//public Connection DBConnection() {
		// TODO Auto-generated method stub
		String userName,password,url,driver;
	    Connection con = null;
	    Statement st;
		userName="2000186_upeta";
        password="Sreyo123";
        url="jdbc:mariadb://207.246.241.5:3306/2000186_upeta";
        driver="org.mariadb.jdbc.Driver";
        try {
            Class.forName(driver);
        con=DriverManager.getConnection(url, userName, password);
        System.out.println("Connection works");
         st=con.createStatement();
        result = st.executeUpdate("select * from `Jeremy_Mathew_Login_Table;");//(`fname`, `lname`, `uname`, `pass`, `ssn`, `pnum`, `email`, `gender`) "
        		//+ "VALUES ('John','Smith','Ryki23','1234','1225646','5163760008','hamil.mathew@gamil.com','male')");
        //System.out.println("Connection is successful::"+result);
        while (result.next()) { //retrieve data
        	
        }
        } catch (Exception e) {
          e.printStackTrace();
        }
        //return con;
	}
	
}

 