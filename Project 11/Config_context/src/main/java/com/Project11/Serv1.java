package com.Project11;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Serv1 extends HttpServlet 
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		PrintWriter out = res.getWriter();
		ServletConfig con=getServletConfig();
		String configText=con.getInitParameter("Name");
		out.println("Servlet Config is "+configText);
		ServletContext co=getServletContext();
		String contextText=co.getInitParameter("Name");
		out.println("Servlet context is "+contextText);
	}

}
