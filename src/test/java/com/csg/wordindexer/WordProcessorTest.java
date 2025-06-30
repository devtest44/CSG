package com.csg.wordindexer;



import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordProcessorTest {

    @Test
    void testWordProcessing() throws IOException {
        // Setup: create a temp input file
        Path tempFile = Files.createTempFile("test-input", ".txt");
        Files.writeString(tempFile, "Monkey moonlight moon Meet mountain market example test development");

        List<Rule> rules = List.of(new StartsWithMRule(), new LongerThanFiveCharsRule());
        WordProcessor processor = new WordProcessor(rules);
        processor.processFile(tempFile.toString());

        // No assertion yet, just testing it runs — you can add assertions here later

        Files.deleteIfExists(tempFile);
    }
    
    /*
     * note develop%ment treated as two words, 2Monkey treated as one
     */
    @Test
    void testWordProcessingComplex() throws IOException {
        // Setup: create a temp input file
        Path tempFile = Files.createTempFile("test-input", ".txt");
        Files.writeString(tempFile, "2Monkey *moonlight m-o-o-n M**eet              "
        		+ "mountain ^/m arket example test \\develop%ment");

        List<Rule> rules = List.of(new StartsWithMRule(), new LongerThanFiveCharsRule());
        WordProcessor processor = new WordProcessor(rules);
        processor.processFile(tempFile.toString());

        // No assertion yet, just testing it runs — you can add assertions here later

        Files.deleteIfExists(tempFile);
    }
    
    
    
}

