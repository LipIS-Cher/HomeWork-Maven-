package com.example.homework;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    private final com.example.homework.Variables variables;

    public Controller(com.example.homework.Variables variables){
        this.variables = variables;
    }

    @GetMapping(path = "/calculator")
    public String hello(){
        return variables.hello();
    }

    @RequestMapping(value = "/calculator/plus", method = RequestMethod.GET)
    public String plus(@RequestParam("num1") String num1, @RequestParam("num2") String num2){
        if ((num1 != null && !num1.isEmpty()) && (num2 != null && !num2.isEmpty())){
            return variables.plus(Float.valueOf(num1), Float.valueOf(num2));
        } else {
            return variables.error();
        }
    }

    @RequestMapping(value = "/calculator/minus", method = RequestMethod.GET)
    public String minus(@RequestParam("num1") String num1, @RequestParam("num2") String num2){
        if ((num1 != null && !num1.isEmpty()) && (num2 != null && !num2.isEmpty())){
            return variables.minus(Float.valueOf(num1), Float.valueOf(num2));
        } else {
            return variables.error();
        }
    }

    @RequestMapping(value = "/calculator/multiply", method = RequestMethod.GET)
    public String multiply(@RequestParam("num1") String num1, @RequestParam("num2") String num2){
        if ((num1 != null && !num1.isEmpty()) && (num2 != null && !num2.isEmpty())){
            return variables.multiply(Float.valueOf(num1), Float.valueOf(num2));
        } else {
            return variables.error();
        }
    }

    @RequestMapping(value = "/calculator/divide", method = RequestMethod.GET)
    public String divide(@RequestParam("num1") String num1, @RequestParam("num2") String num2){
        if ((num1 != null && !num1.isEmpty()) && (num2 != null && !num2.isEmpty())){
            return variables.divide(Float.valueOf(num1), Float.valueOf(num2));
        } else {
            return variables.error();
        }
    }

}
