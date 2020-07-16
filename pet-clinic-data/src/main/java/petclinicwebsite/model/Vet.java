package petclinicwebsite.model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person {

    private Set<Specialty> specialtySet = new HashSet<>();


    public Set<Specialty> getSpecialtySet() {
        return specialtySet;
    }

    public void setSpecialtySet(Set<Specialty> specialtySet) {
        this.specialtySet = specialtySet;
    }
}
