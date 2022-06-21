package com.jspservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Config_And_Context extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		
		PrintWriter out=res.getWriter();
		
			ServletContext ctx= getServletContext();
		
			String name=ctx.getInitParameter("Name");
			String id=ctx.getInitParameter("EmpId");
			
			out.println("Name: "+name+"		Id:"+id);
			
			ServletConfig cfg= getServletConfig();
			
			String message=cfg.getInitParameter("Message");
			
			out.println("message: "+message);
	
	}

}
