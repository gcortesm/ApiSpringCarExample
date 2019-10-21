package com.car.demo.repository;

import java.util.List;

import com.car.demo.entity.VehiculosEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface VehiculoRepository extends JpaRepository<VehiculosEntity,Integer> {

    @Query(value = "select * from vehiculos where fk_cod_cliente =?1 ",nativeQuery = true)
    public List<VehiculosEntity> findAllByPersona (String idPersona);
    
}