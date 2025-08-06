package com.Project09;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionManage2 extends HttpServlet 
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		HttpSession session = req.getSession();
		int res1 =(int)session.getAttribute("c");
		res.setContentType("text/html");
		int temp=res1;
		res1=res1*res1;
		PrintWriter out = res.getWriter();
		out.println("<p>The square of "+temp+" is "+res1+" .</p>");
	}
}
