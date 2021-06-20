package com.example.task3;

public class PrintFormat {

    private String header;
    private String footer;
    private static final String NEW_LINE = "\n";

    public void setHeader(String header){
        this.header = header;
    }

    public void setFooter(String footer){
        this.footer = footer;
    }

    public String formatString(String str){
        String newString = header + NEW_LINE + NEW_LINE + str + NEW_LINE + footer;
        return newString;
    }
}
