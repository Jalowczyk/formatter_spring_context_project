package com.codecool;

import com.codecool.formatters.OutputFormatterFactory;

import java.nio.file.Path;

public class SimpleCsvConverter {

    private FileReader fr;
    private OutputFormatterFactory off;

    public SimpleCsvConverter(FileReader fr, OutputFormatterFactory off) {
        this.fr = fr;
        this.off = off;
    }

    public void convert(Path file, OutputFormat outputFormat) {
        System.out.println("I convert CSV to " + outputFormat.getFormatValue() + " format...");
    }

    public void convert(Path file) {
        System.out.println("I convert CSV to table format..");
    }
}
