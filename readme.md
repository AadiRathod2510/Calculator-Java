# OOP Calculator – Java

A console-based Calculator application developed in Java using
Object-Oriented Programming (OOP) principles.

This project demonstrates clean architecture, modular design,
and robust exception handling while performing common mathematical operations.

---

## Project Overview

Package: Project_Calculator  
Type: Console-Based Java Application

Purpose:
- Perform Binary Calculations
- Perform Unary Calculations
- Practice OOP Design
- Handle Runtime Exceptions

---

## Supported Operations

### Binary Operations
- Addition (+)
- Subtraction (-)
- Multiplication (*)
- Division (/)
- Modulus (%)

### Unary Operations
- Square (S)
- Cube (C)
- Square Root (R)
- Cube Root (Q)

---

## Features

- Menu-driven console interface
- Supports unary & binary operations
- Input validation
- Custom exception handling:
    - DivisionException (division by zero)
    - ModulusException (modulus by zero)
    - NegativeNumberException (invalid square root)
    - InvalidOperation (invalid operator)
- Handles non-numeric input (InputMismatchException)
- Clean separation of concerns

---

## Design Structure

### Controller
- **Calculator** → Entry point & main controller

### Input Handling
- **Input** → Accepts numeric values
- **SelectOperator** → Handles operator selection

### Exception Classes
- DivisionException
- ModulusException
- NegativeNumberException
- InvalidOperation

Each exception:
- Encapsulates error logic
- Provides meaningful messages

---

## Validation Rules

- Only numeric input accepted
- Division/Modulus by zero prevented
- Square root of negative numbers restricted
- Invalid operators handled safely

---

## Concepts Used

- Abstraction
- Encapsulation
- Composition
- Exception Handling
- Modular Design

---

## Learning Objectives

- Practice OOP fundamentals
- Implement clean controller logic
- Apply custom exceptions correctly
- Improve input validation
- Build user-friendly console applications

---

## Author

Name: Aadi Rathod