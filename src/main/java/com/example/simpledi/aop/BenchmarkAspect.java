package com.example.simpledi.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BenchmarkAspect {

    @Around("@annotation(Benchmark)")
    public Object execEntryPoint(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.printf("[[[BENCHMARK method %s%n", joinPoint.getSignature().getName());
        long start = System.nanoTime();
        Object retVal = joinPoint.proceed();
        long end = System.nanoTime();
        System.out.printf("Time: %dns]]]%n", end - start);
        return retVal;
    }
}
