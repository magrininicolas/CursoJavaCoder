package com.nicolas.springcursojava.controllers;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

  @GetMapping("/sum")
  public Integer sum(@RequestParam(name = "num1") Integer a, @RequestParam(name = "num2") Integer b){
    return a + b;
  }
  
  @GetMapping("/sum2")
  public Integer sum2(@RequestParam(name = "nums") Integer... nums) {
    return Arrays.stream(nums).reduce(0, (t, a) -> t + a);
  }

  @GetMapping("/subtract")
  public Integer subtract(@RequestParam(name = "num1") Integer a, @RequestParam(name = "num2") Integer b){
    return a - b;
  }

  @GetMapping("/subtract2")
  public Integer subtract2(@RequestParam(name = "nums") Integer... nums) {
    return Arrays.stream(nums).reduce(0, (t, a) -> t - a);
  }
}
