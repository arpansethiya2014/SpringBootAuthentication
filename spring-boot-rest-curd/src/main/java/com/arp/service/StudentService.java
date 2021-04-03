package com.arp.service;

import com.arp.entity.*;
import java.util.*;

public interface StudentService {

	Student save(Student s);

	void deleteById(Long id);

	Optional<Student> searchById(Long id);

	List<Student> searchAll();
}
