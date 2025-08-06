package com.Project09;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionManage1 extends HttpServlet 
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException 
	{
		int a =Integer.parseInt(req.getParameter("num1"));		
		int b =Integer.parseInt(req.getParameter("num2"));
		int c =a+b;
		HttpSession session = req.getSession();
		session.setAttribute("c", c);
		res.sendRedirect("sq");
	}
}
