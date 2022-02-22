package com.otsvietkova.task1;

import java.util.Random;

public class StingGenerator {

    private final int leftLimit;
    private final int rightLimit;

    // Constructor
    public StingGenerator(int leftLimit, int rightLimit) {
        this.leftLimit = leftLimit;
        this.rightLimit = rightLimit;
    }

    public String generateString(int length) {
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            // Some logic for generating random number from leftLimit to rightLimit
            int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }

        return buffer.toString();
    }
}
