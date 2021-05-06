package com.example.simpledi;

import org.springframework.stereotype.Service;


//@Qualifier
@Service
public class Pistol implements Gun {

    @Override

    public String shoot() {
        return "pew";
    }
}
