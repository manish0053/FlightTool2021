package com.infy.util;

import java.text.DateFormat;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.infy.dto.FlightDTO;

@Component
@Aspect
public class LoggingAspect {
	private static Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

//	@AfterThrowing("execution(* com.infy.service.FlightServiceImpl.*(..))")
//	public void logAfterThrowingAdvice(JoinPoint joinPoint) {
//		logger.info("In After throwing Advice, Joinpoint signature :{}", joinPoint.getSignature());
//
//	}


	@Pointcut("execution(* com.infy.service.FlightServiceImpl.*(..))")
	public void logAfterAdvice(JoinPoint joinPoint) {
		logger.info("In After Advice, Joinpoint signature :{}", joinPoint.getSignature());
		long time = System.currentTimeMillis();
		String date = DateFormat.getDateTimeInstance().format(time);
		logger.info("Report generated at time {}", date);
	}
 

//	@AfterReturning(pointcut = "execution(* com.infy.service.FlightServiceImpl.*(..))", returning = "result")
//	public void logAfterReturningDetails(JoinPoint joinPoint, List<FlightDTO> result) {
//		logger.info("In AfterReturning Advice with return value, Joinpoint signature :{}", joinPoint.getSignature());
//		System.out.println(result);
//		long time = System.currentTimeMillis();
//		String date = DateFormat.getDateTimeInstance().format(time);
//		logger.info("Report generated at time:{}", date);
//	}





}
