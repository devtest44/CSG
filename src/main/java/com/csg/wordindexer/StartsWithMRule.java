package com.csg.wordindexer;

import java.util.stream.Stream;

public class StartsWithMRule implements Rule {
    @Override
    public void apply(Stream<String> wordStream) {
        long count = wordStream
                .filter(w -> !w.isBlank())
                .filter(w -> w.toLowerCase().startsWith("m"))
                .count();
        System.out.println("Number of words starting with 'M' or 'm': " + count);
    }
}
