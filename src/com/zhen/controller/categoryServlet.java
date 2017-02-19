package com.zhen.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.zhen.po.User;
import com.zhen.po.category;
import com.zhen.po.essay;
import com.zhen.po.service.bussinessService;
import com.zhen.service.impl.bussinessServiceImpl;

public class categoryServlet extends HttpServlet {
	private bussinessService b = new bussinessServiceImpl();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String operation = request.getParameter("operation");
		if(operation.equals("showAllCategory")){
			showAllCategory(request, response);
		}
		if(operation.equals("isLogin")){
			isLogin(request, response);
		}
		if(operation.equals("findEssays")){
			findEssays(request, response);
		}
	}
	
	private void showAllCategory(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
		List<category> cs = b.findAllCategories();
		request.setAttribute("cs", cs);
		request.getRequestDispatcher("/jsp/main.jsp").forward(request, response);
	}
	
	private void findEssays(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
		String category_id = request.getParameter("category_id");
		List<essay> es = b.findEssays(category_id);
		request.setAttribute("es", es);
		request.getRequestDispatcher("/jsp/blog.jsp").forward(request, response);
	}
	
	private void isLogin(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
		User user = (User) request.getSession().getAttribute("user");
		if(user!=null){
			List<category> cs = b.findAllCategories();
			request.setAttribute("cs", cs);
			request.getRequestDispatcher("/jsp/write.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
		}
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	
	

}
