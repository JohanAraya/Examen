package com.cenfotec.examen.examen.repository;

import com.cenfotec.examen.examen.domain.Journal;
import org.springframework.data.jpa.repository.JpaRepository;


public interface JournalRepository extends JpaRepository<Journal, Long> {
}
