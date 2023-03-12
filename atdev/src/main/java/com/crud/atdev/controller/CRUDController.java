package com.crud.atdev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.atdev.entity.StudentsEntity;
import com.crud.atdev.service.StudentsService;

@RestController
@RequestMapping("/atdevservices")
public class CRUDController {
	
	@Autowired
	private StudentsService studentService;
	
	@GetMapping("/getstudents")
	public List<StudentsEntity> fetchStudents(){
		return studentService.fetchStudents();
	}
	
	@PostMapping("/poststudent")
	public void saveDetails(@RequestBody StudentsEntity studentsEntity) {
		studentService.saveDetails(studentsEntity);
	}
	
	@DeleteMapping("/deletestudent/{id}")
	public void deleteStudent(@PathVariable int id) {
		studentService.deleteStudent(id);
	}
	
	@PostMapping("/updatestudent/{id}")
	public void updateStudent(@PathVariable int id, @RequestBody StudentsEntity studentsEntity) {
		if(studentsEntity.getStudentName()==null) {
			studentsEntity.setStudentName(studentService.getStudent(id).getStudentName());
		}else if(studentsEntity.getStudentCgpa()==null) {
			studentsEntity.setStudentCgpa(studentService.getStudent(id).getStudentCgpa());
		}
		
		studentService.updateStudent(studentsEntity);
	}
}
