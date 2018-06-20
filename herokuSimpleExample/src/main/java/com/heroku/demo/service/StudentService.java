package com.heroku.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.heroku.demo.model.Student;
@Service
public class StudentService {
	List<Student>students=new ArrayList<Student>();
	
	public List<Student> getAllStudent(){
		return getAllStudents();
	}
	public void addStudent(Student student){
		students.add(student);
	}
	private List<Student> getAllStudents(){
		Student student1=new Student("FBER460", "Befrdu", "Computer Science", 28);
		Student student2=new Student("FBER461", "Zelalem", "Database Administrator", 24);
		Student student3=new Student("FBER462", "Eleni", "Network Administrator", 28);
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		return students;
	}

}
