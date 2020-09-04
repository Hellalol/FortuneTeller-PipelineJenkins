package com.example.fortuneteller.service;

import com.example.fortuneteller.domain.Words;
import com.example.fortuneteller.repository.WordsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WordsService {
    private WordsRepository wordsRepository;

    @Autowired
    public WordsService(WordsRepository wordsRepository) {
        this.wordsRepository = wordsRepository;
    }

    public Optional<Words> findWordById(int id){return wordsRepository.getWordById((long) id);};
}
