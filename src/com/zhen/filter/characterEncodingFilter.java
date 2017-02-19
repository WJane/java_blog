package com.zhen.filter;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

public class characterEncodingFilter implements Filter{
	private FilterConfig filterConfig;

	public void destroy() {
		
	}

	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;
		String encode = filterConfig.getInitParameter("encoding");
		if(encode==null){
			encode = "utf-8";
		}
		request.setCharacterEncoding(encode);
		response.setCharacterEncoding(encode);
		response.setContentType("text/html;charet="+encode);
		myHttpServletRequest mrequest = new myHttpServletRequest(request);
		chain.doFilter(mrequest, response);
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
	}
}


class myHttpServletRequest extends HttpServletRequestWrapper{

	public myHttpServletRequest(HttpServletRequest request) {
		super(request);
	}
	
	@Override
	public String getParameter(String name){
		String value = super.getParameter(name);
		if(value==null)
			return value;
		//get����ʽ
		if("get".equalsIgnoreCase(super.getMethod())){
			try {
				value = new String(value.getBytes("ISO-8859-1"), super.getCharacterEncoding());
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		return value;
	}
	
}
