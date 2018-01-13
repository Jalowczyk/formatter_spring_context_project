package com.codecool;

public enum OutputFormat {
    JSON("json"), XML("xml"), TABLE("table");

    private final String formatValue;

    OutputFormat(String formatValue) {
        this.formatValue = formatValue;
    }

    public String getFormatValue() {
        return formatValue;
    }
}