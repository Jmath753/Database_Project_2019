package com.login;

import java.io.IOException;

import javax.servlet.ServletException;

public class RegistrationBA {
	public void RegisterBA(String fname,String lname, String uname, String ssn, String Gender, String pass, String email, String pnum ) {
		RegistrationDAO objRegDAO=new RegistrationDAO();
		try {
			objRegDAO.InsertReg(fname, lname, uname, ssn, Gender, pass, email, pnum );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

}
}