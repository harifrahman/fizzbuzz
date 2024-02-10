package fizzbuzz.lib;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordTest {
    ReverseWord app = new ReverseWord();

    @Test
    void shouldReturnStringGivenReversedCorrectly() {
        String input = "join us for more exciting surprise!";
        String expected = "surprise! exciting more for us join";
        String actual = app.reverseWord(input);

        assertEquals(expected, actual);
    }

    @Test
    void shouldSwapAAndB() {
        String actual = app.reverseWord("A B");

        assertEquals("B A", actual);
    }

}