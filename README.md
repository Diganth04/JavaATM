Java ATM Machine Console Application

A simple console-based Java project that simulates a basic ATM (Automated Teller Machine). This program supports login authentication and basic banking operations like balance check, deposits, withdrawals, and mini statements — all via terminal interaction.

---

## Description

This project demonstrates object-oriented programming in Java using core concepts like:
- Encapsulation via classes (`ATM.java`)
- Interfaces and abstraction (`AtmOperationsInterface`)
- Implementation logic and transaction history with preserved order (`AtmOperationsImp`)
- Real-time user interaction using the Scanner class

Ideal for beginners who want to learn **Java OOP** with real-life logic simulation.

---

## Features

- Login system using account number & PIN
- Deposit and withdraw funds (withdrawals must be in ₹500 multiples)
- Mini statement (preserves order of transactions)
- Error handling and retry logic for invalid inputs
- Clean, user-friendly console output

---

## Project Structure
AtmMachineProject/
├── ATM.java // ATM model: holds balance, deposit, withdraw amounts
├── AtmOperationsInterface.java // Declares ATM operation methods
├── AtmOperationsImp.java // Implements ATM operation logic
├── MainClass.java // Main application for user interaction
└── README.md // Project documentation
---

## How to Run

### Compile & Run from Terminal (Without IDE)

1. Open your terminal or command prompt **inside the project folder** (where all `.java` files are saved).

2. Compile all Java files:
```bash
javac ATM.java AtmOperationsInterface.java AtmOperationsImp.java MainClass.java

java MainClass


