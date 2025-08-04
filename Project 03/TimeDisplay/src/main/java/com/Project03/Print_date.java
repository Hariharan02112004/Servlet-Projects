package com.Project03;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Print_date extends HttpServlet 
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException 
	{
		LocalDateTime currentTime = LocalDateTime.now();
		res.setContentType("text/html");		
		PrintWriter out = res.getWriter();
		out.println("<h1>Time And date is </h1>");
		out.println("<p style='color: red'>"+currentTime+"</p>");
	}
}
