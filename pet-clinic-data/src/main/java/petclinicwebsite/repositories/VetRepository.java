package petclinicwebsite.repositories;

import org.springframework.data.repository.CrudRepository;
import petclinicwebsite.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
