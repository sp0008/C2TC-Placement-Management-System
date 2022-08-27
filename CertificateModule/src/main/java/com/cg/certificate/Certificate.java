package com.cg.certificate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Certificate {
	
	private Integer id;
	private int year;
	private String college;
	
	public Certificate(Integer id, int year, String college) {
		super();
		this.id = id;
		this.year = year;
		this.college = college;
	}
	
	public Certificate() {
		
	}
	
	@Id
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Certificate [id=" + id + ", year=" + year + ", college=" + college + ", getId()=" + getId()
				+ ", getYear()=" + getYear() + ", getCollege()=" + getCollege() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
