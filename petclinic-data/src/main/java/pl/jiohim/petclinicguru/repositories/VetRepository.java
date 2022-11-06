package pl.jiohim.petclinicguru.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.jiohim.petclinicguru.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
