package com.ritesh.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* com.ritesh.service.*.*(..))")
    public void p1(){}

    @Before("p1()")
    public void logBeforeMethod(JoinPoint joinPoint){
        System.out.println("--------Loggin Aspect--------");
        System.out.println("Method called " + joinPoint.getSignature().getName());
        System.out.println("Arguments " + Arrays.toString(joinPoint.getArgs()));
        System.out.println("------------------------------");
    }

//    @After("p1()")
//    public void logAfterMethod(JoinPoint joinPoint){
//        System.out.println("-----------After aspect----------");
//        System.out.println("Method called " + joinPoint.getSignature().getName());
//        System.out.println("Arguments " + Arrays.toString(joinPoint.getArgs()));
//        System.out.println("---------------------------------");
//    }
//
//    @AfterReturning("p1()")
//    public void logAfterPersisting(JoinPoint joinPoint){
//        System.out.println("-------------After persisting data-----------");
//        System.out.println("Email sent");
//        System.out.println("---------------------------------------------");
//    }
//
//    @AfterThrowing("p1()")
//    public void logAfterThrowing(){
//        System.out.println("--------------- After throwing----------------");
//        System.out.println("Sorry, something went wrong, while performing operation with the product");
//        System.out.println("Email not sent");
//    }
}
