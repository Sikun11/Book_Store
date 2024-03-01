package com.nt.ui;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/editpwd")
public class ForgetpwdServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String emailId = req.getParameter("mid");
		String password = req.getParameter("pwd");

		int i= ForgetpwdDAO.update(emailId, password);

		if (i==0) {
			req.setAttribute("msg", "session expired...<br>");
			req.getRequestDispatcher("home.jsp").forward(req, res);

		} else {
			
			req.setAttribute("msg", "password updated..<br>"); }
		  req.getRequestDispatcher("home.jsp").forward(req, res); 
		 
			

		}

	}

