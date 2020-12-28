package com.service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;
import com.entity.User;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UserDao userDao;
	
	   public void init() {
	        userDao = new UserDao();
	    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			User user = new User();
			if(userDao.validate(username, password)) {
				request.setAttribute("username", username);
				RequestDispatcher dispatcher = request.getRequestDispatcher("login-success.jsp");
	            dispatcher.forward(request, response);
	        } else {
	        	response.sendRedirect("login-error.jsp");
	        }
		} catch (Exception e) {
			response.sendRedirect("index.jsp?error=1");
		}
	}

}
