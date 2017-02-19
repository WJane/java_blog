package com.zhen.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.zhen.dao.essayDao;
import com.zhen.exception.DaoException;
import com.zhen.po.essay;
import com.zhen.util.DBCPUtil;

public class essayDaoImpl implements essayDao{
	private QueryRunner qr = new QueryRunner(DBCPUtil.getDataSource());

	public List<essay> findEssays(String category_id) {
		try {
			return qr.query("select * from essay where category_id=?", new BeanListHandler<essay>(essay.class),category_id);
		} catch (SQLException e) {
			throw new DaoException(e);
		}
	}

	public essay findEssayByTitle(String title) {
		try {
			return qr.query("select * from essay where title=?", new BeanHandler<essay>(essay.class),title);
		} catch (SQLException e) {
			throw new DaoException(e);
		}
	}

	public void addEssay(essay essay) {		
		try {
			qr.update("insert into essay(title,category_id,content) values(?,?,?)", essay.getTitle(),essay.getCategory_id(),essay.getContent());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}

