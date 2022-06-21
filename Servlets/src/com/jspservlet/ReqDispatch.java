package com.jspservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/nextpage")
public class ReqDispatch extends HttpServlet {
	
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
	
		PrintWriter out=res.getWriter();
		
		int i=(int) req.getAttribute("val1");
		int j=(int) req.getAttribute("val2");
		out.println("Requesting a Dispatch...................");
		out.println("Values From Dispatch class:"+i+" and	"+j);
		
	
	}

}
