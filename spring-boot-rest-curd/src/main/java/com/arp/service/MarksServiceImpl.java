package com.arp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arp.entity.Marks;
import com.arp.repo.MarksRepository;

@Service
public class MarksServiceImpl implements MarksService{

	@Autowired
	private MarksRepository marksRepo;
	
	@Override
	public Marks save(Marks m) {
		return marksRepo.save(m);
	}

	@Override
	public Optional<Marks> searchById(Long marksId) {
		return marksRepo.findById(marksId);
	}

	
	
}
