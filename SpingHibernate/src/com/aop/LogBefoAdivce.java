package com.aop;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.aop.MethodBeforeAdvice;

public class LogBefoAdivce implements MethodBeforeAdvice{
	 private Logger logger = 
         Logger.getLogger(
                 this.getClass().getName()); 
 
 public void before(Method method,  Object[] args, Object target) throws Throwable { 
     logger.log(Level.INFO, "first method ends..." + method); 
     System.out.println("method end.......");
} 

}
