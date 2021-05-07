package com.example.simpledi;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("automatic")
public class Automatic implements Gun{
    @Override
    public String shoot() {
        return "bambambam";
    }
}
