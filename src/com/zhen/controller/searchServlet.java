package com.zhen.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhen.po.essay;
import com.zhen.po.service.bussinessService;
import com.zhen.service.impl.bussinessServiceImpl;

public class searchServlet extends HttpServlet {
	private bussinessService b = new bussinessServiceImpl();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String title = request.getParameter("title");
		essay essay = b.findEssayByTitle(title);
		request.setAttribute("essay", essay);
		request.getRequestDispatcher("/jsp/blog.jsp").forward(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
