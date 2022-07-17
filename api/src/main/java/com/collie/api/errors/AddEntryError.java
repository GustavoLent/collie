package com.collie.api.errors;

public class AddEntryError extends Exception {
    public AddEntryError(String errorMessage) {
        super(errorMessage);
    }
}
