# Programming Fundamentals

![Java](https://img.shields.io/badge/Java-17%2B-orange?logo=openjdk&logoColor=white)
![Programs](https://img.shields.io/badge/programs-71-brightgreen)

Collection of exercises and examples from a programming fundamentals course, written in **Java**.
Each file is a standalone program with its own `main` method, so any exercise can be compiled and run on its own.

## Table of contents

- [Topics](#topics)
- [Requirements](#requirements)
- [How to run](#how-to-run)
- [Repository structure](#repository-structure)

## Topics

| Folder | Topic |
|---|---|
| [`algorithm_exercises`](algorithm_exercises) | Sequential algorithms: coins, money, remainder, salary, seconds, telephone operator |
| [`maths`](maths) | Operators, even/odd, positive/negative, exponential |
| [`conditionals`](conditionals) | if / else if / switch: largest of three, leap year, triangle type, quadratic equation, calculator, BMI |
| [`repetitive_structures`](repetitive_structures) | Patterns with nested loops: square, rectangle, triangles |
| [`loops`](loops) | while / do-while / for: factorial, Fibonacci, primes, palindromes, GCD, statistics |
| [`arrays`](arrays) | One-dimensional arrays: statistics, reverse, duplicates, merge, rotate |
| [`matrices`](matrices) | Two-dimensional arrays: sum, transpose, multiplication, spiral, magic square |
| [`strings`](strings) | Text handling: vowels, palindromes, Caesar cipher, anagrams, password validation |
| [`methods_and_recursion`](methods_and_recursion) | Methods and recursive solutions: factorial, Fibonacci, power, Hanoi, binary |
| [`searching_and_sorting`](searching_and_sorting) | Linear/binary search and bubble, selection, insertion, merge, quick sort |
| [`classes_and_objects`](classes_and_objects) | Classes, encapsulation, inheritance, polymorphism, ArrayList |

## Requirements

- JDK 17 or newer (`javac` and `java` available in your `PATH`)

Check your installation:

```bash
java -version
javac -version
```

## How to run

Clone the repository and compile any exercise from its folder:

```bash
git clone https://github.com/df1903/fundamentos_programacion.git
cd fundamentos_programacion/loops
javac Factorial.java
java Factorial
```

Java 11+ can also run a single source file directly, without a separate compile step:

```bash
java Factorial.java
```

## Repository structure

```text
fundamentos_programacion/
├── algorithm_exercises/
├── arrays/
├── classes_and_objects/
├── conditionals/
├── loops/
├── maths/
├── matrices/
├── methods_and_recursion/
├── repetitive_structures/
├── searching_and_sorting/
├── strings/
└── README.md
```
