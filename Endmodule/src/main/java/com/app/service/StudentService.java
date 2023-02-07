package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojo.Student;
import com.app.repository.StudentReo;
@Service
@Transactional
public class StudentService implements Studentserv{

	@Autowired
	private StudentReo stdrep;
	@Override
	public List<Student> getallStudents() {
		return stdrep.findAll();
	}
	@Override
	public Student addStudents(Student std) {
		return stdrep.save(std);
	}
	@Override
	public String deleteStudent(Long stdId) {
		if(stdrep.existsById(stdId)) {
			stdrep.deleteById(stdId);
			return "student deleted";
		}
		return "Deletion Failed:Invalid Data";
	}
	@Override
	public Student editStudent(Student std) {
		if(stdrep.existsById(std.getId())) {
		return stdrep.save(std);
		}
		return std;
		
	}
	
	
	

}
