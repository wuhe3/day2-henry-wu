package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplicationTableBuilderTest {
    @Test
    void should_return_true_when_isInRange_given_a_number_5() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int number = 5;

        // When
        boolean isInRange = multiplicationTableBuilder.isInRange(number);

        // Then
        assertTrue(isInRange);
    }

    // TODO: add more tests for isInRange

    @Test
    void should_return_false_when_isInRange_given_a_number_0() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int number = 0;

        // When
        boolean isInRange = multiplicationTableBuilder.isInRange(number);

        // Then
        assertFalse(isInRange);
    }

    @Test
    void should_return_false_when_isInRange_given_a_number_1001() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int number = 1001;

        // When
        boolean isInRange = multiplicationTableBuilder.isInRange(number);

        // Then
        assertFalse(isInRange);
    }

    @Test
    void should_return_true_when_isStarterNotBiggerThanEnd_given_2_and_3() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 3;

        // When
        boolean isStarterNotBiggerThanEnd = multiplicationTableBuilder.isStarterNotBiggerThanEnd(start, end);

        // Then
        assertTrue(isStarterNotBiggerThanEnd);
    }

    @Test
    void should_return_false_when_isStarterNotBiggerThanEnd_given_3_and_2() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 3;
        int end = 2;

        // When
        boolean isStarterNotBiggerThanEnd = multiplicationTableBuilder.isStarterNotBiggerThanEnd(start, end);

        // Then
        assertFalse(isStarterNotBiggerThanEnd);
    }

    @Test
    void should_return_true_when_isStarterNotBiggerThanEnd_given_3_and_3() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 3;
        int end = 3;

        // When
        boolean isStarterNotBiggerThanEnd = multiplicationTableBuilder.isStarterNotBiggerThanEnd(start, end);

        // Then
        assertTrue(isStarterNotBiggerThanEnd);
    }

    @Test
    void should_return_true_when_isValid_given_2_and_3() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 3;

        // When
        boolean isValid = multiplicationTableBuilder.isValid(start, end);

        // Then
        assertTrue(isValid);
    }

    @Test
    void should_return_false_when_isValid_given_2_and_1() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 1;

        // When
        boolean isValid = multiplicationTableBuilder.isValid(start, end);

        // Then
        assertFalse(isValid);
    }

    @Test
    void should_return_false_when_isValid_given_0_and_2() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 0;
        int end = 2;

        // When
        boolean isValid = multiplicationTableBuilder.isValid(start, end);

        // Then
        assertFalse(isValid);
    }

    @Test
    void should_return_false_when_isValid_given_2_and_1001() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 1001;

        // When
        boolean isValid = multiplicationTableBuilder.isValid(start, end);

        // Then
        assertFalse(isValid);
    }

    @Test
    void should_return_false_when_isValid_given_1001_and_2() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 1001;
        int end = 2;

        // When
        boolean isValid = multiplicationTableBuilder.isValid(start, end);

        // Then
        assertFalse(isValid);
    }

    // generateTable
    // given 2,4 return '2*2=4\n2*3=6 3*3=9\n2*4=8 3*4=12 4*4=16\n'

    @Test
    void should_return_multiplication_table_when_generateTable_given_2_and_4() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;

        // When
        String multiplicationTable = multiplicationTableBuilder.generateTable(start, end);
        String expectedMultiplicationTable = String.format("2*2=4%n2*3=6 3*3=9%n2*4=8 3*4=12 4*4=16%n");

        // Then
        assertEquals(expectedMultiplicationTable, multiplicationTable);
    }

}
