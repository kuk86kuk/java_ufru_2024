package ru.example.MyThirdTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.example.MyThirdTestAppSpringBoot.model.Response;

@Service
public interface ModifyResponseService {

    Response modify(Response response);
}