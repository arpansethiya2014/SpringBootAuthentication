package com.arp.service;
import com.arp.entity.*;
import java.util.*;
public interface MarksService {

	Marks save(Marks m);
	Optional<Marks> searchById(Long marksId);
	
}
