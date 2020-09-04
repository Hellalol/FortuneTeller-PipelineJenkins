package com.example.fortuneteller.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class Translator {

    List<String> alphabetList = new ArrayList<>(Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","å","ä","ö"));

    public int firstletterToInt(String name){
        return alphabetList.indexOf(name.substring(0,1).toLowerCase()) + 1;
    }

}
