package com.example.fortuneteller.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RandomFactorTest {

    FortuneService fortuneService;

    @Test
    void random1to29() {
        int lowestAcceptedValue = 1;
        int highestAcceptedValue = 29;
        boolean outOfRange = false;

        for (int i = 0; i < 1000; i++) {
            int randomNumber = fortuneService.random1to29();
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
            int randomNumber = fortuneService.random1to29();
            if (randomNumber < lowestAcceptedValue && randomNumber > highestAcceptedValue) {
                outOfRange = true;
            }
        }
        assertEquals(outOfRange, false);
    }
}