package com.success.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.success.dao.dao;
import com.success.entity.employe;

@Service
public class service {
	@Autowired
	dao dd;

	public List<employe> getemployedata() {
		 return dd.getemployedata();
		
	}

	public String insertemployedata(List<employe> al) {
		String msg=dd.insertemployedata(al);
		return msg;
	}

	public String updateemployedata(List<employe> al) {
		String msg=dd.updateemployedata(al);
		return msg;
	}

	public void deleteemployedata(int id) {
		dd.deleteemployedata(id);
		
	}

}
