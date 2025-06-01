package com.example.ums.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Before("execution(public java.util.List com.example.ums.api.StudentApi.getAll())")
    public void log() {
        log.info("Executing...");
    }

    @AfterThrowing("execution(public * com.example.ums.repository.*.*())")
    public void exceptionHandler(JoinPoint joinPoint) {
        System.out.println("Exception: " + joinPoint.getSignature().getName());
    }

    @Around("execution(public * com.example.ums.repository.*.*(..))")
    public Object exceptionHandler(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Executing method: " + joinPoint.getSignature().getName());
        try {
            return joinPoint.proceed();
        } catch (Throwable e) {
            System.out.println("Exception caught in method: " + joinPoint.getSignature().getName());
            System.out.println("Exception message: " + e.getMessage());
            return null;
        }
    }
}
