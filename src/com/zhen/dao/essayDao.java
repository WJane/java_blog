package com.zhen.dao;
import java.util.List;

import com.zhen.po.essay;

public interface essayDao {
	//����category_id��ѯeesays
	List<essay> findEssays(String category_id);
	//����title��ѯ����
	essay findEssayByTitle(String title);
	//�������
	void addEssay(essay essay);
}
