package petclinicwebsite.services.springdatajpa;

import org.hibernate.mapping.Any;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import petclinicwebsite.model.Owner;
import petclinicwebsite.repositories.OwnerRepository;
import petclinicwebsite.repositories.PetRepository;
import petclinicwebsite.repositories.PetTypeRepository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class OwnerJPAServiceTest {

    public static final String LAST_NAME = "Smith";
    public static final long ID = 1L;
    Owner OWNER ;
    @Mock
    PetRepository petRepository;
    @Mock
    OwnerRepository ownerRepository;
    @Mock
    PetTypeRepository petTypeRepository;

    //@InjectMocks
    OwnerJPAService ownerJPAService;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        ownerJPAService = new OwnerJPAService(petRepository, ownerRepository, petTypeRepository);
        OWNER = Owner.builder().id(ID).lastName(LAST_NAME).build();
    }

    @Test
    void findByLastName() {


        Owner returnOwner = Owner.builder().id(ID).lastName(LAST_NAME).build();

        when(ownerRepository.findByLastName(LAST_NAME)).thenReturn(returnOwner);

        Owner owner = ownerJPAService.findByLastName(LAST_NAME);

        assertEquals(LAST_NAME, owner.getLastName());

        verify(ownerRepository, times(1)).findByLastName(anyString());

    }

    @Test
    void findAll() {
        Set<Owner> ownerSet = new HashSet<>();
        ownerSet.add(Owner.builder().id(ID).lastName(LAST_NAME).build());
        ownerSet.add(Owner.builder().id(2L).lastName("yahia").build());

        when(ownerRepository.findAll()).thenReturn(ownerSet);

        Set<Owner> result = ownerJPAService.findAll();

        assertEquals(2, result.size());

        verify(ownerRepository, times(1)).findAll();
    }

    @Test
    void findById() {

        when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(OWNER));

        Owner resultOwner = ownerJPAService.findById(ID);

        assertEquals(ID, resultOwner.getId());
        verify(ownerRepository, times(1)).findById(ID);


    }

    @Test
    void findByIdNullable() {

        when(ownerRepository.findById(ID)).thenReturn(Optional.empty());

         assertNull(ownerJPAService.findById(ID));

        verify(ownerRepository, times(1)).findById(ID);


    }

    @Test
    void save() {

        Owner owner = Owner.builder().id(2L).lastName(LAST_NAME).build();

        when(ownerRepository.save(any())).thenReturn(owner);

        assertEquals(owner, ownerJPAService.save(owner));


        verify(ownerRepository, times(1)).save(owner);
    }

    @Test
    void delete() {

        ownerJPAService.delete(OWNER);
        verify(ownerRepository, times(1)).delete(OWNER);
    }

    @Test
    void deleteById() {
        ownerJPAService.deleteById(ID);
        verify(ownerRepository).deleteById(anyLong());
    }
}