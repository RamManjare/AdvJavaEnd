package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojo.Student;

public interface StudentReo extends JpaRepository<Student, Long>{

}
