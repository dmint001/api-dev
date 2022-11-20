package com.deboprio.assignmenttwo.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.deboprio.assignmenttwo.entities.Student;
import com.deboprio.assignmenttwo.repos.StudentRepository;


@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository repository;
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return repository.findAll();
	}
	
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable long id) {
		Optional<Student> student = repository.findById(id);
		if (student.isEmpty()) {
			throw new RuntimeException("student not found with id " + id);		
		}
		return student.get();
		
	}
	
	@PostMapping("/students")
	public void createStudent(@RequestBody Student student) {
		repository.save(student);

	}
	@DeleteMapping("/students/{id}")
	public void deleteStudent(@PathVariable long id) {
		repository.deleteById(id);
		
	}
	@PutMapping("/students")
	public void updateStudent(@RequestBody Student student) {
		repository.save(student);

	}
	
}

