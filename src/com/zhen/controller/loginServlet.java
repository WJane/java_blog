package com.zhen.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhen.po.User;
import com.zhen.po.service.bussinessService;
import com.zhen.service.impl.bussinessServiceImpl;

public class loginServlet extends HttpServlet {
	private bussinessService b = new bussinessServiceImpl();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password =request.getParameter("password");
		if(b.login(username, password)){
			User user =new User();
			user.setPassword(password);
			user.setUsername(username);
			request.getSession().setAttribute("user", user);
			response.sendRedirect(request.getContextPath()+"/jsp/main.jsp");
		}else{
			request.setAttribute("error","<script type='text/javascript'>alert('用户名或密码错误')</script>");
			request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
		}		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		
	}

}
