package com.sorin.partial.update.entity;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PersonEntity {
    private Integer id;
    private String firstName;
    private String lastName;
    private String field;
    private List<String> list;
}
