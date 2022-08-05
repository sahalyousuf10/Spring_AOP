package com.sahal.spring.aop.spring_aop;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sahal.spring.aop.spring_aop.business.Business1;
import com.sahal.spring.aop.spring_aop.business.Business2;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {

	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	Business1 business1;
	
	@Autowired
	Business2 business2;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		logger.info(business1.calculateSomething());
		logger.info(business2.calculateSomething());
		
	}

}
