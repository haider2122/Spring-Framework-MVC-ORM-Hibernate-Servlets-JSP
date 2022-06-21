package com.jspservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.parser.Cookie;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Cookies {
public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
	PrintWriter out=((ServletResponse) req).getWriter();
	
	javax.servlet.http.Cookie[] ck=req.getCookies();
	for(javax.servlet.http.Cookie val:ck){
		
		System.out.println(val.getValue());
		out.println("Value From Cookie: "+val.getValue());
	
		
	}
	
	
	
	}

}
