package petclinicwebsite.services.map;

import petclinicwebsite.model.PetType;
import petclinicwebsite.model.Specialty;
import petclinicwebsite.model.Vet;
import org.springframework.stereotype.Service;
import petclinicwebsite.services.SpecialtyService;
import petclinicwebsite.services.VetService;

import java.util.Set;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetMapService(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Vet save(Vet object) {

        if (object.getSpecialtySet().size() > 0) {
            object.getSpecialtySet().forEach(specialty -> {
                if (specialty.getId() == null) {
                    Specialty savedSpecialty = specialtyService.save(specialty);
                    specialty.setId(savedSpecialty.getId());
                }
            });

        }
        return super.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }



}
