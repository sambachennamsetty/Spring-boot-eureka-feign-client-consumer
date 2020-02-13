package com.example.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.feign.StudentFeignClientInterface;

@RestController
@RequestMapping("/student-consumer")
public class StudentConsumer {

	@Autowired
	StudentFeignClientInterface studentFeignClientInterface;
	
	@GetMapping("/get")
	public String showData() {
		System.out.println(studentFeignClientInterface.getClass().getName());
		return "getting from consumer====> "+studentFeignClientInterface.getData();
	}
	
}
