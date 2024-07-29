package com.microservice.service;

import java.util.List;

import com.microservice.entities.Address;

public interface AddressService {
	Address saveAddress(Address address);

	List<Address> fetchAddressList();

	Address fetchAddress(Long id);
}
