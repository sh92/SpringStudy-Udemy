package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect
@Configuration
public class BeforeAccessAspect {
	
	// What kind of method calls I would intercept
	//execution(* package.*.*(..))
	//Weaving & Weaver
	private Logger logger =  LoggerFactory.getLogger(this.getClass());

	@Before("com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()")
	public void before (JoinPoint joinPoint) {
		//what to do?
		logger.info(" Check for user access");
		logger.info(" Allowed execution for -{}", joinPoint);
	}
}
