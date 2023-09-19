package IRepository;

import Entity.Entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonsRepository extends JpaRepository<Person, Long> {
}
