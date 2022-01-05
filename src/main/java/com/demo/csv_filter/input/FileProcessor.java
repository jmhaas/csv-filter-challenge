package com.demo.csv_filter.input;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileProcessor {

    private final List<String[]> rawCsv = new ArrayList<>();
    private final ArrayList<String[]> headerRow = new ArrayList<>();

    public String[] csvProcessor(String inputFile) {

        String[] row;

        try {
            FileReader fileReader = new FileReader(inputFile);
            CSVReader csvReader = new CSVReader(fileReader);

            while ((row = csvReader.readNext()) != null) {
                rawCsv.add(row);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return headerFilter();
    }

    public String[] headerFilter() {
        headerRow.add(rawCsv.get(0));
        return headerRow.get(0);
    }

    public void produceList (String input) {
        int i;
        headerRow.clear();
        for (i=1; i <= rawCsv.size() - 1; i++) {
            headerRow.add(rawCsv.get(i));

            switch (input) {
                case "first_name" -> System.out.println(Arrays.stream(headerRow.subList(0, 1).get(0)).iterator().next());
                case "last_name" -> System.out.println((headerRow.get(0)[1]));
                case "dob" -> System.out.println((headerRow.get(0)[2]));
            }
            headerRow.clear();
        }
    }

    public void produceNameList(String input) {
        ArrayList<String> recordList = new ArrayList<>();
        int i;
        headerRow.clear();
        for (i=1; i <= rawCsv.size() - 1; i++) {
            headerRow.add(rawCsv.get(i));
            String firstName = Arrays.stream(headerRow.subList(0, 1).get(0)).iterator().next();
            if (firstName.contains(input) || headerRow.get(0)[1].contains(input)) {
                String record = Arrays.toString(headerRow.get(0));
                recordList.add(record);
            }
            headerRow.clear();
        }
        System.out.println(recordList);
    }

    public void produceDateList(String input) {
        ArrayList<String> recordList = new ArrayList<>();
        int i;
        headerRow.clear();
        for (i=1; i <= rawCsv.size() - 1; i++) {
            headerRow.add(rawCsv.get(i));
            if (headerRow.get(0)[2].contains(input)) {
                String record = Arrays.toString(headerRow.get(0));
                recordList.add(record);
            }
            headerRow.clear();
        }
        System.out.println(recordList);
    }

    public void persistentDataClear() {
        headerRow.clear();
        rawCsv.clear();
    }
}
