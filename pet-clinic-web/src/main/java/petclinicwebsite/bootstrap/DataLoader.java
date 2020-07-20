package petclinicwebsite.bootstrap;

import petclinicwebsite.model.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import petclinicwebsite.services.*;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;
    private final VisitService visitService;
    public DataLoader(OwnerService ownerService, VetService vetService,
                      PetTypeService petTypeService, SpecialtyService specialtyService,
                      VisitService visitService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {

        int petsCount = petTypeService.findAll().size();

        if (petsCount == 0)
            loadData();

    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Specialty radiology = new Specialty();
        radiology.setDescription("Radiology");
        Specialty savedRadiology = specialtyService.save(radiology);

        Specialty surgery = new Specialty();
        radiology.setDescription("surgery");
        Specialty savedSurgery = specialtyService.save(surgery);


        Owner owner1 = new Owner();
        owner1.setFirstName("Mostafa");
        owner1.setLastName("Yahia");
        owner1.setAddress("16 BANI MANOUR");
        owner1.setCity("AWLAD SAKR");
        owner1.setTelephone("00201068867847");

        Pet mostafaPet = new Pet();
        mostafaPet.setPetType(savedDogPetType);
        mostafaPet.setName("HOWHOW");
        mostafaPet.setBirthDate(LocalDate.now());

        owner1.getPets().add(mostafaPet);
        mostafaPet.setOwner(owner1);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("GIGI");
        owner2.setLastName("Yahia");
        owner2.setAddress("15 MANSOURA");
        owner2.setCity("DAKAHLIA ");
        owner2.setTelephone("0020103442256");

        Pet gigiPet = new Pet();
        gigiPet.setPetType(savedCatPetType);
        gigiPet.setName("MEWOMEWO");
        gigiPet.setBirthDate(LocalDate.now());

        owner2.getPets().add(gigiPet);
        gigiPet.setOwner(owner2);

        ownerService.save(owner2);

        Visit visit1 = new Visit();
        visit1.setPet(mostafaPet);
        visit1.setDescription("Very Lazy Dog");
        visit1.setDate(LocalDate.now());

        visitService.save(visit1);

        System.out.println("Loaded Visits...");

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();

        vet1.setFirstName("Mohammed");
        vet1.setLastName("Khairy");
        vet1.getSpecialtySet().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();

        vet2.setFirstName("Belal");
        vet2.setLastName("Shehata");
        vet2.getSpecialtySet().add(savedSurgery);

        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }
}
