package ru.example.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.example.MySecondTestAppSpringBoot.exception.UnsupportedCodeException;

@Service
public class UnsupportedCodeValidation {
    public void Valid(int uid) throws UnsupportedCodeException {
        if (uid == 123) {
            throw new UnsupportedCodeException();
        }
    }
}