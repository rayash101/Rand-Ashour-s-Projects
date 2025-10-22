# Sports Store Purchase System (Python)

A **Python-based console application** that simulates a sports store purchase system.  
Users can explore and buy equipment for **Soccer, Camping, Volleyball,** or **Table Tennis**, with each category offering unique customization options and pricing logic.  

This project demonstrates a strong use of **Object-Oriented Programming (OOP)** principles, including **abstraction**, **inheritance**, **encapsulation**, and **class polymorphism** with user interaction, input validation, and conditional pricing.

## Overview

The program allows users to:
- Select a sport or activity section (Outdoor or Indoor).  
- Customize their desired equipment (size, material, quantity, etc.).  
- Automatically calculate the total price — including discounts and bundle offers.  
- Exit or continue shopping interactively from the command line.

## Features

- **Abstract Base Class (`StoreSection`)**
  - Defines the blueprint for all store sections (Outdoor, Indoor).  
  - Manages product collections, lookup, and category logic.  

- **Outdoor Section**
  - **Soccer Gear:** Choose material (leather/synthetic), net size, and apply team-based discounts.  
  - **Camping Gear:** Select tent size, durability, and optional add-ons (stove/sleeping bag).  

- **Indoor Section**
  - **Volleyball Gear:** Choose ball material, size, and net type with a random discount chance.  
  - **Table Tennis Gear:** Configure table material, paddle style, and equipment quantities.

- **Dynamic Pricing**
  - Team-based discounts (Soccer).  
  - Optional bundle selection (Camping).  
  - Random discount promotions (Volleyball).  

- **Input Validation**
  - Ensures users enter valid options for size, material, and quantities.  
  - Re-prompts for invalid entries with descriptive messages. 

## Concepts Demonstrated

| Concept | Description |
|----------|--------------|
| **Abstraction** | `StoreSection` serves as the abstract base for all store types. |
| **Encapsulation** | Product details (name, price, availability) are private and accessed via getters. |
| **Inheritance** | `Outdoor` and `Indoor` inherit from `StoreSection`. |
| **Polymorphism** | Subclasses (e.g., `Outdoor.soccer()`, `Indoor.table_tennis()`) define their own pricing logic. |
| **Composition** | `StoreSection` manages multiple `Product` objects. |
| **User Interaction** | Command-line inputs guide the user through product customization. |

