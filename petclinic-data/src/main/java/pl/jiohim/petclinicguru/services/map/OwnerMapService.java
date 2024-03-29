package pl.jiohim.petclinicguru.services.map;

import org.springframework.stereotype.Service;
import pl.jiohim.petclinicguru.model.Owner;
import pl.jiohim.petclinicguru.model.Pet;
import pl.jiohim.petclinicguru.services.OwnerService;
import pl.jiohim.petclinicguru.services.PetService;
import pl.jiohim.petclinicguru.services.PetTypeService;

import java.util.Set;


@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerMapService(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }


    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {

        if (object != null) {
            if (object.getPets() != null) {
                object.getPets().forEach(pet -> {
                    if (pet.getPetType() != null) {
                        pet.setPetType(petTypeService.save(pet.getPetType()));
                    } else throw new RuntimeException("Pet type is required ");

                    if(pet.getId()==null){
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save(object);
        } else return null;
    }


    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Owner object) {
        super.delete(object);

    }


    @Override
    public Owner findByLastName(String LastName) {
        return null;
    }
}
