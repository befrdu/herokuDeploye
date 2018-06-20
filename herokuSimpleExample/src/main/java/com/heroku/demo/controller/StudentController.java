package com.heroku.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heroku.demo.model.Student;
import com.heroku.demo.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@GetMapping("/")
	public List<Student> getAllStudents(){
		return studentService.getAllStudent();
	}
	@PostMapping("/add")
	public String addStudent(Student student){
		studentService.addStudent(student);
		return student.getName()+" is added to DB";
	}

}
