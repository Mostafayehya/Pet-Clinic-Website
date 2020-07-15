package petclinicwebsite.services.map;

import petclinicwebsite.model.Pet;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> {

    @Override
    Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    Pet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    Pet save(Pet object) {
       return super.save(object);
    }

    @Override
    void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    void delete(Pet object) {
        super.delete(object);
    }
}
