package com.smartspend.io;

import com.smartspend.model.Transaction;

import java.io.*;
import java.util.*;

public class CsvReader {

    public static List<Transaction> readCsv(String path) {
        List<Transaction> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            boolean headerSkipped = false;
            while ((line = br.readLine()) != null) {
                if (!headerSkipped) { headerSkipped = true; continue; }
                String[] parts = line.split(",");
                if (parts.length < 3) continue;
                String description = parts[1].trim();
                double amount;
                try {
                    amount = Double.parseDouble(parts[2].trim());
                } catch (NumberFormatException e) {
                    continue;
                }
                list.add(new Transaction(description, amount));
            }
        } catch (IOException e) {
            System.out.println("❌ Error reading file: " + e.getMessage());
        }
        return list;
    }
}
