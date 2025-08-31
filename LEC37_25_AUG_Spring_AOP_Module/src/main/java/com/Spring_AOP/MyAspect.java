package com.Spring_AOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@Before("execution(* com.Spring_AOP.Service.payment(..))")
	public void printBefore()
	{
		System.out.println("i am printing before payment method");
	}
	
	
//	@After("execution(* com.Srping_AOP.Service.payment(..)")
//	public void printAfter()
//	{
//		System.out.println("i am printing after payment method");
//	}

    
	
}
