package com.booleanuk.core;

public class Exercise {
    public static String returnsMessage(String grade) {
        String message = switch (grade) {
            case "A" -> "You got an A";
            case "B" -> "You got a B";
            case "C" -> "You got a C";
            default -> "You didn't get an A or B";
        };
        return message;
    }
}
