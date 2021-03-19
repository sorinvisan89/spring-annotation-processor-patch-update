package com.sorin.partial.update.domain;

public class PersonDTOBuilder {

    private PersonDTO object = new PersonDTO();

    public PersonDTO build() {
        return object;
    }

    public PersonDTOBuilder setField(java.lang.String value) {
        object.setField(value);
        return this;
    }

}
