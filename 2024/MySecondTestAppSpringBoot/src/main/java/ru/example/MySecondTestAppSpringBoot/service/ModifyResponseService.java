package ru.example.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.example.MySecondTestAppSpringBoot.model.Response;

@Service
public interface ModifyResponseService {

    Response modify(Response response);
}