package com.example.fengdongfei.drawercaven.impl;



import android.content.Context;

import com.example.fengdongfei.drawercaven.DBHelper;
import com.example.fengdongfei.drawercaven.model.Student;
import com.ydl.ahibernate.dao.impl.BaseDaoImpl;

//如果您是J2EE高手一定希望支持接口吧,按下面的写法即可:
//写一个接口:public interface StudentDao extends BaseDao<Student> {}
//实现接口: public class StudentDaoImpl extends BaseDaoImpl<Student> implements StudentDao
public class StudentDaoImpl extends BaseDaoImpl<Student> {
	public StudentDaoImpl(Context context) {
		super(new DBHelper(context));
	}
}
