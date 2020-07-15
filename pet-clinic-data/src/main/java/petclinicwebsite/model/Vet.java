package petclinicwebsite.model;

import java.util.Set;

public class Vet extends Person {

    private Set<Specialty> specialtySet;

    public Set<Specialty> getSpecialtySet() {
        return specialtySet;
    }

    public void setSpecialtySet(Set<Specialty> specialtySet) {
        this.specialtySet = specialtySet;
    }
}
