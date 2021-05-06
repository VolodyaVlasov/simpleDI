package com.example.simpledi;

import com.example.simpledi.aop.Benchmark;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Qualifier
@Service
public class Pistol implements Gun {

    @Override
    public String shoot() {
        return "pew";
    }
}
