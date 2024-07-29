package com.microservice.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.entities.Address;
import com.microservice.repository.AddressRepository;
import com.microservice.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressRepository addressRepository;

	@Override
	public Address saveAddress(Address address) {
		return addressRepository.save(address);
	}

	@Override
	public List<Address> fetchAddressList() {
		return addressRepository.findAll();
	}

	@Override
	public Address fetchAddress(Long id) {
		Optional<Address> address = addressRepository.findById(id);
		Address us = address.get();
		return us;
	}
}
