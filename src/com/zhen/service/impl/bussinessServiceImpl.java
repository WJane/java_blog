package com.zhen.service.impl;

import java.util.List;

import org.junit.Test;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.zhen.dao.categoryDao;
import com.zhen.dao.essayDao;
import com.zhen.dao.impl.categoryDaoImpl;
import com.zhen.dao.impl.essayDaoImpl;
import com.zhen.po.User;
import com.zhen.po.category;
import com.zhen.po.essay;
import com.zhen.po.service.bussinessService;

public class bussinessServiceImpl implements bussinessService{
	categoryDao cDao = new categoryDaoImpl();
	essayDao eDao = new essayDaoImpl();
	
	public List<essay> findEssays(String category_id) {
		return eDao.findEssays(category_id);
	}

	public essay findEssayByTitle(String title) {
		return eDao.findEssayByTitle(title);
	}

	public List<category> findAllCategories() {
		return cDao.findAllCategories();
	}

	public boolean login(String username, String password) {
		if(username.equals("wuzhen")&password.equals("zhenzhenzhen"))
			return true;
		return false;		
	}

	public void addEssay(essay essay) {
		eDao.addEssay(essay);	
	}
	
	

}
