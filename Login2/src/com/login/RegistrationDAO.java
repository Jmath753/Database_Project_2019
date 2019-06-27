package com.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.ServletException;

public class RegistrationDAO extends Driver {
public static void main (String [] args) {
	System.out.println("Program is running...");
}
	public void InsertReg(String fname,String lname, String uname, String pass, String ssn, String email, String pnum, String gender) throws Exception {
		Driver dbconn=new Driver();
		Connection con=dbconn.DBConnection();
		try {
		Statement st=con.createStatement();
        int result=st.executeUpdate("INSERT INTO `Jeremy_Mathew_Registration_Table`('fname,'lname',`uname`, `pass`,'ssn','pnum','gender','pnum',)"
        		+ "VALUES ('TOM','Smith','Nekogyr','1000','355657899','5167778877','tommiboi@hotmail.com','male')");
        System.out.println("Connection is successful::"+result);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
/*
	public void DeleteReg(String fname,String lname, String uname, String pass, String ssn, String email, String pnum, String gender) throws Exception {
		Driver dbconn=new Driver();
		Connection con=dbconn.DBConnection();
		try {
		Statement st=con.createStatement();
        int result=st.executeUpdate("DELETE INTO `Jeremy_Mathew_Registration_Table`('fname,'lname',`uname`, `pass`,'ssn','pnum','gender','pnum',)"
        		+ "VALUES ('TOM','Smith','Nekogyr','1000','355657899','5167778877','tommiboi@hotmail.com','male')");
        System.out.println("Connection is successful::"+result);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void SelectReg(String fname,String lname, String uname, String pass, String ssn, String email, String pnum, String gender) throws Exception {
		Driver dbconn=new Driver();
		Connection con=dbconn.DBConnection();
		try {
		Statement st=con.createStatement();
        int result=st.executeUpdate("SELECT `fname`, `lname`, `uname`, `pass`, `ssn`, `pnum`, `email`, `gender` FROM `Jeremy_Mathew_ Registration Table`"
        		+ "VALUES ('TOM','Smith','Nekogyr','1000','355657899','5167778877','tommiboi@hotmail.com','male')");
        System.out.println("Connection is successful::"+result);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}*/
}
