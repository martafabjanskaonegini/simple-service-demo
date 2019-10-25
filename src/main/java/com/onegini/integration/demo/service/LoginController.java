package com.onegini.integration.demo.service;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class LoginController {

  @PostMapping(value = "login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseDto login(@RequestBody LoginDto loginDto) {
    log.info("Incoming request with login {} password {}", loginDto.getLogin(), loginDto.getPassword());
    return new ResponseDto(loginDto.getLogin());
  }
}

