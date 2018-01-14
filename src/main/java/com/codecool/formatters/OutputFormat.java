package com.codecool.formatters;

public enum OutputFormat {
    JSON("json", JsonOutputFormatter.class), XML("xml", XmlOutputFormatter.class), TABLE("table", TableOutputFormatter.class);

    private final String formatValue;
    private final Class<? extends OutputFormatter> outputFormatterClass;

    OutputFormat(String formatValue, Class<? extends OutputFormatter> outputFormatterClass) {
        this.formatValue = formatValue;
        this.outputFormatterClass = outputFormatterClass;
    }

    public Class<? extends OutputFormatter> getOutputFormatterClass() {
        return outputFormatterClass;
    }

    public String getFormatValue() {
        return formatValue;
    }

    public static OutputFormat getNeededOutputFormat(String consoleInput) {
        OutputFormat outputFormat = null;

        for (OutputFormat f : OutputFormat.values()) {
            if (f.getFormatValue().equalsIgnoreCase(consoleInput)) {
                outputFormat = f;
            }
        }

        return outputFormat;
    }
}