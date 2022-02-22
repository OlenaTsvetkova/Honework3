package com.otsvietkova.task3;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
//        Map<Long, String> toFileMap = Map.ofEntries(
//                Map.entry(1L, "line 1"),
//                Map.entry(2L, "line 2"),
//                Map.entry(3L, "line 3"),
//                Map.entry(4L, "line 4"),
//                Map.entry(5L, "line 5"),
//                Map.entry(6L, "line 6"),
//                Map.entry(7L, "line 7"),
//                Map.entry(8L, "line 8"),
//                Map.entry(9L, "line 9"),
//                Map.entry(10L, "line 10"),
//                Map.entry(11L, "line 11"),
//                Map.entry(12L, "line 12"),
//                Map.entry(13L, "line 13"),
//                Map.entry(14L, "line 14"),
//                Map.entry(15L, "line 15"),
//                Map.entry(16L, "line 16"),
//                Map.entry(17L, "line 17")
//        );

        File file = new File("/Users/otsvietkova/IdeaProjects/MyJavaProject/src/Homework3_3/file.txt");

//        FileHelper.writeFromMapToFile(toFileMap, file);

        Map<Long, String> fromFileMap = new HashMap<>();
        FileHelper.writeFromFileToMap(file, fromFileMap);

        System.out.println(fromFileMap);
    }
}
