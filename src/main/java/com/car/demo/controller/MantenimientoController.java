package com.car.demo.controller;

import java.util.List;

import com.car.demo.entity.MantenimientoEntity;
import com.car.demo.service.MantenimientoService;

import org.hibernate.engine.spi.ManagedEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * MantenimientoController
 */
@RestController
@RequestMapping(name = "/mantenimiento")
public class MantenimientoController {

    @Autowired
    private  MantenimientoService mService;

    @RequestMapping(value = "/all" ,method = RequestMethod.GET)
    public List<MantenimientoEntity> getAll(){
        return mService.getAll();
    }

    @RequestMapping (value  = "/add",method = RequestMethod.POST)
    public MantenimientoEntity save(@RequestBody MantenimientoEntity m){
        return mService.save(m);
    }

    @RequestMapping (value ="/edita", method= RequestMethod.POST)
    public MantenimientoEntity edit(@RequestBody MantenimientoEntity man){
        return mService.edit(man);
    }

}