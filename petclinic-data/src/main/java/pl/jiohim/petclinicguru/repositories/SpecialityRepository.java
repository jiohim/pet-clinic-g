package pl.jiohim.petclinicguru.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.jiohim.petclinicguru.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality,Long> {
}
