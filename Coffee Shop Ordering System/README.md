# Java-based Coffee Shop Ordering System

A Java-based coffee shop ordering system that allows customers to view menu items, select drinks, and place orders directly through a console interface.  
The project demonstrates strong use of **object-oriented programming (OOP)** principles — including **inheritance**, **polymorphism**, **encapsulation**, and **abstraction** — while incorporating **file handling** for persistent order storage.

## Overview

This system simulates a simple coffee shop application where users can:
- Browse the available coffee menu.
- Place and customize orders.
- Store and retrieve past orders from a file.

Each coffee type is implemented as a subclass of a base `Coffee` class, and customers and orders are managed through separate dedicated classes for modularity and scalability.

## How to Run
- This project was developed and tested using **GitHub Codespaces**, which provides a cloud-based development environment. Codespaces allowed the Java code to be compiled and executed directly in the browser without requiring a local Java installation.
- 
## Features

- **Homepage & Main Menu:** Provides an interactive console interface for user navigation.
- **Coffee Inheritance Hierarchy:**  
  - `Coffee` (abstract base class). 
  - `Espresso`, `Cappuccino`, `FilteredCoffee` (specialized subclasses).
- **Customer Class:** Handles customer names and order associations.
- **Order Class:** Stores details such as drink type, quantity, and total cost.
- **OrdersFile Class:** Reads and writes order details to a text file for persistent storage.
- **Polymorphism in Action:** Each subclass defines its own price and description behavior.

## Concepts Demonstrated

| Concept | Description |
|----------|--------------|
| **Inheritance** | All coffee types inherit from a common superclass (`Coffee`). |
| **Polymorphism** | Each subclass overrides behavior for pricing and descriptions. |
| **Encapsulation** | Customer and order details are hidden within dedicated classes. |
| **File I/O** | Orders are saved and retrieved using Java file handling. |
| **Abstraction** | The `Coffee` class defines the shared structure for all drinks. |

