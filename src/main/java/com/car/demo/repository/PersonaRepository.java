package com.car.demo.repository;

import java.util.List;

import com.car.demo.entity.PersonaEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * PersonaRepository
 */
@Repository
public interface PersonaRepository extends JpaRepository<PersonaEntity,Integer>{
}