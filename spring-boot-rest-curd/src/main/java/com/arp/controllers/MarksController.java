package com.arp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.arp.entity.*;
import com.arp.service.MarksService;
import com.arp.service.StudentService;

@RestController
@RequestMapping("/api")
public class MarksController {

	@Autowired
	private MarksService marksService;

	@Autowired
	private StudentService studentService;

	@PostMapping("/addMarks/{studentId}")
	public Marks saveMarks(@PathVariable("studentId") Long studentId, @RequestBody Marks marks) {
		return studentService.searchById(studentId).map(p -> {
			marks.setStudent(p);
			return marksService.save(marks);
		}).orElseThrow(() -> new RuntimeException(" Student Id : " + studentId + " Not Found"));
	}
}
