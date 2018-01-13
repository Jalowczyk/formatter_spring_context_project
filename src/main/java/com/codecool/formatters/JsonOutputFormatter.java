package com.codecool.formatters;

import com.codecool.formatters.OutputFormatter;

import java.util.List;
import java.util.Map;

public class JsonOutputFormatter implements OutputFormatter {

    public void printToConsole(List<Map<String,String>> data) {
        System.out.println("Converting to Json...");
    }
}
