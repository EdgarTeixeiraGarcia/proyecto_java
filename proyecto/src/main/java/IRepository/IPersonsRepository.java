package IRepository;

import Entity.Entities.Persons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonsRepository extends JpaRepository<Persons, Long> {
}
