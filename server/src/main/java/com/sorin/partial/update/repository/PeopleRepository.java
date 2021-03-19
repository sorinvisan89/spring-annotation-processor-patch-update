package com.sorin.partial.update.repository;

import com.sorin.partial.update.entity.PersonEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class PeopleRepository {
    private static final ArrayList<PersonEntity> people = new ArrayList<>();

    public PeopleRepository() {
        final PersonEntity person1 = new PersonEntity(
                1,
                "Some",
                "Name",
                "field1",
                new ArrayList<>(Collections.singletonList("value"))
        );

        people.addAll(new ArrayList<>(Collections.singletonList(person1)));
    }

    public Optional<PersonEntity> getById(final int id) {
        return people.stream()
                .filter(p -> p.getId() == id)
                .findFirst();
    }

    public void save(final PersonEntity person) {
        //NOP
    }
}
