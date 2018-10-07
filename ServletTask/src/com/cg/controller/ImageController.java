package com.cg.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/image")
public class ImageController extends HttpServlet {

	PrintWriter out = null;

	int count = 0;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		out = resp.getWriter();
		String prodId = req.getParameter("pid");
		String prodName = req.getParameter("pname");
		String prodPrice = req.getParameter("price");
		out.println("No of views"+(++count));
		out.println("Watch Id is "+prodId);
		out.println("Name of Watch is "+prodName);
		out.println("Price of Watch is "+prodPrice);

	}


}