package com.car.demo.controller;

import java.util.List;

import com.car.demo.entity.PersonaEntity;
import com.car.demo.service.PersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<PersonaEntity> getAll(){
        return pService.getAll();
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public PersonaEntity save(@RequestBody PersonaEntity persona){
        pService.addPersona(persona);
        return persona;
    }

    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    public PersonaEntity edit(@RequestBody PersonaEntity persona){
        pService.editPersona(persona);
        return persona;
    }

    @RequestMapping(value = "/ten",method = RequestMethod.GET)
    public List<PersonaEntity> findTenFirst(){
        return pService.findTenFirst();
    }
}