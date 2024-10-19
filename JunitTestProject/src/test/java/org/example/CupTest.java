package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void getLiquidType() {
        Cup cup = new Cup("Orange Juice", 89);
        assertEquals("Orange Juice", cup.getLiquidType());
    }

    @Test
    void getPercentFull() {
        Cup cup = new Cup("Orange Juice", 89);
        assertEquals(89, cup.getPercentFull());
    }
}