package com.zhen.dao;
import java.util.List;

import com.zhen.po.essay;

public interface essayDao {
	//根据category_id查询eesays
	List<essay> findEssays(String category_id);
	//根据title查询文章
	essay findEssayByTitle(String title);
	//添加文章
	void addEssay(essay essay);
}
