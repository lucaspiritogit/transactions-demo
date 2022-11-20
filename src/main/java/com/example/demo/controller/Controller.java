package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AdventurerDTO;
import com.example.demo.entity.Adventurer;
import com.example.demo.entity.Inventory;
import com.example.demo.service.AdventurerService;
import com.example.demo.service.InventoryService;

@RestController
public class Controller {

	@Autowired
	AdventurerService adventurerService;
	
	@Autowired
	InventoryService inventoryService;
	
	@PostMapping(value = "/api/adventurer", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Adventurer> newAdventurer(@RequestBody AdventurerDTO adventurerDto) throws Exception {

		Inventory inventory = new Inventory();
		inventory.setSword(adventurerDto.getInventory().getSword());
		inventory.setShield(adventurerDto.getInventory().getShield());
		inventory.setBackpack(adventurerDto.getInventory().getBackpack());
		
		Adventurer adventurer = new Adventurer();
		adventurer.setName(adventurerDto.getAdventurer().getName());
		adventurer.setInventory(adventurerDto.getInventory());
		
		adventurerService.createAdventurer(adventurer);
		return ResponseEntity.ok(adventurer);
	}
	
	@PostMapping(value = "/api/inventory", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Inventory> newInventory(@RequestBody Inventory inventory) {
		inventoryService.saveInventory(inventory);
		return ResponseEntity.ok(inventory);
	}
}
