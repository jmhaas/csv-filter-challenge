package com.demo.csv_filter.input;

import java.util.Scanner;

public class InputScanner {

    Scanner userInputScanner = new Scanner(System.in);

    public String userInputScanner() {
        String userInput = userInputScanner.next();
        if (userInput.isBlank() || userInput.equals(null)) {
            System.out.println("Please provide a proper command");
        }
        return userInput.toLowerCase();
    }

    public boolean isNumeric(String input) {
        if (input == null) {
            return false;
        }
        try {
            int integer = Integer.parseInt(input);
        } catch (NumberFormatException numberFormatException) {
            return false;
        }
        return true;
    }
}
