package petclinicwebsite.repositories;

import org.springframework.data.repository.CrudRepository;
import petclinicwebsite.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
