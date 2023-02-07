package com.app.pojo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="student_data")
public class Student extends BaseEntity{
private String FullName;
private String email;
private LocalDate dob;
private String address;
private double marks;

public Student() {
	super();
}
public Student(String fullName, String email, LocalDate dob, String address, double marks) {
	super();
	FullName = fullName;
	this.email = email;
	this.dob = dob;
	this.address = address;
	this.marks = marks;
}
public String getFullName() {
	return FullName;
}
public void setFullName(String fullName) {
	FullName = fullName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public double getMarks() {
	return marks;
}
public void setMarks(double marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student id="+getId()+"[FullName=" + FullName + ", email=" + email + ", dob=" + dob + ", address=" + address + ", marks="
			+ marks + "]";
}

	
}
