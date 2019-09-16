package datastructures.hashtable;

import datastructures.hashtable.RepeatedWord.RepeatedWord;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepeatedWordTest {
    @Test
    public void testFirstRepeatedWord_emptyString() {
        String result = RepeatedWord.firstRepeatedWord("");
        assertEquals("Input string is either null or has less than 2 words", result);
    }

    @Test
    public void testFirstRepeatedWord_lessThan2Words() {
        String result = RepeatedWord.firstRepeatedWord("the");
        assertEquals("No duplicates", result);
    }

    @Test
    public void testFirstRepeatedWord_duplicates() {
        String result = RepeatedWord.firstRepeatedWord("Once upon a time, there was a brave princess who...");
        assertEquals("a", result);
    }

    @Test
    public void testFirstRepeatedWord_duplicatesWithCommas() {
        String result = RepeatedWord.firstRepeatedWord("It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...");
        assertEquals("summer", result);
    }

    @Test
    public void testFirstRepeatedWord_ignoreCase() {
        String result = RepeatedWord.firstRepeatedWord("It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief");
        assertEquals("it", result);
    }
}
