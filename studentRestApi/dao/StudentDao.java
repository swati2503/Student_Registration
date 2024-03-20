package com.studentRestApi.studentRestApi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentRestApi.studentRestApi.entities.Students;

public interface StudentDao extends JpaRepository<Students, Integer>{
	
}
