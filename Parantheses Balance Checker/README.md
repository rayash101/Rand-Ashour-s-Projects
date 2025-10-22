# Balanced Parentheses Checker (C++)

A **C++ console application** that checks whether parentheses, brackets, and braces in an expression are properly balanced.  
The program demonstrates **stack implementation** using both **arrays (`std::vector`)** and **linked lists**, allowing a comparison between the two data structures.

## Overview

The goal of this project is to verify if an input expression (containing `()`, `{}`, and `[]`) is balanced, meaning every opening symbol has a corresponding closing symbol in the correct order.

It features **two separate stack implementations**: arrayStack, which uses std::vector to store elements, and linkStack, which uses a custom singly linked list for dynamic memory management.

Each implementation runs the same logic and outputs whether the expression is balanced or not.

## Features

- **Two Stack Implementations**
  - `arrayStack`: vector-based stack
  - `linkStack`: linked-list-based stack
- **Balanced Expression Checker**
  - Handles parentheses `()`, square brackets `[]`, and curly braces `{}`.
- **Error Handling**
  - Detects unmatched or improperly nested symbols.
- **Console Output**
  - Displays clear messages indicating whether expressions are balanced or not.
- **Demonstrates Core Data Structure Concepts**
  - Stack push/pop/top
  - Empty stack checks
  - String iteration and symbol comparison

## Algorithm

The algorithm uses the standard **stack-based parentheses matching** approach:

1. Traverse the input string character by character.
2. When an opening symbol (`(`, `{`, `[`) is found → **push** it onto the stack.
3. When a closing symbol (`)`, `}`, `]`) is found:
   - If the stack is empty → **unbalanced**.
   - If the top of the stack is the matching opening symbol → **pop** it.
   - Otherwise → **unbalanced**.
4. After traversal, if the stack is empty → **balanced**; else → **unbalanced**.

**Time Complexity:** O(n)  
**Space Complexity:** O(n)
