package com.booleanuk.core;

import com.booleanuk.core.Exercise;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExerciseTest {
    @Test
    public void shouldReturnCorrectMessage() {
        Assertions.assertEquals("You got an A", Exercise.returnsMessage("A"));
        Assertions.assertEquals("You got a B", Exercise.returnsMessage("B"));
        Assertions.assertEquals("You didn't get an A or B", Exercise.returnsMessage("X"));
    }
}
