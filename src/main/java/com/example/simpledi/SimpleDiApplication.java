package com.example.simpledi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//@SpringBootApplication
@ComponentScan("com/example/simpledi")
@EnableAspectJAutoProxy
public class SimpleDiApplication {

    public static void main(String[] args) {
       // SpringApplication.run(SimpleDiApplication.class, args);

        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(SimpleDiApplication.class);
        Gunslinger gunslinger = ctx.getBean(Gunslinger.class);
        gunslinger.shoot();
       // ctx.registerShutdownHook();
    }
}

