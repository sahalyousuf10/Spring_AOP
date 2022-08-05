package com.sahal.spring.aop.spring_aop.data;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class Dao {
	
	public String retrieveSomething() {
		
		return "Dao";
	}

}
