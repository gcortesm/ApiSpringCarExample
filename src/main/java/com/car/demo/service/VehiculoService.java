package com.car.demo.service;

import java.util.List;

import com.car.demo.entity.VehiculosEntity;
import com.car.demo.repository.VehiculoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculoService {

    @Autowired
    private VehiculoRepository repository;

    public List<VehiculosEntity> getAll(String idPersona) {
         return repository.findAllByPersona(idPersona);
    }
    public VehiculosEntity save(VehiculosEntity vehiculo){
        return repository.save(vehiculo);
    }

}