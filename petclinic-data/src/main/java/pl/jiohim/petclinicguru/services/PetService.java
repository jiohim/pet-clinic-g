package pl.jiohim.petclinicguru.services;



import pl.jiohim.petclinicguru.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet vet);

    Set<Pet> findAll();

}
