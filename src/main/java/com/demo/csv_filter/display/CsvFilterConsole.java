package com.demo.csv_filter.display;

import com.demo.csv_filter.input.FileProcessor;
import com.demo.csv_filter.input.InputScanner;

import java.util.Arrays;

public class CsvFilterConsole extends FileProcessor {

//    C:\csv_test\csv_test.csv
    InputScanner inputScanner = new InputScanner();
    String userInput;

    public void initializer() {
        System.out.println("----CSV File Filter----" + "\n" + "Please provide the file path for your CSV file...");
        display();
    }

    private void display() {
        userInput = inputScanner.userInputScanner();
        System.out.println("\n File Headers: " + Arrays.toString(displayFileInput(userInput))  + "\n" + "Please provide the header you would like to search...");
        userInput = inputScanner.userInputScanner();
        System.out.println("\n" + userInput + " information is below: ");
        displayFileOutput(userInput);
        System.out.println("\n" + "Would you like to search for a name or date match?");
        userInput = inputScanner.userInputScanner();
        if (userInput.equalsIgnoreCase("Yes")) {
            System.out.println("\n" + "Please Input a name or date of birth");
            userInput = inputScanner.userInputScanner();
            nameOrDateSearch(userInput);
        }
        System.out.println("\n" + "Would you like to scan another file? Yes or No");
        userInput = inputScanner.userInputScanner();
        if (userInput.equalsIgnoreCase("Yes")) {
            persistentDataClear();
            System.out.println("Please provide the file you would like to filter...");
            display();
        } else if (userInput.equalsIgnoreCase("No")) {
            System.exit(0);
        } else {
            System.out.println("Command Not Recognized - Closing Application");
            System.exit(404);
        }


    }

    private String[] displayFileInput(String inputFile){
        return csvProcessor(inputFile);
    }

    private void displayFileOutput(String input) {
        produceList(input);
    }

    private void nameOrDateSearch(String input) {
        if (!inputScanner.isNumeric(input)) {
            produceNameList(String.valueOf(input));
        } else {
            produceDateList(input);
        }
    }
}
