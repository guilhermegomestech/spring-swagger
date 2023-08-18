package com.atc.multimidia.application.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/spring-swagger")
public class TesteAplicacao {

    @GetMapping
    public String getSuccess() {
        return "Success";
    }

}
