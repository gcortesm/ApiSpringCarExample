package com.car.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.car.demo.entity.PersonaEntity;
import com.car.demo.repository.PersonaRepository;
import com.car.demo.repository.PersonaRepositoryStore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaService {

    @Autowired
    private PersonaRepository repo;

    @Autowired
    private PersonaRepositoryStore repoStore;


    public List<PersonaEntity> getAll(){
        return repo.findAll();
    }
    public Optional<PersonaEntity> getById(int id){
        return repo.findById(id);
    }
    
    @Transactional
    public boolean addPersona(PersonaEntity p){
        return repoStore.saveProcedure(p);
    }

    public boolean editPersona(PersonaEntity p){
        return repoStore.editProcedure(p);
    }
}