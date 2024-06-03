package com.example.demo.dto;

public class DemoUserDto {
	Long id;
	String name;
	String email; 
	
	public DemoUserDto(Long id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getemail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
