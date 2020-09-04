package com.example.fortuneteller.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomFactor {

    Random ran = new Random();

    public int random1to10(){
        return ran.nextInt(10) + 1;
    }

    public int random1to29(){
        return ran.nextInt(29) + 1;
    }

    public int random1to228(){
        return ran.nextInt(228) + 1;
    }

    public int randomFromStringLength (String string) {return ran.nextInt(string.length()) + 1; }



}
