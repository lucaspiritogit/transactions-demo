package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Adventurer;
import com.example.demo.exceptionHandler.CustomException;
import com.example.demo.repository.AdventurerRepository;

@Service
public class AdventurerService {

	@Autowired
	AdventurerRepository adventurerRepository;
	
	@Transactional
	public void registerAdventurer(Adventurer adventurer) throws RuntimeException {
			if(!adventurer.getInventory().getSword()) {
				throw new CustomException("An adventurer always needs a sword!");
			}
			adventurerRepository.save(adventurer);
		
	}
	
	public Optional<Adventurer> getAdventurer(Long adventurerId) {
		return adventurerRepository.findById(adventurerId);
		
	}
	
	public Iterable<Adventurer> getAllAdventurers() {
		return adventurerRepository.findAll();
	}
	
}
