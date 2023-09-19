package IService;

import Entity.Entities.Object;

import java.util.List;
import java.util.Optional;

public interface IObjectsService {

    // Método encargado de devolver la lista con todos los re
    List<Object> all();

    // Método encargado de devolver un registro por el ID
    Optional<Object> findById(Long id);

    // Método encargado de guardar los datos del registro
    Object save(Object objects);

    // Método encargado de modificar los datos del registro
    void update(Long id, Object objects);

    // Método encargado de elimiar un registro
    void delete(Long id);

    Integer getTotalObjectPerson(Long idPerson);
}
