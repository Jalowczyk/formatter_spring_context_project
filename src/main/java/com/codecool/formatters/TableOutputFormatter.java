package com.codecool.formatters;

import java.util.List;
import java.util.Map;

public class TableOutputFormatter implements OutputFormatter{

    public void printToConsole(List<Map<String,String>> data) {
        System.out.println("Converting...");
    }
}
