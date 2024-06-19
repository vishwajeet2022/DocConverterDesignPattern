package org.example;

import javax.print.Doc;

public class HtmlConverterStrategy implements DocumentConverterStrategy {
    @Override
    public void convert(String input, String output) {
        System.out.println("Coverted to Html");
    }
}
