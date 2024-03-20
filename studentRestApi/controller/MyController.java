package com.studentRestApi.studentRestApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentRestApi.studentRestApi.entities.Students;
import com.studentRestApi.studentRestApi.services.StudentService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class MyController {

	@Autowired  //tell spring to create the object of this class
	private StudentService studentService;
	
	@GetMapping("/home")
	public String home() {
		return "This is home page";
	}
	
//	Get all Students
	@GetMapping("/students")
	public List<Students> getStudents(){
		return this.studentService.getStudents();
	}
	
	@GetMapping("/students/{studentid}")
	public Students getStudent(@PathVariable int studentid) {
		return this.studentService.getStudent(studentid);
	}
	
	@PostMapping(path="/students" , consumes = "application/json")
	public Students addStudent(@RequestBody Students student) {
		return this.studentService.addStudent(student);
	}
	
	@PutMapping("/students")
	public Students updateStudent(@RequestBody Students student) {
		return this.studentService.updateStudent(student);
	}
	
	@DeleteMapping("/students/{studentid}")
	public ResponseEntity<HttpStatus> deleteStudent(@PathVariable int studentid) {
		try {
			this.studentService.deleteStudent(studentid);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
