package com.example.fengdongfei.drawercaven.model;

//自动生成的建表语句:
//crate table [t_teacher]: CREATE TABLE t_teacher (id INTEGER primary key autoincrement, title TEXT, name TEXT(20), age INTEGER )

import com.ydl.ahibernate.annotation.Column;
import com.ydl.ahibernate.annotation.Table;

@Table(name = "t_teacher")
public class Teacher extends Person {
	@Column(name = "title")
	private String title;// 职称

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Teacher [" + super.toString() + ",title=" + title + "]";
	}
}
