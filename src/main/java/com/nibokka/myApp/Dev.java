package com.nibokka.myApp;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Dev {
    
    // @Autowired          // Field injection
    Computer computer;

    public Dev(Computer computer) { // Constructor injection, no need to use @Autowired, but you'll need to declare variable "Computer computer;" like in line 11
        this.computer = computer;
    }

    public void build() {
        computer.compile();
        System.out.println("Dev building stuff");        
    }

}
