package com.Project07;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowDeveloper extends HttpServlet 
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String dev=getServletConfig().getInitParameter("developer"); 
		PrintWriter out = res.getWriter();
		out.println("The developer is " +dev);
	}
}
