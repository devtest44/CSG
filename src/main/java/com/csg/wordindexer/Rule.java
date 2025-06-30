package com.csg.wordindexer;

import java.util.stream.Stream;

public interface Rule {
    void apply(Stream<String> wordStream);
}

