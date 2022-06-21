package com.jspservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/redirectServlet")
public class ReqRedirect extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
	
		PrintWriter out=res.getWriter();
//		
//		int val1=Integer.parseInt(req.getParameter("x"));
//		int val2=Integer.parseInt(req.getParameter("y"));
		out.println("<h1>Welcome to Redirect Page<h1>");
		//out.print("Values: "+val1+"  "+val2);
	
	}

}
