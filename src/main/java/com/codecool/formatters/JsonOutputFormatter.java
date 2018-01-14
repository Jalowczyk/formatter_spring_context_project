package com.codecool.formatters;

import java.util.List;
import java.util.Map;

public class JsonOutputFormatter implements OutputFormatter {

    public void printToConsole(List<Map<String,String>> data) {
        for (Map<String,String> map : data) {
            System.out.print("{");
            for (String key : map.keySet()) {
                System.out.print(String.format("\n\t%1s : %2s,", key, map.get(key)));
            }
            System.out.print("\n}");
        }
    }
}
