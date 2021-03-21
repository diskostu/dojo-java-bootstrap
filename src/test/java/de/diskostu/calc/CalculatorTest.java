package de.diskostu.calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests for {@link Calculator}.
 */
public class CalculatorTest {

    @Test
    public void testAdd() {
        // arrange
        final Calculator sut = new Calculator();

        // act
        final double result = sut.add(1, 2);

        // assert
        Assertions.assertEquals(3, result);
    }
}
