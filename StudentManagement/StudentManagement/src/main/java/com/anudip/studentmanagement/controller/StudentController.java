package com.anudip.studentmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anudip.studentmanagement.entity.Student;
import com.anudip.studentmanagement.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/students")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@RequestMapping(method = RequestMethod.POST , value="/students")
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/students/{rollNo}")
	public void updateStudent(@PathVariable String rollNo,@RequestBody Student student) {
			studentService.updateStudent(rollNo, student);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/students/{rollNo}")
	public void deleteStudent(@PathVariable String rollNo) {
		studentService.deleteStudent(rollNo);
	}
	
}


