package com.app.service;

import java.util.List;

import com.app.pojo.Student;

public interface Studentserv {


	List<Student> getallStudents();

	Student addStudents(Student std);

	String deleteStudent(Long stdId);

	Student editStudent(Student std);

}
