package com.csg.wordindexer;


import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class WordProcessor {
    private final List<Rule> rules;

    public WordProcessor(List<Rule> rules) {
        this.rules = rules;
    }

    public void processFile(String filePath) throws IOException {
        for (Rule rule : rules) {
            // Each rule gets its own stream, since streams can only be consumed once
            try (Stream<String> wordStream = Files.lines(Paths.get(filePath))
                    .flatMap(line -> Arrays.stream(line.split("\\W+")))) {
                rule.apply(wordStream);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        
        if (args.length == 0) {
            System.err.println("Please provide the input file name as an argument.");
            System.exit(1);
        }

        String fileName = args[0];
        List<Rule> rules = List.of(new StartsWithMRule(), new LongerThanFiveCharsRule());
        new WordProcessor(rules).processFile(fileName);
    	
    	
    	
        //List<Rule> rules = List.of(new StartsWithMRule(), new LongerThanFiveCharsRule());
        //new WordProcessor(rules).processFile("input.txt");
    }
}
