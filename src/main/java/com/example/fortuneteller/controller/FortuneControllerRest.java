package com.example.fortuneteller.controller;

import com.example.fortuneteller.domain.Person;
import com.example.fortuneteller.service.RandomFactor;
import com.example.fortuneteller.service.Translator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class FortuneControllerRest {

    private RandomFactor randomFactor;
    private Translator translator;

    @Autowired
    public FortuneControllerRest(RandomFactor randomFactor, Translator translator) {
        this.randomFactor = randomFactor;
        this.translator = translator;
    }

    @RequestMapping("/submit/{name}/{age}/{nationality}/{gender}")
    public Map<String,String> submitInfo(@PathVariable String name, @PathVariable  int age, @PathVariable  String nationality, @PathVariable  String gender) {
        Person person = new Person(name, nationality, age, gender);

        String message = translator.processPerson(person);
        String quote = translator.getRandomQuote();

        HashMap<String,String> map = new HashMap<>();
        map.put("message", message);
        map.put("quote", quote);

        return map;
    }


}
