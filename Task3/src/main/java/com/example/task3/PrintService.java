package com.example.task3;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrintService {

    private final PrintClient mClient;
    private final PrintFormat mFormatter;
    private ApplicationContext context;

    public PrintService(PrintClient client, PrintFormat formatter) {
        mClient = client;
        mFormatter = formatter;
    }

    public void print(String outString) {
        outString = mFormatter.formatString(outString);
        mClient.printOut(outString);
    }

}
