package com.zhen.dao.impl;

import java.sql.SQLException;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import com.zhen.dao.categoryDao;
import com.zhen.exception.DaoException;
import com.zhen.po.category;
import com.zhen.util.DBCPUtil;

public class categoryDaoImpl implements categoryDao{
	private QueryRunner qr = new QueryRunner(DBCPUtil.getDataSource());
	
	@Test
	public void test1(){
		try {
			List<category> lists = qr.query("select * from category", new BeanListHandler<category>(category.class));
			System.out.println(lists);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public List<category> findAllCategories() {
		try {
			return qr.query("select * from category", new BeanListHandler<category>(category.class));
		} catch (SQLException e) {
			throw new DaoException(e);
		}
	}


}
