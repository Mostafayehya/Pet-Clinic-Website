package services;

import model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    void save(Owner owner);

    Set<Owner> findAll();
}
