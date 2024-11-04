package ru.example.MySecondTestAppSpringBoot.exception;

public class UnsupportedCodeException extends Exception{
    public UnsupportedCodeException() {
        super("uid = 123");
    }
}