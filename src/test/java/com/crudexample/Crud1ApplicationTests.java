package com.crudexample;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.crudexample.Repository.studentRepository;
import com.crudexample.entity.student;

@SpringBootTest
class Crud1ApplicationTests {

	@Autowired
	public studentRepository studentRepo;
	
	
	@Test
	void saveonestudentInfo() {
		student s=new student();
		s.setName("mubarak");
		s.setCourse("engineering");
		s.setFee(45000);
		studentRepo.save(s);
	}
	
	@Test
	void deleteonestudentInfo() {
		studentRepo.deleteById(3L);
	}
	
	@Test
	void updateonestudentInfo() {
		student s=new student();
		s.setId(2);
		s.setName("sam");
		s.setCourse("engineering");
		s.setFee(45000);
		studentRepo.save(s);
	}
	@Test
	void getonestudentInfo() {
		Optional<student> findById = studentRepo.findById(4L);
		student student = findById.get();
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getCourse());
		System.out.println(student.getFee());
	}
}

