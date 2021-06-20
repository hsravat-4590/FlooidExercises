package com.example.task3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Task3Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

        HelloWorld hiWorld = (HelloWorld) context.getBean("helloWorldBean");
        hiWorld.printHello();

        PrintService service = context.getBean(PrintService.class);
        service.print("This is a test of the print service");
    }

}
