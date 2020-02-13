package com.example.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "STUDENT-PROVIDER")
public interface StudentFeignClientInterface {

	/**
	 * equals to
	 * <p>
	 * RestTemplate rt=new RestTemplate();
	 * <p>
	 * ResponseEntity<String>resp=rt.getForEntity("http://localhost:8900/provider/show",String.class);
	 * <p>
	 * System.out.println(resp.getBody()); System.out.println("=-=-=-=-=-Message
	 * From Admin Consumer=-=-=-=-");
	 * <p>
	 * 
	 * Insted of this rest template we are using this feign client to call rest
	 * services like spring way(@Autowired that feign client)
	 */

	/*
	 * this is provider service url, we are autowiring in consumer and call through
	 * feign. Internally feign client act as a RestTemplate and gives the response
	 */
	@GetMapping("/student-provider/get")
	public String getData();
}
