package com.example.fengdongfei.drawercaven.impl;


import android.content.Context;

import com.example.fengdongfei.drawercaven.DBHelper;
import com.example.fengdongfei.drawercaven.model.Teacher;
import com.ydl.ahibernate.dao.impl.BaseDaoImpl;

public class TeacherDaoImpl extends BaseDaoImpl<Teacher> {
	public TeacherDaoImpl(Context context) {
		super(new DBHelper(context));
	}
}
