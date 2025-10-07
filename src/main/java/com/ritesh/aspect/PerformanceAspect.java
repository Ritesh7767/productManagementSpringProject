package com.ritesh.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class PerformanceAspect {

    @Around("execution(* com.ritesh.sevice.*.*(..))")
    public void calculateExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();

        System.out.println("Method " + proceedingJoinPoint.getSignature().getName() + " executed in time " + end);
    }
}
