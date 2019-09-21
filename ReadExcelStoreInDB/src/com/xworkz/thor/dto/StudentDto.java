package com.xworkz.thor.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="readexcel")

public class StudentDto implements Serializable {
	@Id
	
	@Column(name="sid")
	private double id;
	@Column(name="sname")
	private String name;
	@Column(name="sadress")
	private String address;

	
	public StudentDto() {
		System.out.println("invoking student"+this.getClass().getSimpleName());
	}


	public double getId() {
		return id;
	}


	public void setId(double id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	

	
}
