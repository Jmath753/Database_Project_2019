package com.login;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegistrationServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		String pnum = request.getParameter("Phone Number");
		String fname = request.getParameter("First Name");
		String lname = request.getParameter("Last Name");
		String Gender = request.getParameter("Gender");
		String ssn = request.getParameter("Social Security Number");
		String email = request.getParameter("E-mail address");
		RegistrationBA objRegBA=new RegistrationBA();
		objRegBA.RegisterBA(fname, lname, uname, pass, pnum, Gender, ssn, email);
		
		
		
}

	private RegistrationDAO objRegDAO = new RegistrationDAO();
	
}
