package com.Project12;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/add")
public class Servlet1 extends HttpServlet 
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int a=Integer.parseInt(req.getParameter("num1"));		
		int b=Integer.parseInt(req.getParameter("num2"));
		int c=a+b;
		PrintWriter out = res.getWriter();
		out.println("Sum of "+a+" & "+b+" is "+c);
	}
}
