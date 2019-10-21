package com.car.demo.controller;

import java.util.List;

import com.car.demo.entity.PersonaEntity;
import com.car.demo.service.PersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    PersonaService pService;

    @RequestMapping(value = "/all/{tipo}",method = RequestMethod.GET)
    public List<PersonaEntity> getAll(@PathVariable String tipo){
        return pService.getAll(tipo);
    }

    
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public PersonaEntity save(@RequestBody PersonaEntity persona){
        pService.addPersona(persona);
        return persona;
    }
}