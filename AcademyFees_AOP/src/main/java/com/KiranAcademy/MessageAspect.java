package com.KiranAcademy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MessageAspect {

//	@Before("execution(public void pendingFees())")
//	public void pendingFees() {
//		System.err.println("Your fees are incomplete...,Please complete your fees after deadline...!");
//	}

//	@After("execution (* com.KiranAcademy.AcademyFees.*(..))")
//	public void feescomleted() {
//		System.err.println("Your fees completed successfuly..., All the best..!");
//	}

	@Around("execution (* com.KiranAcademy.AcademyFees.*(..))")
	public void feesUpdate(ProceedingJoinPoint point) {

		System.err.println("Your fees are incomplete...,Please complete your fees after deadline...!");

		try {
			point.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}

		System.err.println("Your fees completed successfuly..., All the best..!");
	}
}
