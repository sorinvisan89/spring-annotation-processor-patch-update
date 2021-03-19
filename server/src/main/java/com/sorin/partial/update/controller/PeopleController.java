package com.sorin.partial.update.controller;

import com.sorin.partial.update.domain.PersonDTO;
import com.sorin.partial.update.domain.PersonDTOBuilder;
import com.sorin.partial.update.entity.PersonEntity;
import com.sorin.partial.update.repository.PeopleRepository;
import com.sorin.partial.update.utils.JsonNullableUtils;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/people")
public class PeopleController {

    private final PeopleRepository peopleRepository;

    @Autowired
    public PeopleController(final PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @PatchMapping("{id}")
    public ResponseEntity<Void> updatePerson(
            @PathVariable("id") final int id,
            @Valid @RequestBody final PersonDTOBuilder personPatchDTO) {

        final Optional<PersonEntity> personOptional = peopleRepository.getById(id);

        if (!personOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        final PersonEntity existing = personOptional.get();

//        JsonNullableUtils.changeIfPresent(personPatchDTO.getFirstName(), existing::setFirstName);
//        JsonNullableUtils.changeIfPresent(personPatchDTO.getLastName(), existing::setLastName);
//        JsonNullableUtils.changeIfPresent(personPatchDTO.getField(), existing::setField);
//        JsonNullableUtils.changeIfPresent(personPatchDTO.getList(), existing::setList);

        peopleRepository.save(existing);

        return ResponseEntity.ok().build();
    }
}
