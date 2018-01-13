package com.codecool.readers;

import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CsvFileReader extends AbstractFileReader {

    public List<Map<String, String>> readData(Path path) throws FileNotFoundException {
        if (checkIfFileExist(path)) {
            System.out.println("YAY IT EXISTS");
        } else {
            throw new FileNotFoundException();
        }
        return new ArrayList<>();
    }
}
