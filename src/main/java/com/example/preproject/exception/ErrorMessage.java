package com.example.preproject.exception;

public class ErrorMessage {
    public ErrorMessage(String message, int statusCode) {
        String error = String.format("message : %s", message);
        String status = String.format("status code : %d", statusCode);
    }
}