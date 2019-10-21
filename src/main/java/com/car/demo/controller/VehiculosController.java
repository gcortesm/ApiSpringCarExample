package com.car.demo.controller;

import java.util.List;

import com.car.demo.entity.VehiculosEntity;
import com.car.demo.service.VehiculoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * VehiculosController
 */
@RestController
@RequestMapping(value = "/vehiculo")
public class VehiculosController {
    
    @Autowired
    VehiculoService vService;

    @RequestMapping(value = "/all/{idPersona}",method = RequestMethod.GET)
    public List<VehiculosEntity> getAll(@PathVariable String idPersona) {
        return vService.getAll(idPersona);
    }

    @RequestMapping (value="/add" , method = RequestMethod.POST)
    public VehiculosEntity save(@RequestBody VehiculosEntity vehiculo){
        return vService.save(vehiculo);
    }

    
    
}