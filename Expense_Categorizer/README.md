# SmartSpend – Personal Expense Analyzer

This simple Java CLI tool reads a bank statement CSV (Date,Description,Amount),
categorizes each transaction based on keywords, and prints a spending summary
for each category.

## Build & Run

```bash
cd src
javac SmartSpend.java
java SmartSpend ../bank_statement.csv
```

Feel free to edit `SmartSpend.java` to customize categories or keywords.