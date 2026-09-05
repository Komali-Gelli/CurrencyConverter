# 💱 Currency Converter – Java

A simple **console-based Currency Converter** developed using Java. The application allows users to convert amounts between **INR, USD, EUR, and GBP** using predefined exchange rates.

This project is designed to practice fundamental Java programming concepts such as conditional statements, user input, string handling, arithmetic operations, and formatted output.

---

## 📌 Features

* 💱 Convert between multiple currencies
* 🇮🇳 Supports **INR**
* 🇺🇸 Supports **USD**
* 🇪🇺 Supports **EUR**
* 🇬🇧 Supports **GBP**
* 🔄 Supports conversion in both directions for available currency pairs
* 🔤 Automatically converts currency input to uppercase
* ⚠️ Displays an error message when a conversion is unavailable
* 💰 Displays the converted amount with two decimal places

---

## 🛠️ Technologies Used

* **Java**
* `Scanner` – for reading user input
* `if-else` statements – for selecting conversion logic
* `String.toUpperCase()` – for handling currency codes
* Arithmetic operators – for currency calculations
* `printf()` – for formatted output

---

## 💱 Supported Currencies

| Code | Currency           |
| ---- | ------------------ |
| INR  | Indian Rupee 🇮🇳  |
| USD  | US Dollar 🇺🇸     |
| EUR  | Euro 🇪🇺          |
| GBP  | British Pound 🇬🇧 |

---

## 📊 Exchange Rates Used

The program uses the following **fixed exchange rates**:

| Conversion | Rate     |
| ---------- | -------- |
| 1 USD      | 83 INR   |
| 1 EUR      | 90 INR   |
| 1 GBP      | 105 INR  |
| 1 USD      | 0.92 EUR |
| 1 USD      | 0.79 GBP |

> ⚠️ **Note:** These are fixed rates defined in the program for educational purposes. They are not live market exchange rates.

---

## ⚙️ How It Works

1. The program displays the available currencies.
2. The user enters the **base currency**.
3. The user enters the **target currency**.
4. The user enters the amount to convert.
5. The program checks the selected currency pair using `if-else` statements.
6. The corresponding exchange rate is applied.
7. The converted amount is displayed.

For example:

```text
100 USD → 8300 INR
```

---

## ▶️ How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/CurrencyConverter.git
```

### 2. Navigate to the Project Folder

```bash
cd CurrencyConverter
```

### 3. Compile the Java Program

```bash
javac CurrencyConverter.java
```

### 4. Run the Program

```bash
java CurrencyConverter
```

---

## 💻 Sample Input

```text
=================================
        CURRENCY CONVERTER
=================================
Available currencies:
1. INR
2. USD
3. EUR
4. GBP

Enter base currency: USD
Enter target currency: INR
Enter amount: 100
```

## 📤 Sample Output

```text
100.00 USD = 8300.00 INR
```

---

## 🔄 Another Example

```text
Enter base currency: EUR
Enter target currency: USD
Enter amount: 100

100.00 EUR = 108.70 USD
```

---

## ❌ Invalid Conversion Example

```text
Enter base currency: INR
Enter target currency: JPY
Enter amount: 1000

Currency conversion not available.
```

---

## 🧠 Java Concepts Practiced

This project demonstrates:

* Variables and data types
* `Scanner` class
* String manipulation
* `toUpperCase()`
* `if-else if-else`
* String comparison using `equals()`
* Arithmetic operations
* `double` data type
* Formatted output using `printf()`
* Basic input handling

---

## 🚀 Future Improvements

The project can be enhanced by adding:

* 🌐 Live exchange rates using an API
* 💱 Support for more currencies
* 🖥️ Graphical User Interface (GUI)
* 📅 Exchange-rate history
* 🔄 Menu-based repeated conversions
* ✅ Input validation
* 📊 Currency rate comparison
* 🌍 Automatic currency selection based on country

---
