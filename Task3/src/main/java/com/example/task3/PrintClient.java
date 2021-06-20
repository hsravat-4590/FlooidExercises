package com.example.task3;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.OutputStream;

@Component("printClient")
public class PrintClient {

    /**
     * Write out to console
     * @param out
     */
    public void printOut(String out){
        System.out.println(out);
    }

    /**
     * Write out to a provided output stream
     * @param out
     * @param stream
     */
    public void printOut(String out, OutputStream stream){
        byte[] bytes = out.getBytes();
        try {
            stream.write(bytes,0,bytes.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
