package com.arp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arp.entity.Student;
import com.arp.exception.ResourceNotFoundException;
import com.arp.service.StudentService;
import java.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/students")
	public String saveStudent(@RequestBody Student student) {
		studentService.save(student);
		return "Add Student";
	}

	@GetMapping("/students/{id}")
	public Student searchById(@PathVariable(value = "id") Long id) {
		return studentService.searchById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Record Not Found : " + id));
	}

	@GetMapping("/students")
	public List<Student> searchAll() {
		return studentService.searchAll();
	}

	@PutMapping("/students/{id}")
	public String updateStudent(@PathVariable(value = "id") Long id, @RequestBody Student student) {
		return studentService.searchById(id).map(s -> {
			s.setName(student.getName());
			s.setMobile(student.getMobile());
			s.setEmail(student.getEmail());
			s.setSchool(student.getSchool());
			studentService.save(s);
			return "Student updated";
		}).orElseThrow(() -> new ResourceNotFoundException("Student Id " + id + " not found"));
	}

	@DeleteMapping("/students/{id}")
	public String deleteStudent(@PathVariable(value = "id") Long id) {
		return studentService.searchById(id).map(s ->{
			studentService.deleteById(id);
			return "Student Delete";
		}).orElseThrow(() -> new ResourceNotFoundException("Student Id " + id + "Not Found"));
	}
	
}
