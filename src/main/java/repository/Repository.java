package repository;

import org.springframework.data.repository.CrudRepository;

import entity.Image;

public interface Repository extends CrudRepository<Image, Long>{

}
