package com.studentRestApi.studentRestApi.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentRestApi.studentRestApi.dao.StudentDao;
import com.studentRestApi.studentRestApi.entities.Students;

@Service
public class StudentsServiceImplementation implements StudentService {

//	List<Students> list;
	@Autowired
	private StudentDao studentDao;
	
	public StudentsServiceImplementation() {
//		list=new ArrayList<>();
//		list.add(new Students(1, "Swati", "Kumari", 9693273941l, "kumari.0325.swati@gmail.com"));
//		list.add(new Students(2, "Micku", "Kumar", 9472304871l, "kumar.0325.micku@gmail.com"));
		
	}


	@Override
	public List<Students> getStudents() {
//		return list;
		return studentDao.findAll();
	}


	@Override
	public Students getStudent(int studentId) {
//		Students s=null;
//		
//		for(Students students: list) {
//			if(students.getId()==studentId) {
//				s=students;
//				break;
//			}
//		}
//		return s;
		return studentDao.getOne(studentId);
	}


	@Override
	public Students addStudent(Students student) {
//		list.add(student);
//		return student;
		studentDao.save(student);
		return student;
	}


	@Override
	public Students updateStudent(Students student) {
//		list.forEach(e -> {
//			if(e.getId()==student.getId()) 
//			{
//				e.setFname(student.getFname());
//				e.setLname(student.getLname());
//				e.setPhoneNum(student.getPhoneNum());
//				e.setEmailId(student.getEmailId());
//			}
//		});
//		return student;
		studentDao.save(student);
		return student;
	}


	@Override
	public void deleteStudent(int studentid) {
//		Iterator<Students> iterator=list.iterator();
//		while(iterator.hasNext())
//		{
//			Students stu= iterator.next();
//			if(stu.getId()==studentid) {
//				iterator.remove();
//			}
//		}
		Students entity=studentDao.getOne(studentid);
		studentDao.delete(entity);
	}
	
	

}
