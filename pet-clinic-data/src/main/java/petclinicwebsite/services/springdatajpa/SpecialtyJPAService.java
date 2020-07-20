package petclinicwebsite.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import petclinicwebsite.model.Specialty;
import petclinicwebsite.repositories.SpecialtyRepository;
import petclinicwebsite.services.SpecialtyService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialtyJPAService implements SpecialtyService {

    public SpecialtyJPAService(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    private final SpecialtyRepository specialtyRepository;

    @Override
    public Set<Specialty> findAll() {
        Set<Specialty> specialtySet = new HashSet<>();
        specialtyRepository.findAll().forEach(specialtySet::add);
        return specialtySet;
    }

    @Override
    public Specialty findById(Long aLong) {
        return specialtyRepository.findById(aLong).orElse(null);
    }

    @Override
    public Specialty save(Specialty object) {
        return specialtyRepository.save(object);
    }

    @Override
    public void delete(Specialty object) {
        specialtyRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialtyRepository.deleteById(aLong);
    }
}
