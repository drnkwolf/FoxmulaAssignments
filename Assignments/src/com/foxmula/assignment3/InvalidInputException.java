package com.foxmula.assignment3;

public class InvalidInputException extends Exception {
    public InvalidInputException(String args) {
        super(args);
    }

    @Override
    public String getMessage() {
        return "Invalid input. Input is prime and odd";
    }
}
