package com.otsvietkova.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Strichka {

    public static void main(String[] args) {
        // ASCI printable characters
        int leftLimit = 32;
        int rightLimit = 126;

        StingGenerator stingGenerator = new StingGenerator(leftLimit, rightLimit);

        int randomListLength = randomNumber(10, 20);
        List<String> allString = new ArrayList<>(randomListLength);

        for (int i = 0; i < randomListLength; i++) {
            int randomStringLength = randomNumber(6, 15);
            String randomString = stingGenerator.generateString(randomStringLength);
            allString.add(randomString);
        }

        allString.forEach(System.out::println);
    }

    private static int randomNumber(int from, int to) {
        Random random = new Random();
        return from + random.nextInt(to - from + 1);
    }
}
