package com.example.task2.main;

import com.example.task2.library.CamelCase;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CamelCase camelCase = new CamelCase();
        System.out.println(camelCase.toCamelCase("test to camel CASE"));
    }
}
