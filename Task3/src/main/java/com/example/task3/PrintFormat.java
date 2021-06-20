package com.example.task3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class PrintFormat {

    private String header;
    private String footer;
    private static final String NEW_LINE = "\n";

    @Value("TestHeader")
    public void setHeader(String header){
        this.header = header;
    }
    @Value("TestFooter- Override this by invoking setFooter(String footer) for footer and setHeader(String header) for header")
    public void setFooter(String footer){
        this.footer = footer;
    }

    public String formatString(String str){
        String newString = header + NEW_LINE + NEW_LINE + str + NEW_LINE + footer;
        return newString;
    }
}
