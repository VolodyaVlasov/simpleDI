package com.example.simpledi;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("com/example/simpledi")
@EnableAspectJAutoProxy
public class SimpleDiApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(SimpleDiApplication.class);
        Gunslinger gunslinger = ctx.getBean(Gunslinger.class);
        System.out.println("Gunslinger is " + gunslinger.getName());
        gunslinger.shoot();
        ctx.registerShutdownHook();
    }
}

