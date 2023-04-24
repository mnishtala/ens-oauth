package com.vesterales.authserver.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Slf4j
public class EventNotificationController {

    @PostMapping("/sfmc-events")
    public ResponseEntity<String> response(@RequestHeader Map<String,String> headers, @RequestBody Object eventBody) {
        log.info("Request headers {}", headers);
        log.info("Event received from ENS :{}", eventBody);
        return ResponseEntity.status(HttpStatus.OK).body("Hello There");
    }
}
