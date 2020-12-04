package com.springMVCdao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.springMVModel.StudentModel;

public class studentDAO {
	
	@Autowired
	private SessionFactory sessionFactory ;
	
	public List<StudentModel> getStudents()
	{
		Session session=sessionFactory.getCurrentSession();
		return session.createQuery("from Student",StudentModel.class).list();
	}
	
	
	

}
