package petclinicwebsite.services;

import petclinicwebsite.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
