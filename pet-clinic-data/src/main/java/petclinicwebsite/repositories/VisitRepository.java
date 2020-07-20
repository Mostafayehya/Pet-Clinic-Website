package petclinicwebsite.repositories;

import org.springframework.data.repository.CrudRepository;
import petclinicwebsite.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
