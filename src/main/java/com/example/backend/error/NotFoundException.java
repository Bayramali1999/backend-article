package com.example.backend.error;

public class NotFoundException extends  RuntimeException{
    public NotFoundException(String msg) {
        super(msg);
    }
}

