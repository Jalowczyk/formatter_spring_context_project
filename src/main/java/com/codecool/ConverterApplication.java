package com.codecool;

import com.codecool.converters.SimpleCsvConverter;
import com.codecool.formatters.OutputFormat;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ConverterApplication {

    public static void main(String[] args) {

        OutputFormat outputFormat = null;
        Path path = null;
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        SimpleCsvConverter scc = (SimpleCsvConverter) ctx.getBean("converter");

        if (args.length == 1) {
            path = Paths.get(args[0]);
            scc.convert(path);
        } else if (args.length == 2) {
            path = Paths.get(args[1]);
            outputFormat = OutputFormat.getNeededOutputFormat(args[0]);
            scc.convert(path, outputFormat);
        } else {
            System.out.println("No input file defined");
        }
    }
}