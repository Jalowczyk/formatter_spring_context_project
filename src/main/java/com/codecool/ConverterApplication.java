package com.codecool;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ConverterApplication {

    public static void main(String[] args) {
        String message = "No input file defined";
        Format outputFormat = null;
        Path path = null;
        FileReader fr = new FileReader();
        SimpleCsvConverter scc = new SimpleCsvConverter(fr);

        if (args.length == 1) {
            path = Paths.get(args[0]);
            scc.convert(path);

        }
        else if (args.length == 2) {
            path = Paths.get(args[1]);
            for (Format f : Format.values()) {
                if (f.getFormatValue().equalsIgnoreCase(args[0])) {
                    outputFormat = f;
                }
            }
            scc.convert(path, outputFormat);
        } else {
            System.out.println(message);
        }
    }

    public enum Format {
        JSON("json"), XML("xml"), TABLE("table");

        private final String formatValue;

        Format(String formatValue) {
            this.formatValue = formatValue;
        }

        public String getFormatValue() {
            return formatValue;
        }
    }
}