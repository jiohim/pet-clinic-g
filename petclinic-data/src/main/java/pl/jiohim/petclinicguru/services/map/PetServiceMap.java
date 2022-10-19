package pl.jiohim.petclinicguru.services.map;


import org.springframework.stereotype.Service;
import pl.jiohim.petclinicguru.model.Pet;
import pl.jiohim.petclinicguru.services.PetService;
import java.util.Set;

@Service

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }


    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Pet object) {
        super.delete(object);

    }
}
