package com.example.simpledi;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("pistol")
public class Pistol implements Gun {

    @Override
    public String shoot() {
        return "pew";
    }
}
