package com.example.fortuneteller.repository;

import com.example.fortuneteller.domain.CheesySentence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheesySentenceRepository extends JpaRepository<CheesySentence,Long> {


}
