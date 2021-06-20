package com.example.task3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ContextProvider implements ApplicationContextAware {
    private ApplicationContext context;

    public void setApplicationContext(ApplicationContext context){
        this.context = context;
    }
}
