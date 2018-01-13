package com.codecool;


import java.nio.file.Path;

public class SimpleCsvConverter {

    private FileReader fr;

    public SimpleCsvConverter(FileReader fr) {
        this.fr = fr;
    }

    public void convert(Path file, ConverterApplication.Format outputFormat) {
        System.out.println("I convert CSV to " + outputFormat.getFormatValue() + " format...");
    }

    public void convert(Path file) {
        System.out.println("I convert CSV to table format..");
    }
}
