package petclinicwebsite.services.map;

import org.springframework.stereotype.Service;
import petclinicwebsite.model.Specialty;
import petclinicwebsite.services.SpecialtyService;

import java.util.Set;

@Service
public class SpecialtyMapService extends AbstractMapService<Specialty,Long> implements SpecialtyService {

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    void delete(Specialty object) {
        super.delete(object);
    }
}
