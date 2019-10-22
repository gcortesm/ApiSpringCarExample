package  com.car.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.StoredProcedureQuery;

import com.car.demo.entity.PersonaEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * PersonaRepositoryStore
 */
@Repository
public class PersonaRepositoryStore {

    @Autowired
    private EntityManagerFactory emf;
    
    public void saveProcedure(PersonaEntity persona){
        EntityManager manager=emf.createEntityManager();
        StoredProcedureQuery procedure =manager.createNamedStoredProcedureQuery(PersonaEntity.SAVE_PROCEDURE);
        manager.getTransaction().begin();
        procedure.setParameter("tipo_documento",persona.getTipoDocumento());
        procedure.setParameter("documento", persona.getDocumento());
        procedure.setParameter("primer_nombre",persona.getPrimerNombre());
        procedure.setParameter("segundo_nombre", persona.getSegundoApellido());
        procedure.setParameter("primer_apellido",persona.getPrimerApellido());
        procedure.setParameter("segundo_apellido",persona.getSegundoApellido());
        procedure.setParameter("celular",persona.getCelular());
        procedure.setParameter("direccion",persona.getDireccion());
        procedure.setParameter("email",persona.getEmail());
        procedure.setParameter("estado",persona.getEstado());
        procedure.execute();
        manager.getTransaction().commit();
        
    }  

     public void editProcedure(PersonaEntity persona){
        EntityManager manager=emf.createEntityManager();
        StoredProcedureQuery procedure =manager.createNamedStoredProcedureQuery(PersonaEntity.SAVE_PROCEDURE);
        manager.getTransaction().begin();
        procedure.setParameter("tipo_documento",persona.getTipoDocumento());
        procedure.setParameter("documento", persona.getDocumento());
        procedure.setParameter("primer_nombre",persona.getPrimerNombre());
        procedure.setParameter("segundo_nombre", persona.getSegundoNombre() == null ? "" :persona.getSegundoNombre());
        procedure.setParameter("primer_apellido",persona.getPrimerApellido());
        procedure.setParameter("segundo_apellido",persona.getSegundoApellido() == null ? "" : persona.getSegundoApellido());
        procedure.setParameter("celular",persona.getCelular());
        procedure.setParameter("direccion",persona.getDireccion());
        procedure.setParameter("email",persona.getEmail());
        procedure.setParameter("estado",persona.getEstado());
        procedure.execute();
        manager.getTransaction().commit();
    }  
}