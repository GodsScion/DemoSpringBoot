package com.nibokka.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Dev {
    
    @Autowired          // Field injection
    Computer computer;

    public void build() {
        computer.compile();
        System.out.println("Dev building stuff");        
    }

}
