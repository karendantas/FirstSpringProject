package com.karendantas.FistProjectSpring.controllers;

import com.karendantas.FistProjectSpring.services.PersonalizedMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("message")
public class PersonalizedMessage {

    @Autowired //indica pro spring q a classe tem que ser inejetada na execução
    private PersonalizedMessageService personalizedMessageService;

    @GetMapping
    public String getMessage(){
        return personalizedMessageService.getMessage("Karen Dantas");
    }
}
