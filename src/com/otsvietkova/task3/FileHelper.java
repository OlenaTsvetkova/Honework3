package com.otsvietkova.task3;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FileHelper {

    public static void writeFromMapToFile(Map<Long, String> map, File file) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);

            List<Map.Entry<Long, String>> entries = new ArrayList<>(map.entrySet());
            entries.sort(Map.Entry.comparingByKey());

            entries.forEach(entry -> {
                try {
                    if (isPowerOfTwo(entry.getKey())) {
                        System.out.println("Writing '" + entry.getValue() + "' to file in line + " + entry.getKey() + " ...");
                        fileOutputStream.write((entry.getValue() + "\n").getBytes(StandardCharsets.UTF_8));
                    } else {
                        System.out.println("Writing empty string to file in line + " + entry.getKey() + " ...");
                        fileOutputStream.write("\n".getBytes(StandardCharsets.UTF_8));
                    }
                } catch (IOException e) {
                    System.err.println("Sorry maaan! Something went wrong. Couldn't write value: " + entry.getValue() + " with key: " + entry.getKey() + " to file");
                }
            });

        } catch (FileNotFoundException e) {
            System.err.println("Sorry maaan! File not found.");
        }
    }

    public static void writeFromFileToMap(File file, Map<Long, String> map) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            long lineNumber = 1;
            String line;
            while ((line = br.readLine()) != null) {
                if (isPowerOfTwo(lineNumber)) {
                    map.put(lineNumber, line);
                }

                lineNumber++;
            }
        } catch (IOException e) {
            System.err.println("Sorry maaan! Can't read file.");
        }
    }

    private static boolean isPowerOfTwo(long n) {
        double tmp = Math.log(n) / Math.log(2);

        return Math.ceil(tmp) == Math.floor(tmp);
    }
}
