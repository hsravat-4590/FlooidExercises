package com.example.task3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Spring bean
 *
 */
@Component("helloWorld")
public class HelloWorld {
    private String name;

    @Value("Hanzalah")
    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Spring 3 : Hello ! " + name);
    }
}