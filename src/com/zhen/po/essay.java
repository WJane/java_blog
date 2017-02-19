package com.zhen.po;

import com.mysql.jdbc.Blob;
import com.mysql.jdbc.Clob;

public class essay {
	private int essay_id;
	private String title;
	private String category_id;
	private String content;
	
	@Override
	public String toString() {
		return "essay [essay_id=" + essay_id + ", title=" + title
				+ ", category_id=" + category_id + ", content=" + content + "]";
	}
	public int getEssay_id() {
		return essay_id;
	}
	public void setEssay_id(int essay_id) {
		this.essay_id = essay_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory_id() {
		return category_id;
	}
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	
}
