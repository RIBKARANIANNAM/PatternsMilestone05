package com.Ribka.DMS.repository;

import java.util.List;
/**
 * 
 * @author S556462/ Ribkarani Annam
 *
 */



import org.springframework.data.repository.CrudRepository;

import com.Ribka.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog,Integer> {
	
     List<Dog> findByName(String name);	

}
