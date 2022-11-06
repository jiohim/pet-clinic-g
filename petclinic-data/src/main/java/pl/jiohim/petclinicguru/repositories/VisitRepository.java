package pl.jiohim.petclinicguru.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.jiohim.petclinicguru.model.Visit;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
