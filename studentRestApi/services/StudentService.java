package com.studentRestApi.studentRestApi.services;

import java.util.List;

import com.studentRestApi.studentRestApi.entities.Students;

public interface StudentService {
	
	public List<Students> getStudents();
	public Students getStudent(int studentId);
	public Students addStudent(Students student);
	public Students updateStudent(Students student);
	public void deleteStudent(int studentid);
}
