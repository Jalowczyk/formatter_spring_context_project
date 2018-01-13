package com.codecool.readers;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

public abstract class AbstractFileReader implements FileReader {

    abstract public List<Map<String, String>> readData(Path file) throws FileNotFoundException;

    boolean checkIfFileExist(Path file) {
        return Files.exists(file);

    }
}