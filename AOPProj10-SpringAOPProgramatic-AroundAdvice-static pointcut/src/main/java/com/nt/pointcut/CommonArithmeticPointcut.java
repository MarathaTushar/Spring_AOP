package com.nt.pointcut;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

import com.nt.service.ArithmeticOperations;

public class CommonArithmeticPointcut extends StaticMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> clazz) {
	
		if(clazz==ArithmeticOperations.class &&method.getName().equals("add"))
			 return true;
		else
		   return false;
	}

}
