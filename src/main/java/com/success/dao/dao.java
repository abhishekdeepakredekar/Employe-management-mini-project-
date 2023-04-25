package com.success.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.success.entity.employe;

@Repository
public class dao {
	@Autowired
	SessionFactory sf;

	public List<employe> getemployedata() {
		Session session= sf.openSession();
		Criteria criteria =session.createCriteria(employe.class);
		return criteria.list();
	}

	public String insertemployedata(List<employe> al) {
		System.out.println("insert in dao"+al);
		Session session =sf.openSession();
		Transaction tr=session.beginTransaction();
		for (employe employe : al) {
			session.save(employe);
		}
		tr.commit();
		return "insert data successfully";
	}

	public String updateemployedata(List<employe> al) {
		System.out.println("update in dao"+al);
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		for (employe employe : al) {
			session.update(employe);
		}
		tr.commit();
		return "update data successfully";
	}

	public void deleteemployedata(int id) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		employe ee=session.load(employe.class, id);
		session.delete(ee);
		tr.commit();
		session.close();
		
	}

}
