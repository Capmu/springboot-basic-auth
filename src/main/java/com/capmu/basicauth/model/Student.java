package com.capmu.basicauth.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {

    private long id;
    private String firstName;
    private String lastName;
}
