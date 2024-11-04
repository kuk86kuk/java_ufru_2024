package ru.example.MyThirdTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.example.MyThirdTestAppSpringBoot.exception.UnsupportedCodeException;

@Service
public class UnsupportedCodeValidation {
    public void Valid(int uid) throws UnsupportedCodeException {
        if (uid == 123) {
            throw new UnsupportedCodeException();
        }
    }
}