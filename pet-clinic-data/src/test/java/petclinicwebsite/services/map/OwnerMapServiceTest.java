package petclinicwebsite.services.map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import petclinicwebsite.model.Owner;

import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerMapServiceTest {

    private OwnerMapService ownerMapService;
    private final Long id = 1L;
    private final String lastName = "yahia";
    private final Owner owner = Owner.builder().id(id).lastName(lastName).build();

    @BeforeEach
    void setUp() {
        // Doing manual dependency injection here
        ownerMapService = new OwnerMapService(new PetTypeMapService(), new PetMapService());
        ownerMapService.save(owner);
    }

    @Test
    void findAll() {
        Set<Owner> ownerSet = ownerMapService.findAll();

        assertEquals(1, ownerSet.size());
    }

    @Test
    void findById() {
        Owner ownerOptional = ownerMapService.findById(1L);

        assertNotNull(ownerOptional);
        assertNotNull(ownerOptional.getId());
    }

    @Test
    void save() {
        Long id = 2L;
        ownerMapService.save(Owner.builder().id(id).lastName("Mansour").build());
        assertEquals(2, ownerMapService.findAll().size());

        assertEquals(id, ownerMapService.findById(id).getId());

    }

    @Test
    void deleteById() {
        ownerMapService.deleteById(1L);

        assertEquals(0, ownerMapService.findAll().size());
    }

    @Test
    void delete() {
        ownerMapService.delete(owner);

        assertEquals(0, ownerMapService.findAll().size());
    }

    @Test
    void findByLastName() {

        Owner owner = ownerMapService.findByLastName(lastName);

        assertNotNull(owner);

        assertEquals(lastName,owner.getLastName());
    }
}