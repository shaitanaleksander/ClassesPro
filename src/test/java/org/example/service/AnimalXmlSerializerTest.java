package org.example.service;

import org.example.model.Animal;
import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class AnimalXmlSerializerTest {

    private final AnimalXmlSerializer animalXmlSerializer = new AnimalXmlSerializer();
    private final Animal input = new Animal("sharik", " 2015.03.11", 7, false, "doberman");

    // problem test ?

    @Test
    public void serializeTest(){
        animalXmlSerializer.serialize(input);

    }

    // problem test ?

    @Test
    public void deserializeTest(){
        Optional<Animal> deserialize = animalXmlSerializer.deserialize();
        Assert.assertEquals(input, deserialize.orElse(null));

    }
}
