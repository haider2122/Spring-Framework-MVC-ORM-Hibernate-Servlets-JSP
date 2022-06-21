package com.jstl_tags;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/add")
public class DemoServlet extends HttpServlet{
	
public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		 String name="Haider";
		
		
		
	
		RequestDispatcher rd=req.getRequestDispatcher("myjsp.jsp");
		req.setAttribute("name", name);
		rd.forward(req, res);
		
	
	}

}
