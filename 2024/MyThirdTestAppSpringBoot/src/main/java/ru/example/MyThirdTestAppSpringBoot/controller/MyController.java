package ru.example.MyThirdTestAppSpringBoot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.example.MyThirdTestAppSpringBoot.exception.*;
import ru.example.MyThirdTestAppSpringBoot.model.*;
import ru.example.MyThirdTestAppSpringBoot.service.ValidationService;
import ru.example.MyThirdTestAppSpringBoot.service.UnsupportedCodeValidation;
import ru.example.MyThirdTestAppSpringBoot.service.ModifyResponseService;
import ru.example.MyThirdTestAppSpringBoot.util.DateTimeUtil;
import org.springframework.validation.BindingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class MyController {
    private final ValidationService validationService;
    private final ModifyResponseService modifyResponseService;
    private final UnsupportedCodeValidation unsupportedCodeValidation;

    @Autowired
    public MyController(ValidationService validationService, UnsupportedCodeValidation unsupportedCodeValidation,
                        @Qualifier("ModifySystemTimeResponseService") ModifyResponseService modifyResponseService) {
        this.validationService = validationService;
        this.unsupportedCodeValidation = unsupportedCodeValidation;
        this.modifyResponseService = modifyResponseService;
    }

    @PostMapping(value = "/feedback")
    public ResponseEntity<Response> feedback(@Valid @RequestBody Request request,
                                             BindingResult bindingResult) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        log.info("request: {}", request);

        Response response = Response.builder()
                .uid(request.getUid())
                .operationUid(request.getOperationUid())
                .systemTime(DateTimeUtil.getCustomFormat().format(new Date()))
//                .systemTime(simpleDateFormat.format(new Date()))
                .code(Codes.SUCCESS)
                .errorCode(ErrorCodes.EMPTY)
                .errorMessage(ErrorMessages.EMPTY)
                .build();

        try {
            validationService.isValid(bindingResult);
        } catch (ValidationFailedException e) {
            log.error("error: {}", e.getMessage());
            response.setCode(Codes.FAILED);
//            response.setCode("failed");
            response.setErrorCode(ErrorCodes.VALIDATION_EXCEPTION);
//            response.setErrorCode("ValidationException");
            response.setErrorMessage(ErrorMessages.VALIDATION);
//            response.setErrorMessage("Ошибка валидации");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            log.error("error: {}", e.getMessage());
            response.setCode(Codes.FAILED);
//            response.setCode("failed");
            response.setErrorCode(ErrorCodes.UNKNOWN_EXCEPTION);
//            response.setErrorCode("UnknownException");
            response.setErrorMessage(ErrorMessages.UNKNOWN);
//            response.setErrorMessage("Произошла непредвиденная ошибка");
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        try {
            unsupportedCodeValidation.Valid(Integer.parseInt(request.getUid()));
        } catch (UnsupportedCodeException e) {
            log.error("error: {}", e.getMessage());
            response.setCode(Codes.FAILED);
//            response.setCode("failed");
            response.setErrorCode(ErrorCodes.UNSUPPORTED_EXCEPTION);
//            response.setErrorCode("UnsupportedCodeException");
            response.setErrorMessage(ErrorMessages.UNSUPPORTED);
//            response.setErrorMessage("uid = 123");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
        modifyResponseService.modify(response);
        log.info("response: {}", response);
        log.info("Run-time: {} ms", System.currentTimeMillis() -  request.getCurTime());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}