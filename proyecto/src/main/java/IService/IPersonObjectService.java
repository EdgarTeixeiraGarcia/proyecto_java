package IService;

import Entity.Entities.PersonObject;

import java.util.List;
import java.util.Optional;

public interface IPersonObjectService {

    // Método encargado de devolver la lista con todos los re
    List<PersonObject> all();

    // Método encargado de devolver un registro por el ID
    Optional<PersonObject> findById(Long id);

    // Método encargado de guardar los datos del registro
    PersonObject save(PersonObject personObject);

    // Método encargado de modificar los datos del registro
    void update(Long id, PersonObject personObject);

    // Método encargado de elimiar un registro
    void delete(Long id);
}
