package ru.example.MyThirdTestAppSpringBoot.exception;

public class UnsupportedCodeException extends Exception{
    public UnsupportedCodeException() {
        super("uid = 123");
    }
}