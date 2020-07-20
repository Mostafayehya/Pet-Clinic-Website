package petclinicwebsite.repositories;

import org.springframework.data.repository.CrudRepository;
import petclinicwebsite.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
