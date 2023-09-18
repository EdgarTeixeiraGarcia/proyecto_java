package IService;

import Entity.Entities.Objects;
import Entity.Entities.TypeOfObject;

import java.util.List;
import java.util.Optional;

public interface ITypeOfObjectService {
    // Método encargado de devolver la lista con todos los re
    List<TypeOfObject> all();

    // Método encargado de devolver un registro por el ID
    Optional<TypeOfObject> findById(Long id);

    // Método encargado de guardar los datos del registro
    TypeOfObject save(TypeOfObject typeOfObject);

    // Método encargado de modificar los datos del registro
    void update(Long id, TypeOfObject typeOfObject);

    // Método encargado de elimiar un registro
    void delete(Long id);
}
