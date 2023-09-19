package Service;

import Entity.Entities.Object;
import Entity.Entities.PersonObject;
import IRepository.IPersonObjectRepository;
import IService.IPersonObjectService;
import IService.IPersonsService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;
import java.util.List;
import java.util.Optional;

public class PersonObjectService implements IPersonObjectService {

    @Autowired
    private IPersonObjectRepository repository;

    @Override
    public List<PersonObject> all() {
        return repository.findAll();
    }

    @Override
    public Optional<PersonObject> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public PersonObject save(PersonObject personObject) {
        return repository.save(personObject);
    }

    @Override
    public void update(Long id, PersonObject personObject) {

        Optional<PersonObject> op = repository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else {
            PersonObject personObjectUpdate = op.get();
            personObjectUpdate.setTime(personObject.getTime());
            personObjectUpdate.setRegisterType(personObject.getRegisterType());
            personObjectUpdate.setError(personObject.getError());

            repository.save(personObjectUpdate);
        }

    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
