package com.cg.student;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	private Integer id;
	private String name;
	private String college;
	private long roll;
	private String qualification;
	private String course;
	private int year; 
	private long certificate;
	private long hallticketno;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer id, String name, String college, long roll, String qualification, String course,
			int year, long certificate, long hallticketno) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.roll = roll;
		this.qualification = qualification;
		this.course = course;
		this.year = year;
		this.certificate = certificate;
		this.hallticketno = hallticketno;
	}

	@Id
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public long getRoll() {
		return roll;
	}

	public void setRoll(long roll) {
		this.roll = roll;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public long getCertificate() {
		return certificate;
	}

	public void setCertificate(long certificate) {
		this.certificate = certificate;
	}

	public long getHallticketno() {
		return hallticketno;
	}

	public void setHallticketno(long hallticketno) {
		this.hallticketno = hallticketno;
	}

	@Override
	public String toString() {
		return "StudentService [id=" + id + ", name=" + name + ", college=" + college + ", roll=" + roll
				+ ", qualification=" + qualification + ", course=" + course + ", year=" + year + ", certificate="
				+ certificate + ", hallticketno=" + hallticketno + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getCollege()=" + getCollege() + ", getRoll()=" + getRoll() + ", getQualification()="
				+ getQualification() + ", getCourse()=" + getCourse() + ", getYear()=" + getYear()
				+ ", getCertificate()=" + getCertificate() + ", getHallticketno()=" + getHallticketno()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
