package com.example.fengdongfei.drawercaven;

import android.content.Context;

import com.example.fengdongfei.drawercaven.model.Student;
import com.example.fengdongfei.drawercaven.model.Teacher;
import com.ydl.ahibernate.util.MyDBHelper;

public class DBHelper extends MyDBHelper {
	private static final String DBNAME = "school.db";// 数据库名
	private static final int DBVERSION = 1;
	private static final Class<?>[] clazz = { Teacher.class, Student.class };// 要初始化的表

	public DBHelper(Context context) {
		super(context, DBNAME, null, DBVERSION, clazz);
	}

}