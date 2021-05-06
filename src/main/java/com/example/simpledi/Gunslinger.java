package com.example.simpledi;


import com.example.simpledi.annotation.InjectRandomInt;
import com.example.simpledi.aop.Benchmark;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Gunslinger {
    @InjectRandomInt(min = 1, max = 6)
    private int repeat;
    @Qualifier(value = "pistol")
    private final Gun leftHand;
    @Qualifier(value = "automatic")
    private final Gun rightHand;


    public Gunslinger(Gun leftHand, Gun rightHand) {
        System.out.println("constructor");
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }

   // @Benchmark
    public void shoot() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("leftHand " + leftHand.shoot());
            System.out.println("rightHand " + rightHand.shoot());
        }
    }

    @PostConstruct
    public void post() {
        System.out.println("postConstructor");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("PreDestroy");
    }
}
