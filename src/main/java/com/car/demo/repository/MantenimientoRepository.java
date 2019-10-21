package com.car.demo.repository;

import com.car.demo.entity.MantenimientoEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * MantenimientoRepository
 */
@Repository
public interface MantenimientoRepository extends JpaRepository<MantenimientoEntity,Integer> {   
}