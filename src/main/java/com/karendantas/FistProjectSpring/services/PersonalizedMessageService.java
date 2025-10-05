package com.karendantas.FistProjectSpring.services;

import org.springframework.stereotype.Service;

@Service
public class PersonalizedMessageService {

    public String getMessage(String name){
        return "Olá, aluna(o) " + name;
    }
}
