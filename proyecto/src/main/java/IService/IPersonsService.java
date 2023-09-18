package IService;

import Entity.Entities.Persons;

import java.util.List;
import java.util.Optional;

public interface IPersonsService {
    // Método encargado de devolver la lista con todos los re
    List<Persons> all();

    // Método encargado de devolver un registro por el ID
    Optional<Persons> findById(Long id);

    // Método encargado de guardar los datos del registro
    Persons save(Persons persons);

    // Método encargado de modificar los datos del registro
    void update(Long id, Persons persons);

    // Método encargado de elimiar un registro
    void delete(Long id);
}
