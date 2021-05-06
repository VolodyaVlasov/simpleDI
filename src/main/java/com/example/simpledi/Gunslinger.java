package com.example.simpledi;


import com.example.simpledi.annotation.InjectRandomInt;
import com.example.simpledi.aop.Benchmark;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component

public class Gunslinger {
    @InjectRandomInt(min = 1, max  = 6)
    private int repeat;
    private final Gun gun;

    public Gunslinger(Gun gun) {
        System.out.println("Constructor");
        this.gun = gun;
    }
    @Benchmark
    public void shoot() {
        for (int i = 0; i < repeat; i ++) {
            System.out.println(gun.shoot());
        }
    }

    @PostConstruct
    public void post(){
        System.out.println("postConstructor");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("PreDestroy");
    }
}
