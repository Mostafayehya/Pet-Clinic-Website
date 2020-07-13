package petclinicwebsite.bootstrap;

import petclinicwebsite.model.Owner;
import petclinicwebsite.model.Vet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import petclinicwebsite.services.OwnerService;
import petclinicwebsite.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Mostafa");
        owner1.setLastName("Yahia");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("GIGI");
        owner2.setLastName("Yahia");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();

        vet1.setFirstName("Mohammed");
        vet1.setLastName("Khairy");

        vetService.save(vet1);

        Vet vet2 = new Vet();

        vet2.setFirstName("Belal");
        vet2.setLastName("Shehata");

        vetService.save(vet2);

        System.out.println("Loaded vets...");

    }
}