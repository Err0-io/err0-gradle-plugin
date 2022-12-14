package io.err0.gradle;

public class Err0Exception extends Error {
    public Err0Exception() {
    }

    public Err0Exception(String message) {
        super(message);
    }

    public Err0Exception(String message, Throwable cause) {
        super(message, cause);
    }
}
