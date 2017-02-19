package com.zhen.po;

import java.sql.Date;



public class category {
	private String id;
	private String name;
	private Date createtime;
	
	@Override
	public String toString() {
		return "category [id=" + id + ", name=" + name + ", createtime="
				+ createtime + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	
}
