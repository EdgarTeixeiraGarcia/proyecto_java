package Service;

import Entity.Entities.Objects;
import IRepository.IObjectsRepository;
import IService.IObjectsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ObjectsService implements IObjectsService {

    @Autowired
    private IObjectsRepository repository;
    @Override
    public List<Objects> all() {
        return repository.findAll();
    }

    @Override
    public Optional<Objects> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Objects save(Objects objects) {
        return null;
    }

    @Override
    public void update(Long id, Objects objects) {

    }

    @Override
    public void delete(Long id) {

    }
}
