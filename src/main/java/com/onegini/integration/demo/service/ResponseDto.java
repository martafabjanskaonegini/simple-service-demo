package com.onegini.integration.demo.service;

import lombok.Getter;

@Getter
public class ResponseDto {
  private String welcome;

  public ResponseDto(String name) {
    this.welcome = "Welcome " + name;
  }
}
