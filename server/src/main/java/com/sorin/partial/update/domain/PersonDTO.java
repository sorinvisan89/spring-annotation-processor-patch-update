package com.sorin.partial.update.domain;

import com.sorin.annotation.processor.BuilderProperty;
import java.util.List;

public class PersonDTO {

    private String firstName;

    private String lastName;

    private String field;

    private List<String> list;

    @BuilderProperty
    public void setField(final String field) {
        this.field = field;
    }

    @BuilderProperty
    public void setLastName(final String field) {
        this.lastName = lastName;
    }
}
