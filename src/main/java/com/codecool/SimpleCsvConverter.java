package com.codecool;

public class SimpleCsvConverter {

    public void convert(String file, ConverterApplication.Format outputFormat) {
        System.out.println("I convert CSV to " + outputFormat.getFormatValue() + " format...");
    }

    public void convert(String file) {
        System.out.println("I convert CSV to table format..");
    }
}
