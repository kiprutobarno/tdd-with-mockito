package com.example.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.example.mockito.interfaces.MathInterface;
import com.example.mockito.services.MathService;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MathServiceMockTest {
    @Mock
    private MathInterface mathInterface;

    @InjectMocks
    private MathService mathService = new MathService();

    @DisplayName("Test that multiply(3,5) returns 15")
    @Test
    public void testMultiply() {
        when(mathInterface.multiply(3, 5)).thenReturn(15);
        assertEquals(15, mathService.multiply(3, 5));
    }
}