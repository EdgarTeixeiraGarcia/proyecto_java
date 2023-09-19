package Service;

import Entity.Entities.Object;
import Entity.Entities.Person;
import IRepository.IPersonsRepository;
import IService.IPersonsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PersonService implements IPersonsService {

    @Autowired
    private IPersonsRepository repository;
    @Override
    public List<Person> all() {
        return repository.findAll();
    }

    @Override
    public Optional<Person> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Person save(Person persons) {
        return repository.save(persons);
    }

    @Override
    public void update(Long id, Person person) {

        Optional<Person> op = repository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else {
            Person personUpdate = op.get();
            personUpdate.setName(person.getName());
            personUpdate.setFirstSurname(person.getFirstSurname());
            personUpdate.setSecondSurname(person.getSecondSurname());
            personUpdate.setDni(person.getDni());
            personUpdate.setPhone(person.getPhone());
            personUpdate.setEmail(person.getEmail());
            personUpdate.setEmployee(person.getEmployee());

            repository.save(personUpdate);
        }

    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
