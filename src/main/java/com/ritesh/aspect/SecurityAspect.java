//package com.ritesh.aspect;
//
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
//@Aspect
//@Component
//public class SecurityAspect {
//
//    @Pointcut("execution(* com.ritesh.service.*.*(..))")
//    public void p1(){}
//
//    @Before("p1()")
//    public void securityLog(){
//        System.out.println("this is just a security log");
//    }
//
//    @Before("p1() && args(user, ..)")
//    public void securityLogWithArgs(String user){
//        System.out.println("User " + user + " proceed with the payment");
//        if (!"ADMIN".equals(user)) throw new SecurityException("Access denied");
//    }

//    @Before("p1()")
//    public void isAdmin(String user){
//        System.out.println("this is security aspect");
//        System.out.println("Security aspect called with username " + user);
//        if (!"ADMIN".equals(user)) throw new SecurityException("Access denied");
//
//    }
//}
