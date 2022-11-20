package com.example.demo.service;

import javax.management.RuntimeErrorException;

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
	
	@Transactional(rollbackFor = Exception.class)
	public void createAdventurer(Adventurer adventurer) throws Exception {
		try {
			if(!adventurer.getInventory().getBackpack()) {
				throw new Exception();
			}
			adventurerRepository.save(adventurer);
		} catch (Exception e) {
			throw new CustomException("An adventurer always needs a backpack!");
		}
		
	}
	
	public Adventurer getAdventurer(Adventurer adventurer) {
		adventurerRepository.findById(adventurer.getId());
		
		return adventurer;
	}
	
}
