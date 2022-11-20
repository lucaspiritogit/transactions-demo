package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Adventurer;

@Repository
public interface AdventurerRepository extends CrudRepository<Adventurer, Long>{

}
