package com.practice.demo;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface CandidateRepo extends JpaRepository<CandidateEntity, Integer> {

    
}
