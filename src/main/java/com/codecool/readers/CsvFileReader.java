package com.codecool.readers;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CsvFileReader implements FileReader {

    public List<Map<String, String>> readData(Path path) {
        System.out.println("Reading data...");
        return new ArrayList<>();
    }
}
