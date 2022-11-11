package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Animal {

    private String nikName;
    private String dateOfArrival;
    private int age;
    private boolean gender;
    private String breed;

}
