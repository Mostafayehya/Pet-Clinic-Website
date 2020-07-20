package petclinicwebsite.repositories;

import org.springframework.data.repository.CrudRepository;
import petclinicwebsite.model.Specialty;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
