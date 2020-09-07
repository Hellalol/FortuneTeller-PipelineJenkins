package com.example.fortuneteller.service;

import com.example.fortuneteller.domain.CheesySentence;
import com.example.fortuneteller.domain.Person;
import com.example.fortuneteller.domain.Words;
import com.example.fortuneteller.repository.CheesySentenceRepository;
import com.example.fortuneteller.repository.WordsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FortuneService {



    private final List<String> alphabetList = new ArrayList<>(Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","å","ä","ö"));
    private final CheesySentenceRepository cheesySentenceRepository;
    private final WordsRepository wordsRepository;

    Random ran = new Random();

    @Autowired
    public FortuneService(CheesySentenceRepository cheesySentenceRepository, WordsRepository wordsRepository) {
        this.cheesySentenceRepository = cheesySentenceRepository;
        this.wordsRepository = wordsRepository;
    }

    public Optional<CheesySentence> findSentenceById(int id){
        return cheesySentenceRepository.getCheesySentenceById((long) id);
    }
    public Optional<Words> findWordById(int id){
        return wordsRepository.getWordById((long) id);
    }

    // Random factor
    public int random1to29(){
        return ran.nextInt(29) + 1;
    }

    public int random1to228(){
        return ran.nextInt(228) + 1;
    }

    public int firstletterToInt(String name){
        return alphabetList.indexOf(name.substring(0,1).toLowerCase()) + 1;
    }

    public String getRandomQuote () {
        return findSentenceById(random1to29()).get().getSentence();
    }

    public int processName(Person person){
        return firstletterToInt(person.getName());
    }

    public int processAge(Person person){
        return person.getAge();
    }

    public int processNationality(Person person){
        int temp = 0;
        for (int i = 0; i < person.getNationality().length(); i++) {
            temp = random1to228();
        }
        return temp;
    }

    public int processGender(Person person){
        int genderInt = 0;
        if(person.getGender().equals("male"))
            genderInt = 1;
        else if (person.getGender().equals("female"))
            genderInt = 2;
        else genderInt = 3;

        return genderInt;
    }

    public String buildSentence (Person person) {

        int nameInt = processName(person);
        int ageInt = processAge(person);
        int genderInt = processGender(person);
        int nationalityInt = processNationality(person);

        StringBuilder message = new StringBuilder();
        message.append("Your future will be ");

        message.append(findWordById(nameInt).get().getWord());
        message.append(" and possibly ");

        int temp = ageInt + genderInt;


        message.append(findWordById(temp).get().getWord().toLowerCase());


        // third word random from nationality length
        message.append(" and " + findWordById(nationalityInt).get().getWord().toLowerCase());
        return message.toString();
    }

}
