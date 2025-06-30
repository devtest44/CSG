

- Java 17
- Maven
- JUnit 5
- Eclipse IDE

java -cp target/CSGWords-0.0.1-SNAPSHOT.jar com.csg.wordindexer.WordProcessor input.txt




A lightweight Java-based word indexing tool that counts specific word types and extracts long words from a file. Built using Maven.



Counts the number of words that start with **M** or **m**

Lists all words longer than 5 characters

Modular design following Java best practices

Unit-tested with JUnit






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


v1 Original (String array) simple
v3 Drools (overly complex, not readily integratable)
v3 Stream-based (final) memory efficient, stream safe

=======================================================



Handling Edge Cases:
This implementation uses a basic regular expression to split words using non-alphabetic characters. For example, input like:
"2Monkey *moonlight m-o-o-n M**eet mountain ^/m arket example test \develop%ment"
is split on non-word characters (like *, %, slashes, dashes, etc.).

However, in real-world scenarios, the business rules should clarify:

What counts as a word?

Should hyphenated or prefixed strings like "m-o-o-n" or "2Monkey" be included?

Should symbols or numbers attached to words be stripped or preserved?

Are case sensitivity and accents relevant?

These edge cases should be discussed with stakeholders and written into formal rule definitions to avoid ambiguity.





