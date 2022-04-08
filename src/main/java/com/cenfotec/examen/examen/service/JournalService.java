package com.cenfotec.examen.examen.service;



import com.cenfotec.examen.examen.domain.Journal;
import com.cenfotec.examen.examen.repository.JournalRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class JournalService {
    @Autowired
    JournalRepository journalRepository;

    public void saveJournal(Journal journal){
        journalRepository.save(journal);
    }

    public List<Journal> getAll(){
        return journalRepository.findAll();
    }
}
