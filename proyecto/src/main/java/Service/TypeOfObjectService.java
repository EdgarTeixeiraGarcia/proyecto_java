package Service;

import Entity.Entities.Object;
import Entity.Entities.TypeOfObject;
import IRepository.ITypeOfObjectRepository;
import IService.ITypeOfObjectService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TypeOfObjectService implements ITypeOfObjectService {

    @Autowired
    private ITypeOfObjectRepository repository;
    @Override
    public List<TypeOfObject> all() {
        return repository.findAll();
    }

    @Override
    public Optional<TypeOfObject> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public TypeOfObject save(TypeOfObject typeOfObject) {
        return repository.save(typeOfObject);
    }

    @Override
    public void update(Long id, TypeOfObject typeOfObject) {
        Optional<TypeOfObject> op = repository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else {
            TypeOfObject TypeOfObjectUpdate = op.get();
            TypeOfObjectUpdate.setName(typeOfObject.getName());

            repository.save(typeOfObject);
        }

    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
