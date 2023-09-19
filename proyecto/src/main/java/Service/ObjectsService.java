package Service;

import Entity.Entities.Object;
import IRepository.IObjectsRepository;
import IService.IObjectsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ObjectsService implements IObjectsService {

    @Autowired
    private IObjectsRepository repository;
    @Override
    public List<Object> all() {
        return repository.findAll();
    }

    @Override
    public Optional<Object> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Object save(Object objects) {
        return repository.save(objects);
    }

    @Override
    public void update(Long id, Object object) {
        //op es el objeto que va validar si existe un registro con el id que llega por parametro [id]
        Optional<Object> op = repository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else {
            Object objectUpdate = op.get();
            objectUpdate.setDescription(object.getDescription());
            objectUpdate.setReason(object.getReason());
            objectUpdate.setState(object.getState());

            repository.save(objectUpdate);
        }

    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    /**
     * @param idPerson id de la persona
     */
    @Override
    public Integer getTotalObjectPerson(Long idPerson) {
        return repository.totalObjectsPerson(idPerson);
    }


}
