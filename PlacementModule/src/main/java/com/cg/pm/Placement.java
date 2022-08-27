package com.cg.pm;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Placement {
private Integer id;
private String name;
private String college;
private LocalDate date;
private String qualification;
private Integer year;
   
public Placement(Integer id, String name, String college, LocalDate date, String qualification, Integer year) {
	super();
	this.id = id;
	this.name = name;
	this.college = college;
	this.date = date;
	this.qualification = qualification;
	this.year = year;
}
public Placement(){

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
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public Integer getYear() {
	return year;
}
public void setYear(Integer year) {
	this.year = year;
}
@Override
public String toString() {
	return "Placement [id=" + id + ", name=" + name + ", college=" + college + ", date=" + date + ", qualification="
			+ qualification + ", year=" + year + ", getId()=" + getId() + ", getName()=" + getName() + ", getCollege()="
			+ getCollege() + ", getDate()=" + getDate() + ", getQualification()=" + getQualification() + ", getYear()="
			+ getYear() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}

}
