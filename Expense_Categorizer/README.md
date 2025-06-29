# 💸 Expense Categorizer

> 📊 *“Track it. Categorize it. Understand your spending.”*  
> A clean and smart Java-based CLI tool that automatically classifies your bank statement expenses.

---

## 👨‍🎓 About the Project

As a **final-year B.Tech Data Science student**, I developed this project to showcase my ability to apply **Java programming, file handling, and data categorization** to a real-world financial use case.

**Expense Categorizer** takes in a simple CSV bank statement and provides a categorized summary of where your money goes — helping users get financial clarity with zero setup.

---

## ✨ Features

- ✅ Reads standard CSV bank statements
- 🔍 Automatically categorizes transactions into:
  - `Food`, `Travel`, `Utilities`, `Shopping`, `Rent`, `Entertainment`, and `Others`
- 💻 100% core Java — no external libraries required
- 📉 Prints a clean, aligned summary with totals per category

---

## 🧪 Sample Demo

**Input** – `bank_statement.csv`
```csv
Date,Description,Amount
2025-06-01,Uber Trip,250
2025-06-02,Amazon Purchase,1500
2025-06-03,Restaurant Dinner,800
2025-06-04,Electricity Bill,1200
````

**Output**

```
=== Expense Categorizer Summary ===
Travel          : ₹250.00
Shopping        : ₹1,500.00
Food            : ₹800.00
Utilities       : ₹1,200.00
```

---

## 🛠 Technologies Used

| Tech          | Description                              |
| ------------- | ---------------------------------------- |
| Java 17       | Core logic, file I/O, and categorization |
| IntelliJ IDEA | IDE for development and execution        |
| CSV           | Data source format                       |

---

## 📁 Project Structure

```
ExpenseCategorizer/
├── src/
│   └── com.expensecategorizer/
│       ├── ExpenseCategorizerApp.java      # Main application
│       ├── model/
│       │   └── Transaction.java            # Data class
│       ├── io/
│       │   └── CsvReader.java              # CSV reader utility
│       └── utils/
│           └── CategoryClassifier.java     # Classification logic
├── bank_statement.csv                      # Sample input data
└── README.md                               # This file
```

---

## 🚀 How to Run

### ▶ Using IntelliJ IDEA

1. Clone or open the project in IntelliJ
2. Set `ExpenseCategorizerApp` as your **main class**
3. Go to `Run > Edit Configurations…`
4. Set **Program arguments** to:

   ```
   bank_statement.csv
   ```
5. Click **Run** ✅

### 💻 Run via Command Line

```bash
javac -d out src/com/expensecategorizer/**/*.java
java -cp out com.expensecategorizer.ExpenseCategorizerApp bank_statement.csv
```

---

## 💡 What I Learned

* Java object-oriented programming
* Working with file systems (CSV parsing)
* Data classification and pattern matching
* Building clean CLI tools with organized project structure

---

## 🎯 Future Enhancements

* Export summary to a new CSV or PDF report
* Monthly/weekly filter support
* GUI interface (JavaFX or Swing)
* Integration with a database for expense tracking over time

---

## 👨‍💻 Author

**Vamsikishore Reddy Kanchimireddy**
💼 Aspiring Java Developer 
📧 [vamsireddy1180@gmail.com](mailto:vamsireddy1180@gmail.com)

---

> 📌 *This project is part of my resume portfolio and reflects my backend programming and data parsing skills. Perfect for roles in software, analytics, or fintech.*

---

⭐ *If this project inspires you, feel free to fork or build upon it!*

```
