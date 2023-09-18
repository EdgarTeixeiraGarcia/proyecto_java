package IRepository;

import Entity.Entities.TypeOfObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITypeOfObjectRepository extends JpaRepository<TypeOfObject, Long> {
}
