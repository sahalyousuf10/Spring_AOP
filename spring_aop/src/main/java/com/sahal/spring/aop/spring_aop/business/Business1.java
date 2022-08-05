package com.sahal.spring.aop.spring_aop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sahal.spring.aop.spring_aop.data.Dao;

@Service
public class Business1 {
	
	@Autowired
	private Dao dao;
	public String calculateSomething() {
		
		return dao.retrieveSomething();
	}

}
