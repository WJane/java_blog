package com.zhen.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.zhen.po.category;
import com.zhen.po.essay;
import com.zhen.po.service.bussinessService;
import com.zhen.service.impl.bussinessServiceImpl;
import com.zhen.util.DBCPUtil;
import com.zhen.util.WebUtil;

public class addEssayServlet extends HttpServlet {
	private bussinessService b = new bussinessServiceImpl();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		essay essay = WebUtil.fillBean(request, essay.class);
		b.addEssay(essay);
		List<category> cs = b.findAllCategories();
		request.setAttribute("message", "<script type='text/javascript'>alert('发表成功')</script>");
		request.setAttribute("cs", cs);
		request.getRequestDispatcher("/jsp/main.jsp").forward(request, response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		
	}

}
