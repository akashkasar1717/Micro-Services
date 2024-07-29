package com.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{
	
}
