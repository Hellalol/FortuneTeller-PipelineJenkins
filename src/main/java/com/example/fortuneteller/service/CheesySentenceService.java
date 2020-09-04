package com.example.fortuneteller.service;

import com.example.fortuneteller.domain.CheesySentence;
import com.example.fortuneteller.repository.CheesySentenceRepository;
import com.example.fortuneteller.repository.WordsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CheesySentenceService {
    private CheesySentenceRepository cheesySentenceRepository;

    @Autowired
    public CheesySentenceService(CheesySentenceRepository cheesySentenceRepository) {
        this.cheesySentenceRepository = cheesySentenceRepository;
    }

    public Optional<CheesySentence> findSentenceById(int id){return cheesySentenceRepository.getCheesySentenceById((long) id);};
}
