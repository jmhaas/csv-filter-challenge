package com.demo.csv_filter;

import com.demo.csv_filter.display.CsvFilterConsole;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CsvFilterApplication {

	public static void main(String[] args) {
		CsvFilterConsole csvFilterConsole = new CsvFilterConsole();
		csvFilterConsole.initializer();
	}
}
