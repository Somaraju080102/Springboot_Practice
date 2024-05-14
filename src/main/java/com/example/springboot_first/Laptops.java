package com.example.springboot_first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptops {
    @Autowired
    Code code;
    public void exec(){
        code.exec();
    }
}
