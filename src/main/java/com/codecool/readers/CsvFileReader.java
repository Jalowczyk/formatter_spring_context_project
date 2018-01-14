package com.codecool.readers;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class CsvFileReader implements FileReader {

    public List<Map<String, String>> readData(Path path) {
        List<Map<String, String>> dataList = new ArrayList<>();
        List<String> labels;

        try {
            Scanner reader = new Scanner(path);
            if (reader.hasNextLine()) {
                labels = Arrays.asList(reader.nextLine().split("[,;]"));
            } else {
                throw new IOException("Empty CSV file!");
            }

            while (reader.hasNextLine()) {
                Map<String, String> map = new LinkedHashMap<>();
                String[] line = reader.nextLine().split("[,;]");

                for (int i = 0; i < line.length; i++) {
                    map.put(labels.get(i), line[i]);
                }

                dataList.add(map);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataList;
    }
}