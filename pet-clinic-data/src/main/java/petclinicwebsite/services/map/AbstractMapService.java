package petclinicwebsite.services.map;

import petclinicwebsite.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());

    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {
        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }
           return map.put(object.getId(), object);

        } else {
            throw new RuntimeException("Can not save a null object");
        }
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(idtEntry -> idtEntry.getValue().equals(object));
    }

    private Long getNextId() {

        Long nextId = null;
        try {
            nextId = Collections.max(map.keySet()) + 1;
        } catch (Exception e) {
            nextId = 1L;
        }

        return nextId;
    }
}
