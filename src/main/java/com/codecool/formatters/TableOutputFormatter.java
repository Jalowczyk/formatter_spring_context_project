package com.codecool.formatters;

import java.util.List;
import java.util.Map;

public class TableOutputFormatter implements OutputFormatter{

    public void printToConsole(List<Map<String, String>> data) {
        for (String key : data.get(0).keySet()) {
            System.out.print(String.format("%1$20s | ", key));
        }
        System.out.println();

        for (Map<String, String> map : data) {
            for (String value : map.values()) {
                System.out.print(String.format("%1$20s | ", value));
            }
            System.out.println();
        }
    }
}
