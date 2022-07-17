package com.collie.api.errors;

public class GetEntryError extends Exception {
    public GetEntryError(String errorMessage) {
        super(errorMessage);
    }
}
