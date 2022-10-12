package com.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth.model.Registration;
import com.auth.repository.RegistrationRepo;

import java.util.List;

@Service
public class RegistrationService {
	
	@Autowired
	RegistrationRepo regRepo;
	
	public Registration save(Registration user)
	{
		return regRepo.save(user);
		
	}
	public List<Registration> listAll()
	{
		return regRepo.findAll();
	}
	
	/*
	 * public User listById(Long id) { return productRepository.getById(id); }
	 * public void deleteProduct(long id) { productRepository.deleteById(id); }
	 */
}
