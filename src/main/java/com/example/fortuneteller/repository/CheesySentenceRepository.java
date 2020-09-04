package com.example.fortuneteller.repository;

import com.example.fortuneteller.domain.CheesySentence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CheesySentenceRepository extends JpaRepository<CheesySentence,Long> {
    Optional<CheesySentence> getCheesySentenceById(Long id);
}
