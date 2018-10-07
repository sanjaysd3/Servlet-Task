package com.cg.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginserv")
public class userController extends HttpServlet {
	
	PrintWriter out = null;
	RequestDispatcher rd=null;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		out = resp.getWriter();
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		System.out.println("Name is : "+name);
		System.out.println("Password is : "+pass);
		String target=null;
		if(name.equals("user") && pass.equals("user")){
			target="gallery.html";
			rd=req.getRequestDispatcher(target);
			rd.forward(req, resp);
		}
		else{
			out.println("Credentials are wrong!!!");
		}
		
	}
}