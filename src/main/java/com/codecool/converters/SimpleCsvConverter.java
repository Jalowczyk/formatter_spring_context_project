package com.codecool.converters;

import com.codecool.formatters.OutputFormat;
import com.codecool.formatters.OutputFormatter;
import com.codecool.formatters.OutputFormatterFactory;
import com.codecool.readers.CsvFileReader;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SimpleCsvConverter {

    private CsvFileReader fileReader;
    private OutputFormatterFactory outputFormatterFactory;
    private OutputFormat format;

    public SimpleCsvConverter(CsvFileReader fileReader, OutputFormatterFactory outputFormatterFactory) {
        this.fileReader = fileReader;
        this.outputFormatterFactory = outputFormatterFactory;
        this.format = OutputFormat.TABLE;
    }

    public void setFormat(OutputFormat format) {
        this.format = format;
    }

    public void convert(Path file, OutputFormat outputFormat) {
        setFormat(outputFormat);
        convert(file);
    }

    public void convert(Path file) {
        OutputFormatter outputFormatter = this.outputFormatterFactory.createByFormat(this.format);
        outputFormatter.printToConsole(fileReader.readData(file));

    }
}

