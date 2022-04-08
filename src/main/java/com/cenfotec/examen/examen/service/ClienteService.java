package com.cenfotec.examen.examen.service;

import com.cenfotec.examen.examen.repository.ClienteRepository;
import com.cenfotec.examen.examen.domain.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    public void saveCliente(Cliente cliente){
        clienteRepository.save(cliente);
    }

    public List<Cliente> getAll(){
        return clienteRepository.findAll();
    }

    public Optional<Cliente > getById(int id) {
        return clienteRepository.findById(Long.valueOf(id));
    }

    public void updateCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    public void deleteCliente(int id) {
        clienteRepository.deleteById(Long.valueOf(id));
    }
}
