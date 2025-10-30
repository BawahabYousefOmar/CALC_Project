# CLAC: The Java Swing Calculator

CLAC is a multi-functional calculator application built with Java Swing. It provides a clean, user-friendly interface that switches between a Standard calculator for everyday math and a feature-rich Programmer calculator for number base conversions and operations.


## ?? Key Features

### 1. Standard Mode
* Full support for basic arithmetic operations: **addition (+)**, **subtraction (-)**, **multiplication (*)**, and **division (/)**.
* Handles mathematical order of operations using **parentheses ( )**.
* Includes functions for **square root (?)** and **percentage (%)**.
* **CE** and **del** buttons for easy input correction.

### 2. Programmer Mode
This is a powerful mode designed for developers and computer science students.
* **Live Number Base Conversion:** Instantly converts your input and results between:
    * **HEX** (Hexadecimal)
    * **DEC** (Decimal)
    * **OCT** (Octal)
    * **BIN** (Binary)
* **Hexadecimal Input:** Includes **A, B, C, D, E, F** buttons for easy hex input.
* **Bitwise Operators:** Includes buttons for bitwise shift operators (`<<` and `>>`).

### 3. Settings & UI
* **Night Mode:** A simple checkbox toggles a sleek, dark theme for the entire application.
* **Precise Mode:** Allows you to toggle between showing full floating-point precision or a clean, rounded (2-decimal-place) result.

## ??? Core Logic
* **Expression Parsing:** The calculation engine uses a custom-built **Stack** (`Stack.java`) to parse and evaluate infix mathematical expressions. It correctly handles operator precedence and parentheses.
* **Number Conversion:** All number base conversions (including for floating-point numbers) are handled by a dedicated `Decimal.java` utility class.

## ?? Technologies Used
* **Java**
* **Java Swing** (for the graphical user interface)

## ?? How to Run

### Option 1: Run the JAR file
The easiest way to run the calculator is using the provided `.jar` file.
1.  Ensure you have Java installed on your system.
2.  Download the `Calculator-1.0-SNAPSHOT.jar` file.
3.  Double-click the `.jar` file to run it.

### Option 2: Run from Source Code
1.  Clone or download the project repository.
2.  Open the project in a Java IDE (like NetBeans, IntelliJ, or Eclipse).
3.  Locate and run the `Calculator.java` file, which contains the `main` method.