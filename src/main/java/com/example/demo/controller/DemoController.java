package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.DemoUserDto;
import com.example.demo.model.DemoUser;
import com.example.demo.service.DemoService;
import com.example.demo.service.impl.DemoServiceImpl;

@RestController
public class DemoController {
	
	private DemoService demoService;
	
	@Autowired
	public DemoController(DemoServiceImpl demoServiceImpl) {
		this.demoService = demoServiceImpl;
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}
	
	@PostMapping("/create")
	public DemoUserDto save(@RequestBody DemoUser demoUser) {
		System.out.println(demoUser.getId());
		return demoService.create(demoUser);
	}
	
	@GetMapping("/fetchAll")
	public List<DemoUserDto> fetchAll() {
		return demoService.fetchAll();
	}
}
