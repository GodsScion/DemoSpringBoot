package com.nibokka.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Dev {
    
    @Autowired           // Field injection (Apparently not recommended!)
    @Qualifier("laptop")    // Among Laptop and desktop class we choose laptop, notice that name is lowercase when inputted for Class Laptop as "laptop"
    Computer computer;      // You need to declare variables in all injection types (field, constructor, setter)

    // public Dev(Computer computer) { // Constructor injection, no need to use @Autowired  (Good practice to use constructor or setter injection)
    //     this.computer = computer;
    // }

    // @Autowired              // Setter injection
    // public void setComputer(Computer computer) {
    //     this.computer = computer;
    // }

    public void build() {
        computer.compile();
        System.out.println("Dev building stuff");        
    }

}
