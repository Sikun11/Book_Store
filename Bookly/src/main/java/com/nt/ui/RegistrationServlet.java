package com.nt.ui;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/newuser")
public class RegistrationServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		Userbean ub=new Userbean();
		ub.setUname(req.getParameter("uname"));
		ub.setPwd(req.getParameter("pwd"));
		ub.setFname(req.getParameter("fname"));
		ub.setLname(req.getParameter("lname"));
		ub.setMid(req.getParameter("mid"));
		ub.setMobno(Long.parseLong(req.getParameter("mobno")));
		
		int k=new RegistrationDAO().insert(ub);
		
		if(k>0)
		{
			    req.setAttribute("msg", "Registration successful! You can now log in.<br>");
		        RequestDispatcher dispatcher = req.getRequestDispatcher("home.jsp");
		        dispatcher.forward(req, res); 
			
		}
		
	}

}
