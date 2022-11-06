package pl.jiohim.petclinicguru.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.jiohim.petclinicguru.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner,Long> {

    Owner findByLastName(String lastName);
}
