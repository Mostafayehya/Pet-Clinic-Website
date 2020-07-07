package services.map;

import model.Vet;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> {
    @Override
    Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    Vet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    void save(Long aLong, Vet object) {
        super.save(aLong, object);
    }

    @Override
    void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    void delete(Vet object) {
        super.delete(object);
    }
}
