package com.example.simpledi;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class Automatic implements Gun{
    @Override
    public String shoot() {
        return "bambambam";
    }
}
