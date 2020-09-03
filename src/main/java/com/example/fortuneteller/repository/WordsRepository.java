package com.example.fortuneteller.repository;

import com.example.fortuneteller.domain.Words;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordsRepository extends JpaRepository<Words,Long> {

}
