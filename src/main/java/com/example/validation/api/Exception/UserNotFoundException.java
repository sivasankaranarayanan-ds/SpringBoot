package com.example.validation.api.Exception;

public class UserNotFoundException extends Exception
{
    public UserNotFoundException(String message) {
        super(message);
    }
}
