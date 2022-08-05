package com.sahal.spring.aop.spring_aop.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//aop
//configuation
@Aspect
@Configuration
public class UseAccessAspect {
	
	//what kind of method i would want to intercept
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	
	@Before("execution(* com.sahal.spring.aop.spring_aop.business.*.*(..))")
	public void before(Joinpoint joinpoint) {
		
		logger.info("Check for user access ");
		logger.info("Allowed execution for {}", joinpoint);
		
	}
	

}
