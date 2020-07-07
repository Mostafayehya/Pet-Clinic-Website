package services.map;

import model.Pet;
import services.map.AbstractMapService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet,Long> {

    @Override
    Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    Pet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    void save(Long aLong, Pet object) {
        super.save(aLong, object);
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
