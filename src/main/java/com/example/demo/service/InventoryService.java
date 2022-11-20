package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Inventory;
import com.example.demo.repository.InventoryRepository;

@Service
public class InventoryService {

	@Autowired
	InventoryRepository inventoryRepository;
	
	
	public void saveInventory(Inventory inventory) {
		inventoryRepository.save(inventory);
	}
	
	public Optional<Inventory> getInventory(Long inventoryId) {
		return inventoryRepository.findById(inventoryId);
		
	}
}
