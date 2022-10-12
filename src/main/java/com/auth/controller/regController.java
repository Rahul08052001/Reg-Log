package com.auth.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth.dto.UserDTO;
import com.auth.model.Login;
import com.auth.model.Registration;
import com.auth.service.RegistrationService;

@RestController
@RequestMapping(value="/registration")
public class regController {
	
	@Autowired
	private RegistrationService regService;
	
	/*
	 * @PostMapping("/saveuser") public User saveProduct(@RequestBody UserDTO
	 * userDTO) { User user = new User(); BeanUtils.copyProperties(userDTO, user);
	 * 
	 * Authenticate authenticate = new Authenticate();
	 * authenticate.setPassword(user.getPassword());
	 * authenticate.setEmail(user.getEmail()); user.setAuthenticate(authenticate);
	 * regService.save(user); return user;
	 * 
	 * }
	 */
	
	@PostMapping("/saveuser")
	public Registration saveProduct(@RequestBody UserDTO userDTO)
	{
		Registration user = new Registration();
		BeanUtils.copyProperties(userDTO, user);
		
		Login authenticate = new Login();
		authenticate.setPassword(user.getPassword());
		authenticate.setEmail(user.getEmail());
		user.setLogin(authenticate);
		regService.save(user);
		return user;
	}
		
}
