package com.zhen.util;

import java.lang.reflect.InvocationTargetException;

import javax.servlet.http.HttpServletRequest;

import com.sun.org.apache.commons.beanutils.BeanUtils;

public class WebUtil {
	public static <T>T fillBean(HttpServletRequest request,Class<T> clazz){
		try {
			T t = clazz.newInstance();
			BeanUtils.populate(t, request.getParameterMap());
			return t;
		}catch(Exception e) {
			throw new RuntimeException();
		}
	}
}
