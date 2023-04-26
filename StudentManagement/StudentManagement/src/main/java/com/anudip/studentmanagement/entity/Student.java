package com.anudip.studentmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	@Id
	private String rollNo;
	@Column
	private String name;
	@Column
	private int std;
	@Column
	private String city;
	
	public Student() {
		
	}

	public Student(String rollNo, String name, int std, String city) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.std = std;
		this.city = city;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
