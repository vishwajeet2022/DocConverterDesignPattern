package org.example;

public class PngConverterStrategy implements DocumentConverterStrategy{
    @Override
    public void convert(String input, String output) {
        System.out.println("Converted to Png");
    }
}
