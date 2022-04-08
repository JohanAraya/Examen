package com.cenfotec.examen.examen.service;

import com.cenfotec.examen.examen.domain.Auditoria;
import com.cenfotec.examen.examen.repository.AuditoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuditoriaService {
    @Autowired
    AuditoriaRepository auditoriaRepository;

    public void saveAuditoria(Auditoria auditoria){
        auditoriaRepository.save(auditoria);
    }

    public List<Auditoria> getAll(){
        return auditoriaRepository.findAll();
    }

    public Optional<Auditoria> getById(int id) {
        return auditoriaRepository.findById(Long.valueOf(id));
    }

    public void updateAuditoria(Auditoria auditor) {
        auditoriaRepository.save(auditor);
    }

    public void deleteauditoria(int id) {
        auditoriaRepository.deleteById(Long.valueOf(id));
    }
}
