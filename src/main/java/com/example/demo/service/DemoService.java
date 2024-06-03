package com.example.demo.service;

import java.util.*;

import com.example.demo.dto.DemoUserDto;
import com.example.demo.model.DemoUser;

public interface DemoService {
	
	DemoUserDto create(DemoUser demoUser);
	List<DemoUserDto> fetchAll();
	
}
