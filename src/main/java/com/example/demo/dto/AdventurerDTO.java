package com.example.demo.dto;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Adventurer;
import com.example.demo.entity.Inventory;

@Component
public class AdventurerDTO {

	private Adventurer adventurer;
	private Inventory inventory;
	
	public Adventurer getAdventurer() {
		return adventurer;
	}
	public void setAdventurer(Adventurer adventurer) {
		this.adventurer = adventurer;
	}
	public Inventory getInventory() {
		return inventory;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
	
}
