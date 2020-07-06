package services;

import model.Pet;
import model.Vet;

import java.util.Set;

public interface PetService {


    Pet findById(Long id);

    void save(Pet pet);

    Set<Pet> findAll();
}
