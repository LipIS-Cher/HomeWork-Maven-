package com.example.homework;

import org.springframework.stereotype.Service;

import javax.swing.*;

@Service
public class ServiceImpl implements Variables{

    public String hello(){
        return "Добро пожаловать в калькулятор";
    }

    public String error(){
        return "Ошибка, проверьте наличие параметров";
    }

    public String plus(float num1, float num2){
        return  num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String minus(float num1, float num2){
        return  num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String multiply(float num1, float num2){
        return  num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String divide(float num1, float num2){
        if (num2 != 0){
            return  num1 + " / " + num2 + " = " + (num1 / num2);
        } else {
            return "Ошибка, на ноль делить нельзя!";
        }
    }
}
