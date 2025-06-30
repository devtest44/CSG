
A lightweight Java-based word indexing tool that counts specific word types and extracts long words from a file. Built using Maven.



Counts the number of words that start with **M** or **m**

Lists all words longer than 5 characters

Modular design following Java best practices

Unit-tested with JUnit



- Java 17
- Maven
- JUnit 5
- Eclipse IDE


Problem Statement:
Build a simple indexing tool that:

Counts words starting with "M" or "m"

Lists all words longer than 5 characters

Reads from a file (not standard input)

Is easy to extend with future business rules

Our Design Approach:
We chose a modular, stream-based Java solution that is:

Memory-efficient: processes the file line-by-line using streams

Extensible: new rules can be added easily via a Rule interface

Testable: unit tests included using JUnit 5

Simple and maintainable: avoids unnecessary complexity

Why Not Use Drools?
While Drools is a powerful rule engine, it is not suitable for this use case because:

It adds unnecessary complexity and setup overhead

It is overkill for two simple filtering rules

It requires additional dependencies and configuration

It is better suited for large rule-driven systems or non-developer rule management

Engineered simplicity is more appropriate than overengineering for this task.

Design Comparison:

Approach Memory Efficient Easy to Extend Stream-safe








