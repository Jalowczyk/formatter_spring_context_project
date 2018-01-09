package com.codecool;

public class ConverterApplication {

    public static void main(String[] args) {
        String message = "No input file defined";
        Format format = null;
        String path = null;

        if (args.length == 1) {
            path = args[0];

        }
        else if (args.length == 2) {
            path = args[1];
            for (Format f : Format.values()) {
                if (f.getFormatValue().equalsIgnoreCase(args[0])) {
                    format = f;
                }
            }
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