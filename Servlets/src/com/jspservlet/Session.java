package com.jspservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Session extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		HttpSession session=req.getSession(false);//will not create a new session here
		
		int val1=(int) session.getAttribute("x");
		int val2=(int) session.getAttribute("y");
		
		//session.removeAttribute("x");
		String myname=(String) session.getAttribute("myname");
		
		PrintWriter out=res.getWriter();
		
		out.println("On session page");
		out.println("<p> "+myname+" has print values: "+val1+" and "+val2+"</p>");
	}

}
