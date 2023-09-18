package IService;

import Entity.Entities.Objects;

import java.util.List;
import java.util.Optional;

public interface IObjectsService {

    // Método encargado de devolver la lista con todos los re
    List<Objects> all();

    // Método encargado de devolver un registro por el ID
    Optional<Objects> findById(Long id);

    // Método encargado de guardar los datos del registro
    Objects save(Objects objects);

    // Método encargado de modificar los datos del registro
    void update(Long id, Objects objects);

    // Método encargado de elimiar un registro
    void delete(Long id);
}
