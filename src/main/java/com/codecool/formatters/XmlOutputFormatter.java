package com.codecool.formatters;

import java.util.List;
import java.util.Map;

public class XmlOutputFormatter implements OutputFormatter {

    public void printToConsole(List<Map<String, String>> data) {
        for (Map<String,String> map : data) {
            for (String key : map.keySet()) {
                System.out.println(String.format("<%1$s>%2$s<%1$s>", key, map.get(key)));
            }
        }
    }
}