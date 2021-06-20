package com.example.task3;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrintService implements ApplicationContextAware {

    private PrintClient mClient;
    private PrintFormat mFormatter;
    private ApplicationContext context;

    private void initialise(){
        mClient = context.getBean(PrintClient.class);
        mFormatter = context.getBean(PrintFormat.class);
    }

    public void print(String outString){
        outString = mFormatter.formatString(outString);
        mClient.printOut(outString);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
        initialise();
    }
}
