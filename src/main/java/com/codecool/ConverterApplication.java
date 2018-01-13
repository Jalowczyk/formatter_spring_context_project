package com.codecool;

import com.codecool.formatters.OutputFormatterFactory;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ConverterApplication {

    public static void main(String[] args) {
        String message = "No input file defined";
        OutputFormat outputFormat = null;
        Path path = null;
        FileReader fr = new FileReader();
        OutputFormatterFactory off = new OutputFormatterFactory();
        SimpleCsvConverter scc = new SimpleCsvConverter(fr, off);

        if (args.length == 1) {
            path = Paths.get(args[0]);
            scc.convert(path);

        }
        else if (args.length == 2) {
            path = Paths.get(args[1]);
            for (OutputFormat f : OutputFormat.values()) {
                if (f.getFormatValue().equalsIgnoreCase(args[0])) {
                    outputFormat = f;
                }
            }
            scc.convert(path, outputFormat);
        } else {
            System.out.println(message);
        }
    }
}