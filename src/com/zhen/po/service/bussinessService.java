package com.zhen.po.service;

import java.util.List;

import com.zhen.po.category;
import com.zhen.po.essay;

public interface bussinessService {
	List<essay> findEssays(String category_id);
	essay findEssayByTitle(String title);
	List<category> findAllCategories();
	boolean login(String username, String password);
	void addEssay(essay essay);
}
