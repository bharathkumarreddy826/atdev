package com.crud.atdev.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Students")
@Entity
public class StudentsEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentId;
	private String studentName;
	private Double studentCgpa;
	
	public StudentsEntity(int studentId, String studentName, Double studentCgpa) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCgpa = studentCgpa;
	}
	public StudentsEntity() {
		
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Double getStudentCgpa() {
		return studentCgpa;
	}
	public void setStudentCgpa(Double studentCgpa) {
		this.studentCgpa = studentCgpa;
	}
	@Override
	public String toString() {
		return "StudentsEntity [studentId=" + studentId + ", studentName=" + studentName + ", studentCgpa="
				+ studentCgpa + "]";
	}
	
	
	
	
}
