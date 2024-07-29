package com.example.serviceb.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="SERVICEA")
public interface OtherRequest {

	@GetMapping("helloWorld")
	String getName();
}
