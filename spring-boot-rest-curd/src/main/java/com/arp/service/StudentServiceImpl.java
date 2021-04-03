package com.arp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arp.entity.Student;
import com.arp.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student save(Student s) {
		return studentRepository.save(s);
	}

	@Override
	public void deleteById(Long id) {
		studentRepository.deleteById(id);

	}

	@Override
	public Optional<Student> searchById(Long id) {
        return studentRepository.findById(id);
	}

	@Override
	public List<Student> searchAll() {
		return studentRepository.findAll();
	}

}
