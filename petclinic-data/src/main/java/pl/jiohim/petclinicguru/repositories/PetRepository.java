package pl.jiohim.petclinicguru.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.jiohim.petclinicguru.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
