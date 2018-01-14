package com.codecool.formatters;

import org.springframework.stereotype.Component;

@Component
public class OutputFormatterFactory {

    public OutputFormatter createByFormat(OutputFormat of) {

        OutputFormatter outputFormatter = null;

        try {
            outputFormatter = of.getOutputFormatterClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return outputFormatter;
    }
}
