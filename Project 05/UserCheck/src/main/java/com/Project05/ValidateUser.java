package com.Project05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidateUser extends HttpServlet 
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String yourname = req.getParameter("userName");
		String pass=req.getParameter("password");
		PrintWriter out = res.getWriter();
		if(yourname.equals("admin")  && pass.equals("1234")) {
			out.println("Login successful. Welcome, admin!");
		}
		else {
			out.println("Invalid credentials. Please try again.");
		}
	}
}
