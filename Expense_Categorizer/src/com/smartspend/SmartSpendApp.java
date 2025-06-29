package com.smartspend;

import com.smartspend.io.CsvReader;
import com.smartspend.model.Transaction;
import com.smartspend.utils.CategoryClassifier;

import java.util.*;

public class SmartSpendApp {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java SmartSpendApp <bank_statement.csv>");
            return;
        }

        String csvPath = args[0];
        List<Transaction> transactions = CsvReader.readCsv(csvPath);

        Map<String, Double> totals = new LinkedHashMap<>();
        for (String category : CategoryClassifier.getAllCategories()) {
            totals.put(category, 0.0);
        }

        for (Transaction t : transactions) {
            String category = CategoryClassifier.classify(t.getDescription());
            totals.put(category, totals.getOrDefault(category, 0.0) + t.getAmount());
        }

        System.out.println("\n=== SmartSpend Summary ===");
        for (Map.Entry<String, Double> entry : totals.entrySet()) {
            if (entry.getValue() > 0) {
                System.out.printf("%-15s : ₹%.2f%n", entry.getKey(), entry.getValue());
            }
        }
    }
}
