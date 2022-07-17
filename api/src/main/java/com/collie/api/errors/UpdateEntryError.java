package com.collie.api.errors;

public class UpdateEntryError extends Exception {
    public UpdateEntryError(String errorMessage) {
        super(errorMessage);
    }
}
