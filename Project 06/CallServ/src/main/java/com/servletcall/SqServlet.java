package com.servletcall;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		int c =(int)req.getAttribute("c");
		PrintWriter out = res.getWriter();
		out.println("The square of sum "+c+" is "+(c*c));
	}
}
