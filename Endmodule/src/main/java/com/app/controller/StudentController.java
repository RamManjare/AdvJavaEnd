package com.app.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.*;
import com.app.service.Studentserv;
@RestController
@RequestMapping("/student")
public class StudentController{
	

	public StudentController() {
		super();
	}

	@Autowired
	private Studentserv stds;
	
	@GetMapping("/allstudents")
	
	public List<Student> getAllStudent(){
		System.out.println("getting student data");
		return stds.getallStudents();
	}
	
@PostMapping("/addstudent")
	
	public Student addStudent(@RequestBody Student std){
		System.out.println("adding student in data");
		return stds.addStudents(std);
	}

@DeleteMapping("/{stdId}")
public String deletestudent(@PathVariable Long stdId) {
	System.out.println("Deleting student from data");
return stds.deleteStudent(stdId);	
}

@PutMapping("/update")
public Student editStudent(@RequestBody Student std) {
	System.out.println("Udating student");
	return stds.editStudent(std);
}




}
