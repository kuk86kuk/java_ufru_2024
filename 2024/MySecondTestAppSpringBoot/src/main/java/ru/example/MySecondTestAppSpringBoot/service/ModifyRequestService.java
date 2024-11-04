package ru.example.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.example.MySecondTestAppSpringBoot.model.Request;

@Service
public interface ModifyRequestService {
    void modify(Request request);
}