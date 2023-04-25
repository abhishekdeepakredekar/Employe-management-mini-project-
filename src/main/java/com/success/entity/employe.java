package com.success.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class employe {
	
	private int id;
	private String name;
	private String salary;
	private String company;
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "employe [id=" + id + ", name=" + name + ", salary=" + salary + ", company=" + company + "]";
	}
	
	

}
