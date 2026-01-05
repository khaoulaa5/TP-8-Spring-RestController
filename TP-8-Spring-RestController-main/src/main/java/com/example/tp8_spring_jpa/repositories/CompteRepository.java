package com.example.tp8_spring_jpa.repositories;

import com.example.tp8_spring_jpa.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {
}