package com.example.mockito.services;

import com.example.mockito.interfaces.*;

import org.springframework.beans.factory.annotation.Autowired;

public class MathService implements MathInterface {
    @Autowired
    MathInterface mathInterface;

    @Override
    public int multiply(int a, int b) {
        return mathInterface.multiply(a, b);
    }
}