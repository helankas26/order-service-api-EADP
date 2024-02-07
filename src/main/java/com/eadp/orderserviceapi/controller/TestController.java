package com.eadp.orderserviceapi.controller;

import com.eadp.orderserviceapi.util.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/test")
@RestController
public class TestController {

    @GetMapping
    public ResponseEntity<StandardResponse> test() {
        return new ResponseEntity<>(
                new StandardResponse(200, "Hello User (Order Service API)", null),
                HttpStatus.OK
        );
    }
}