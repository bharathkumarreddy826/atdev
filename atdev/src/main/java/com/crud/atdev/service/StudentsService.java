package com.crud.atdev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.atdev.entity.StudentsEntity;
import com.crud.atdev.repository.StudentsRepository;

@Service
public class StudentsService {
	
	@Autowired
	private StudentsRepository studentsRepo;
	
	public List<StudentsEntity> fetchStudents(){
		return studentsRepo.findAll();
	}
	
	public void saveDetails(StudentsEntity studentEntity) {
		studentsRepo.save(studentEntity);
	}

	public void deleteStudent(int id) {
		studentsRepo.deleteById(id);
	}

	public void updateStudent(StudentsEntity studentsEntity) {
		studentsRepo.save(studentsEntity);
	}
	
	public StudentsEntity getStudent(int id) {
		return studentsRepo.findById(id).orElse(null);
	}
}
