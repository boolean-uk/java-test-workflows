package com.booleanuk.core;

public class Exercise {
    public static String returnsMessage(String grade) {
        String message = "";
        switch (grade) {
            case "A":
                message = "You got an A";
                break;
            case "B":
                message = "You got a B";
                break;
            case "C":
                message = "You got a C";
                break;
            default:
                message = "You didn't get an A or B";
                break;
        }
        return message;
    }
}
