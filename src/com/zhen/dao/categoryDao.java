package com.zhen.dao;

import java.util.List;

import com.zhen.po.category;

public interface categoryDao {
	//查询所有目录
	List<category> findAllCategories();
	//添加目录
}
