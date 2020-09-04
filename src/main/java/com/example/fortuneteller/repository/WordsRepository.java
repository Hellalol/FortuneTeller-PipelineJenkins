package com.example.fortuneteller.repository;

import com.example.fortuneteller.domain.Words;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WordsRepository extends JpaRepository<Words,Long> {
    Optional<Words> getWordById(Long id);
}
