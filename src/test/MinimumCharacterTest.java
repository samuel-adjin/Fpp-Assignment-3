package test;

import org.junit.jupiter.api.Test;
import problemtwo.MinimumCharacter;

import static org.junit.jupiter.api.Assertions.*;

class MinimumCharacterTest {

    @Test
    void itShouldThrowErrorWhenInputIsEmpty() {
        assertThrows(IllegalArgumentException.class, () -> MinimumCharacter.minCharacter(""));
    }

    @Test
    void itShouldReturnValidErrorMessage() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> MinimumCharacter.minCharacter(""));
        String expected = "Input cannot be null or empty";
        assertEquals(expected, exception.getMessage());
    }

    @Test
    void itShouldReturnElementInArrayIfLengthIsOne() {
        char expected = 'a';
        assertEquals(expected, MinimumCharacter.minCharacter("a"));
    }

    @Test
    void itShouldReturnMinCharacterIfTwoElementsInArray() {
        char expected = 'b';
        assertEquals(expected, MinimumCharacter.minCharacter("bk"));
    }

    @Test
    void itShouldReturnMinCharacterInInArray() {
        char expected = 'e';
        assertEquals(expected, MinimumCharacter.minCharacter("kel"));
    }
  
}