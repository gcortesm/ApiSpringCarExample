package com.car.demo.controller;

import java.util.List;

import com.car.demo.entity.PersonaEntity;
import com.car.demo.service.PersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


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
    public ResponseEntity<?> save(@RequestBody PersonaEntity persona){
        if(pService.addPersona(persona)){
            return new ResponseEntity<>(null, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}