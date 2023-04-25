package com.success.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.success.entity.employe;
import com.success.service.service;

@RestController
public class controller {
	@Autowired
	service ss;
	
	@GetMapping("/get")
	public List<employe> getemployedata() {
		return ss.getemployedata();
	}
	
	@PostMapping("/insert")
	public String insertemployedata(@RequestBody List<employe>al) {
		System.out.println("coming employe list"+al);
		String msg=ss.insertemployedata(al);
		return msg;
	}
	
	@PutMapping("/update")
	public String updateemployedata(@RequestBody List<employe>al) {
		System.out.println("coming employe list"+al);
		String msg=ss.updateemployedata(al);
		return msg;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteemployedata(@PathVariable int id) {
		ss.deleteemployedata(id);
		return "delete data successfully";
	}

}
