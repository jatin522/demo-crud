package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.DemoUserDto;
import com.example.demo.model.DemoUser;
import com.example.demo.repository.DemoRepository;
import com.example.demo.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {
	
	@Autowired
	DemoRepository demoRepository; 

	@Override
	public DemoUserDto create(DemoUser demoUser) {
		
		try {
             DemoUser addedUser = demoRepository.save(demoUser);
             DemoUserDto addedUserDto = new DemoUserDto( addedUser.getId(),
            		 									 addedUser.getName(),
            		 									 addedUser.getemail());
             return addedUserDto;
        } catch (Exception e) {
            System.out.println("Error saving user: " + e.getMessage());
            e.printStackTrace();
            return null; // or handle more gracefully depending on your error handling strategy
        }
	}

	@Override
	public List<DemoUserDto> fetchAll() {
		List<DemoUser> userList = demoRepository.findAll();
		List<DemoUserDto> userListDto = new ArrayList<>();
		for(DemoUser currentUser : userList) {
			DemoUserDto currentUserDto = new DemoUserDto( currentUser.getId(),
					currentUser.getName(),
					currentUser.getemail());
			userListDto.add(currentUserDto);
		}
		return userListDto;
	}

}
