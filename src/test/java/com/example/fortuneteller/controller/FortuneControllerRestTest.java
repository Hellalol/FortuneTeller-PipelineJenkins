package com.example.fortuneteller.controller;

import com.example.fortuneteller.service.FortuneService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

@AutoConfigureMockMvc
@ContextConfiguration(classes = {FortuneControllerRest.class, FortuneService.class})
@WebMvcTest
public class FortuneControllerRestTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void SubmitInfo(){

    }
}
