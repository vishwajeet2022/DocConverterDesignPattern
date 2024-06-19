package org.example;

public class PdfConverterStrategy implements DocumentConverterStrategy{

    @Override
    public void convert(String input, String output) {
        System.out.println("Converted to Pdf");
    }
}
