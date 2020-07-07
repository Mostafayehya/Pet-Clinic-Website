package services.map;

import model.Owner;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> {

    @Override
    Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    Owner findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    void save(Long aLong, Owner object) {
        super.save(aLong, object);
    }

    @Override
    void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    void delete(Owner object) {
        super.delete(object);
    }
}
