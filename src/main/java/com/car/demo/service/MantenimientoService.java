package com.car.demo.service;

import java.util.List;
import java.util.Optional;

import com.car.demo.entity.MantenimientoEntity;
import com.car.demo.repository.MantenimientoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MantenimientoService {
    
    @Autowired
    private MantenimientoRepository repo;

    public List<MantenimientoEntity> getAll(){
       return  repo.findAll();
    }
    public Optional<MantenimientoEntity> findById(int id){
        return repo.findById(id);
    }
    public MantenimientoEntity save(MantenimientoEntity m ){
        return repo.save(m);
    }
    public MantenimientoEntity edit(MantenimientoEntity mante){
        return repo.save(mante);
    }
    public void setMecanicoMantenimiento (int identificacion,String tipo,int idMante){
        repo.setMecanicoMantenimiento(tipo,identificacion,  idMante);
    }

    public List<MantenimientoEntity> getAllUnAssignment(){
        return repo.getAllUnAssignment();
    }
}