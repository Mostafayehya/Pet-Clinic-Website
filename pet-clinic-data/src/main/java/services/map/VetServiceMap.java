package services.map;

import model.Vet;
import services.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public void save(Long aLong, Vet object) {
        super.save(aLong, object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void save(Vet object) {
        super.save(object.getId(), object);
    }
}
