package com.Project10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Serv2 extends HttpServlet 
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		Cookie cookie[]=req.getCookies();		
		int c =0;
		for(Cookie i : cookie) {
			if(i.getName().equals("c")) {
				c=Integer.parseInt(i.getValue());
			}
		}
		c=c*c;
		PrintWriter out =res.getWriter();
		out.println("Result is "+c);
	}

}
