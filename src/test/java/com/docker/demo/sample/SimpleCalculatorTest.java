package com.docker.demo.sample;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SimpleCalculatorTest {

    @Test
    public void twoPlusTwoShouldEqualsFour() {
        var calculator = new SimpleCalculator();
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void threePlusSevenShouldEqualsTen() {
        var calculator = new SimpleCalculator();
        assertEquals(10, calculator.add(3, 8));
    }
}
