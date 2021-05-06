package com.example.simpledi.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ChangeNameAspect {

    @Around("@annotation(ChangeName)")
    public String change(ProceedingJoinPoint joinPoint) throws Throwable {
        String name = (String) joinPoint.proceed();
        return name + " Diskein";
    }
}
