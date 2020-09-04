package com.example.fortuneteller.service;

import com.example.fortuneteller.domain.Person;
import com.example.fortuneteller.repository.WordsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class Translator {

    private WordsService wordsService;
    private CheesySentenceService cheesySentenceService;
    private RandomFactor randomFactor;
    private List<String> alphabetList = new ArrayList<>(Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","å","ä","ö"));

    @Autowired
    public Translator(WordsService wordsService, CheesySentenceService cheesySentenceService, RandomFactor randomFactor) {
        this.wordsService = wordsService;
        this.cheesySentenceService = cheesySentenceService;
        this.randomFactor = randomFactor;
    }

    public int firstletterToInt(String name){
        return alphabetList.indexOf(name.substring(0,1).toLowerCase()) + 1;
    }

    public String getRandomQuote () {
        return cheesySentenceService.findSentenceById(randomFactor.random1to29()).get().getSentence();
    }

    public String processPerson (Person person) {
        StringBuilder message = new StringBuilder();
        message.append("You are ");

        // first word form first letter in name
        int temp = firstletterToInt(person.getName());
        message.append(wordsService.findWordById(temp).get().getWord());

        temp = person.getAge();
        // word from age as index, if over 200 add random word
        if (temp < 200) {
            message.append(", " + wordsService.findWordById(temp).get().getWord());
        } else {
            message.append(", " + wordsService.findWordById(randomFactor.random1to228()).get().getWord());
        }
        // third word random
        message.append(" and " + wordsService.findWordById(randomFactor.random1to228()).get().getWord());


        return message.toString();
    }

}
