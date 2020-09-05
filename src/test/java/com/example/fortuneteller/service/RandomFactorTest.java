package com.example.fortuneteller.service;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RandomFactorTest {

    RandomFactor randomFactor = new RandomFactor();

    @Test
    void random1to29() {
        int lowestAcceptedValue = 1;
        int highestAcceptedValue = 29;
        boolean outOfRange = false;

        for (int i = 0; i < 1000; i++) {
            int randomNumber = randomFactor.random1to29();
            if (randomNumber < lowestAcceptedValue && randomNumber > highestAcceptedValue) {
                outOfRange = true;
            }
        }
        assertEquals(outOfRange, false);
    }

    @Test
    void random1to228() {
        int lowestAcceptedValue = 1;
        int highestAcceptedValue = 228;
        boolean outOfRange = false;

        for (int i = 0; i < 5000; i++) {
            int randomNumber = randomFactor.random1to29();
            if (randomNumber < lowestAcceptedValue && randomNumber > highestAcceptedValue) {
                outOfRange = true;
            }
        }
        assertEquals(outOfRange, false);
    }
}