package com.example.swaggerexample.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.swaggerexample.dto.UserDto;

@RestController
@RequestMapping("/rest/user")
public class UserController
{
	
	
	@GetMapping
	public List<UserDto> getList()
	{
		return Arrays.asList(new UserDto("imman", 2000L),new UserDto("immanuel", 5000L));
	}
	
	
	
	
	@GetMapping("/${userName}")
	public UserDto getUser(@PathVariable("userName") String  userName)
	{
		return new UserDto(userName, 5000L);
	}

	

}
