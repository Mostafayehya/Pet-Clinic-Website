package petclinicwebsite.services.map;

import org.springframework.stereotype.Service;
import petclinicwebsite.model.PetType;
import petclinicwebsite.services.PetTypeService;

import java.util.Set;

@Service
public class PetTypeMapService extends AbstractMapService<PetType,Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    void delete(PetType object) {
        super.delete(object);
    }
}
