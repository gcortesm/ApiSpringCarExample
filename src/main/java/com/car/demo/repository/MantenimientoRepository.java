package com.car.demo.repository;

import java.util.List;

import javax.transaction.Transactional;

import com.car.demo.entity.MantenimientoEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * MantenimientoRepository
 */
@Repository
public interface MantenimientoRepository extends JpaRepository<MantenimientoEntity,Integer> {   
   
   @Transactional
   @Modifying(clearAutomatically = true)
   @Query(value=" call asignarmecanico( ?1,?2,?3) ",nativeQuery = true)
   //@Query(value = "update mantenimientos set  mec_tipo_documento =?1 ,mec_documento =?2  where codigo=?3" , nativeQuery = true)
   public void setMecanicoMantenimiento (String tipoDoc,Integer documento ,Integer codigp);

    @Query (value="select * from mantenimientos where MEC_DOCUMENTO IS null",nativeQuery = true)
    public List<MantenimientoEntity> getAllUnAssignment();

    
}