package com.microservice.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.dto.Address;

@FeignClient(name="MICRO-SERVICE-2")
public interface AddressExternal {

	@GetMapping("address/{id}")
	Address getAddress(@PathVariable Long id);
}
