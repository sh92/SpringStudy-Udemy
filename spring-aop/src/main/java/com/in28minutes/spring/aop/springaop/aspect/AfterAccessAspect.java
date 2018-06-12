package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect
@Configuration
public class AfterAccessAspect {
	
	// What kind of method calls I would intercept
	//execution(* package.*.*(..))
	//Weaving & Weaver
	private Logger logger =  LoggerFactory.getLogger(this.getClass());

	
	@AfterReturning(
			value="com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()",
			returning="result"
			)
	public void afterReturning(JoinPoint joinPoint, Object result) {
		//what to do?
		logger.info("{} returned with value {}", joinPoint, result);
	}
	
//	@AfterThrowing(
//			value="execution(* com.in28minutes.spring.aop.springaop.business.*.*(..))",
//			throwing="exception"
//			)
//	public void after(JoinPoint joinPoint, Exception exception) {
//		//what to do?
//		logger.info("{} returned with  {}", joinPoint, exception);
//	}
	
	@After(value="com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public void after(JoinPoint joinPoint) {
		//what to do?
		logger.info("after execution of {}", joinPoint);
	}
	
	
}
