package com.vesterales.authserver.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Simple {

    @GetMapping("/message")
    public ResponseEntity<String> response() {
        return ResponseEntity.status(HttpStatus.OK).body("Hello There");
    }
}
