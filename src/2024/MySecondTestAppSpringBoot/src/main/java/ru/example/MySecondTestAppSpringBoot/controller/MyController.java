package ru.example.MySecondTestAppSpringBoot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.example.MySecondTestAppSpringBoot.model.Request;
import ru.example.MySecondTestAppSpringBoot.model.Response;
import ru.example.MySecondTestAppSpringBoot.service.ValidationService;
import ru.example.MySecondTestAppSpringBoot.exception.ValidationFailedException;
import ru.example.MySecondTestAppSpringBoot.exception.UnsupportedCodeException;
import ru.example.MySecondTestAppSpringBoot.service.UnsupportedCodeValidation;
import org.springframework.validation.BindingResult;
import org.springframework.beans.factory.annotation.Autowired;
import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class MyController {
    private final ValidationService validationService;
    private final UnsupportedCodeValidation unsupportedCodeValidation;

    @Autowired
    public MyController(ValidationService validationService, UnsupportedCodeValidation unsupportedCodeValidation) {
        this.validationService = validationService;
        this.unsupportedCodeValidation = unsupportedCodeValidation;
    }

    @PostMapping(value = "/feedback")
    public ResponseEntity<Response> feedback(@Valid @RequestBody Request request,
                                             BindingResult bindingResult) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

        Response response = Response.builder()
                .uid(request.getUid())
                .operationUid(request.getOperationUid())
                .systemTime(simpleDateFormat.format(new Date()))
                .code("success")
                .errorCode("")
                .errorMessage("")
                .build();

        try {
            validationService.isValid(bindingResult);
        } catch (ValidationFailedException e) {
            response.setCode("failed");
            response.setErrorCode("ValidationException");
            response.setErrorMessage("Ошибка валидации");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            response.setCode("failed");
            response.setErrorCode("UnknownException");
            response.setErrorMessage("Произошла непредвиденная ошибка");
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        try {
            unsupportedCodeValidation.Valid(Integer.parseInt(request.getUid()));
        } catch (UnsupportedCodeException e) {
            response.setCode("failed");
            response.setErrorCode("UnsupportedCodeException");
            response.setErrorMessage("uid = 123");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}