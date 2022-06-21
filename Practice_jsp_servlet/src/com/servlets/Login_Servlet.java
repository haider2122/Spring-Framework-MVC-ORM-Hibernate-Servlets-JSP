package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login_Servlet
 */
@WebServlet("/Login_Servlet")
public class Login_Servlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String user=req.getParameter("username");
	
		String pass=req.getParameter("pass");
		
		PrintWriter out=res.getWriter();
		out.println(user);
		System.out.println(user);
		System.out.println(pass);
	
		req.setAttribute("message","Welcome to our website");
		if(user.equals("haider") && pass.equals("2122")){
		
			HttpSession session=req.getSession();
			session.setAttribute("username", user);
			res.sendRedirect("data.jsp");
			
		}else{
			req.removeAttribute("message");
			req.setAttribute("message","Incorrect Credentials--");
			RequestDispatcher rd= req.getRequestDispatcher("login.jsp");
			rd.forward(req,res);
			
		}
		
		
	
		
//String query="Select * from emp where empno=? and ename=?";
//		
//		
//		
//		try(Connection con=DriverManager.
//getConnection("jdbc:mysql://localhost:3306/sho?useSSL=false","root","password");
//				PreparedStatement ps=con.prepareStatement(query)){
//
//			ps.setInt(1, Integer.parseInt(pass));
//			ps.setString(2, user);
//			
//			ResultSet rs=ps.executeQuery();
//		while(rs.next()){
//			HttpSession session=req.getSession();
//			session.setAttribute("username", user);
//			res.sendRedirect("data.jsp");
//			break;
//		}
//			
//			
//			
//			
//		}catch(SQLException e){
//			System.out.println(e);
//			
//		}		
//		
//		
		
		
		
		
	}

}