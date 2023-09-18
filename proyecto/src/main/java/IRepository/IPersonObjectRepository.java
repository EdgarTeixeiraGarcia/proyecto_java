package IRepository;

import Entity.Entities.PersonObject;
import org.aspectj.weaver.patterns.PerObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonObjectRepository extends JpaRepository<PersonObject, Long> {
}
