package com.example.task3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Task3Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Task3Application.class,args);

        HelloWorld hiWorld = (HelloWorld) context.getBean("helloWorld");
        hiWorld.printHello();

        PrintService service = context.getBean(PrintService.class);
        service.print("This is a test of the print service");
    }

}
