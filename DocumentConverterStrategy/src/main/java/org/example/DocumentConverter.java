package org.example;

public class DocumentConverter {
    DocumentConverterStrategy documentConverterStrategy;
    DocumentConverter(DocumentConverterStrategy documentConverterStrategy){
        this.documentConverterStrategy=documentConverterStrategy;
        }
    public void convertDocument(String input, String output){
        documentConverterStrategy.convert(input,output);
    }
}
