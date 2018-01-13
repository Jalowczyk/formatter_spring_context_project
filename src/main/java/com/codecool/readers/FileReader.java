package com.codecool.readers;

import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

public interface FileReader {

    List<Map<String, String>> readData(Path file) throws FileNotFoundException;

}
