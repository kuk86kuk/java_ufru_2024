package ru.example.MyThirdTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.example.MyThirdTestAppSpringBoot.exception.ValidationFailedException;


@Service
public interface ValidationService {
    void isValid(BindingResult bindingResult) throws ValidationFailedException;
}