package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inventory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Boolean sword;
	private Boolean shield;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Boolean getSword() {
		return sword;
	}
	public void setSword(Boolean sword) {
		this.sword = sword;
	}
	public Boolean getShield() {
		return shield;
	}
	public void setShield(Boolean shield) {
		this.shield = shield;
	}
	
	
}
