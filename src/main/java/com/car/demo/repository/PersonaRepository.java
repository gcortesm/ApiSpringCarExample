package com.car.demo.repository;

import java.util.List;
import java.util.Optional;

import com.car.demo.entity.PersonaEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends JpaRepository<PersonaEntity,Integer>{
     @Query(value = "select * from mecanicos where tipo_documento=?1 and documento=?2",nativeQuery = true)
     public Optional<PersonaEntity> findByIds(String tipo,String documento);

     @Query (value ="SELECT mec.TIPO_DOCUMENTO,mec.DOCUMENTO,mec.PRIMER_NOMBRE,mec.SEGUNDO_NOMBRE,mec.PRIMER_APELLIDO,mec.SEGUNDO_APELLIDO,mec.CELULAR,mec.DIRECCION,mec.EMAIL,mec.ESTADO FROM MECANICOS mec" +
                  "  left JOIN  MANTENIMIENTOS MANT  ON mec.TIPO_DOCUMENTO =mant.MEC_TIPO_DOCUMENTO " +
                    "		  AND mec.DOCUMENTO=mant.MEC_DOCUMENTO  and "+
                    " mant.FECHA BETWEEN (select trunc(sysdate) - (to_number(to_char(sysdate,'DD')) - 1) from dual) AND SYSDATE " +
                  "  LEFT JOIN (SELECT sum(sxm.tiempo_estimado) suma,sxm.cod_mantenimiento FROM SERVICIOS_X_MANTENIMIENTOS sxm GROUP BY sxm.cod_mantenimiento)  sub " +
				"            ON sub.cod_mantenimiento=mant.CODIGO " +
                  "  LEFT JOIN (SELECT sum(rxm.tiempo_estimado) suma,rxm.cod_mantenimiento FROM REPUESTOS_X_MANTENIMIENTOS rxm GROUP BY rxm.cod_mantenimiento)  subre " +
        "            ON subre.cod_mantenimiento=mant.CODIGO "+
          "  where mec.ESTADO='T'"+
                  "  GROUP BY mec.TIPO_DOCUMENTO,mec.DOCUMENTO,mec.PRIMER_NOMBRE,mec.SEGUNDO_NOMBRE,mec.PRIMER_APELLIDO,mec.SEGUNDO_APELLIDO,mec.CELULAR,mec.DIRECCION,mec.EMAIL,mec.ESTADO " +
                  "  ORDER BY sum(COALESCE(SUB.suma,0)) + sum(COALESCE(subre.suma,0 )) ASC " +
                  "  FETCH FIRST 10 ROWS ONLY ",nativeQuery = true)
     public List<PersonaEntity> findTenFirst();


}