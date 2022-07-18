package com.collie.errors;

public class AddEntryError extends Exception {
    public AddEntryError(String errorMessage) {
        super(errorMessage);
    }
}
