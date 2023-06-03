package com.aop.spring_aspect_oriented_program.advices;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect

//
public class MyAspect {
//	
	@Before("execution(* com.aop.spring_aspect_oriented_program.service.PaymentServiceImpl.makePayment(..))")
	public void AuthoriseUser() {
		System.out.println("Authoriation impleted..");
		
	}
	

	
	@After("execution(* com.aop.spring_aspect_oriented_program.service.PaymentServiceImpl.makePayment(..))")
	public void taskCompleted() {
		System.out.println("Transaction completed");
		
	}
}
