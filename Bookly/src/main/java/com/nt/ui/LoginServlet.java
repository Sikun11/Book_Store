package com.nt.ui;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/user")

public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Userbean ub = new LoginDAO().login(req.getParameter("uname"), req.getParameter("pwd"));

		if (ub == null) {
			req.setAttribute("msg", "Invalid username and password!please try again..<br>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("home.jsp");
			dispatcher.forward(req, res);
		} else {
			// getting the refernce of servletContext
			ServletContext sc=req.getServletContext();
			// Adding attribute to context
			sc.setAttribute("ubean", ub);
			//create cokkie
			Cookie ck=new Cookie("name",ub.getFname());
			// adding cookie response
			res.addCookie(ck);
			RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
			dispatcher.forward(req, res);
		}
	}

}
