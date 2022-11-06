package pl.jiohim.petclinicguru.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.jiohim.petclinicguru.model.PetType;

public interface PetTypeRepository  extends CrudRepository<PetType,Long> {
}
