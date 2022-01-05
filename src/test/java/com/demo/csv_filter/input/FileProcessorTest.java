package com.demo.csv_filter.input;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class FileProcessorTest {

    private final FileProcessor fileProcessor = new FileProcessor();
    String inputFile = "src/test/java/resources/csv_test.csv";

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    void csvProcessorTest() {
        String[] headerFilterControl = {"first_name", "last_name", "dob"};
        assertEquals(Arrays.toString(headerFilterControl), Arrays.toString(fileProcessor.csvProcessor(inputFile)));
    }

//    @Test
//    void produceListTest() {
//        ArrayList<String[]> headerRow = new ArrayList<>();
//        String[] headers = {"first_name", "last_name", "dob"};
//        String[] one = {"bob", "barker", "19231212"};
//        String[] two = {"michael", "jordan", "19630217"};
//        headerRow.add(0, headers);
//        headerRow.add(1, one);
//        headerRow.add(2, two);
//
//        fileProcessor.csvProcessor(inputFile);
//        fileProcessor.produceList("first_name");
//
//        assertEquals("bob" + "\n" + "michael", systemOutRule.getLog());
//    }
}
