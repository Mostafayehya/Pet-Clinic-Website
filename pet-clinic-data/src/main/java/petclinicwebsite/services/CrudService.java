package petclinicwebsite.services;

import petclinicwebsite.model.PetType;

import java.util.Set;

public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);
}
