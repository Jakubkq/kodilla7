package com.example.kodilla.stram.array;

import com.example.kodilla.stream.array.ArrayOperations;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
       assertEquals(10.5, average, 0.0001);

    }
}