package ru.example.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.example.MySecondTestAppSpringBoot.model.Request;


@Service
public class ModifySourceRequestService implements ModifyRequestService {
    @Override
    public void modify(Request request) {
        request.setSource("source_new");
    }
}