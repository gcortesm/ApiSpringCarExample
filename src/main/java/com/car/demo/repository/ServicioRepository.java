package com.car.demo.repository;

import com.car.demo.entity.ServiciosEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * ServicioRepository
 */
@Repository
public interface ServicioRepository extends JpaRepository<ServiciosEntity,Integer> {    
}