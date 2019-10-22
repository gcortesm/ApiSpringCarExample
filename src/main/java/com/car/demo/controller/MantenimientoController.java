package com.car.demo.controller;

import java.util.List;

import com.car.demo.entity.MantenimientoEntity;
import com.car.demo.entity.PersonaEntity;
import com.car.demo.service.MantenimientoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/mante")
public class MantenimientoController {

    @Autowired
    MantenimientoService mService;

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

    @RequestMapping (value ="/asignar/{idMante}", method= RequestMethod.POST)
    public void asignar(@RequestBody PersonaEntity mec,@PathVariable int idMante){
        mService.setMecanicoMantenimiento(mec.getDocumento(), mec.getTipoDocumento(), idMante);
    }

    @RequestMapping (value ="/sinasignar", method= RequestMethod.GET)
    public List<MantenimientoEntity> sinAsignar(){
       return  mService.getAllUnAssignment();
        //return mService.edit(man);
    }

}