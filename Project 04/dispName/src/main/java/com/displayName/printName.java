package com.displayName;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class printName extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException 
	{
		String name = req.getParameter("yourName");
		PrintWriter out = res.getWriter();
	    out.println("Your name is " +name );
	}

}
