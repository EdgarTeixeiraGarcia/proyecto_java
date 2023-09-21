package com.hackaboss.equipo4.IRepository.Entities;

import com.hackaboss.equipo4.Entity.Entities.Objects;
import com.hackaboss.equipo4.IRepository.Component.IBaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IObjectsRepository extends IBaseRepository<Objects, Long> {

    //Construir métodos personalizados - en este espacio se puede construir sql native.

    /**
     ** Mostrar lista de objetos.
     ***/
    /*@Query(value = "SELECT " +
            " * " +
            " FROM " +
            " objects" , nativeQuery = true)
    List<Object> selectAllObjects();*/

    /**
     ** Mostrar el total de objetos de una persona.
     ***/
    /*@Query(value = "SELECT " +
            " count " +
            " * " +
            " FROM " +
            " person_object " +
            " WHERE id_person = :idPerson ", nativeQuery = true)
    Integer totalObjectsPerson(@Param("personId") Long personId);*/

    /**
     ** Mostrar el total inventario dentro de la empresa.
     ***/
    /*@Query(value = "SELECT " +
            " count " +
            " * " +
            " FROM " +
            " Objects " +
            " WHERE State=1", nativeQuery = true)
    Integer totalItemsIn(@Param("objectsId") Long objectsId);*/


            /**
             ** Mostrar el total de objetos de un tipo dentro de la empresa.
             ***/
    /*@Query(value = "SELECT " +
            " count " +
            " * " +
            " FROM " +
            " Objects " +
            " WHERE typeId=tipo AND State=1", nativeQuery = true)
            Integer totalObjectsByType(@Param("typeId") Long typeId);*/
}