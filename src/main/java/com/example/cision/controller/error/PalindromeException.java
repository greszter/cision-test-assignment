package com.example.cision.exception;

public class PalindromeException extends RuntimeException{
    public IncorrectFileExtensionException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
