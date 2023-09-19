package IRepository;

import Entity.Entities.Object;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IObjectsRepository extends JpaRepository<Object, Long> {

    //Construir métodos personalizados - en este espacio se puede construir sql native.

    /**
     ** Mostrar lista de objetos.
     ***/
    @Query(value = "SELECT " +
            " * " +
            "FROM " +
            " objects" , nativeQuery = true)
    List<Object> selectAllObjects();

    /**
     ** Mostrar el total de objetos de una persona.
     ***/
    @Query(value = "SELECT " +
            " count " +
            " * " +
            " FROM " +
            " person_object " +
            " WHERE id_person = :idPerson ", nativeQuery = true)
    Integer totalObjectsPerson(@Param("idPerson") Long idPerson);

}
