package com.example.simpledi.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class ShootStateAspect {

    @Around("@annotation(ShootState)")
    public void bench(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("стреба началась");
        Object proceed = joinPoint.proceed();
        System.out.println("стрельба закончилась");
    }
}
