package com.Project08;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Serv2 extends HttpServlet 
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		int c =Integer.parseInt(req.getParameter("c"));
		PrintWriter out = res.getWriter();
		out.println("<p>The value of the square is "+c+"</p>");
	}

}
