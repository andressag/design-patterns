package com.greselle.structural.decorator.example2;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Client {
    public static void main(String[] args) {
        int c;

        byte[] bytes = "SOMETHING else".getBytes();

        try {
            InputStream in = new LowerCaseInputStream(new ByteArrayInputStream(bytes));
            while ((c = in.read()) >= 0) {
                System.out.println((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
