package com.csg.wordindexer;


import java.util.stream.Stream;

public class LongerThanFiveCharsRule implements Rule {
    @Override
    public void apply(Stream<String> wordStream) {
        System.out.println("Words longer than 5 characters:");
        wordStream
                .filter(w -> w.length() > 5)
                .forEach(System.out::println);
    }
}

