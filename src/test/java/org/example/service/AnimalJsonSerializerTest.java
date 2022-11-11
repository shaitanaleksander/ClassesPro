package org.example.service;

import org.example.model.Animal;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

public class AnimalJsonSerializerTest {

    private final AnimalJsonSerializer animalXmlSerializer = new AnimalJsonSerializer();
    private final Animal dog = new Animal("sharik", " 2015.03.11", 7, false, "doberman");
    private final Animal cat = new Animal("murka", " 2016.08.13", 6, false, "persian");

    // problem test ?

    @Test
    public void serializeTest(){
        animalXmlSerializer.serialize(dog);

    }
    @Test
    public void serializeListTest(){
        animalXmlSerializer.serialize(List.of(dog,cat));

    }

    // problem test ?

    @Test
    public void deserializeTest(){
        Optional<Animal> deserialize = animalXmlSerializer.deserialize();
        Assert.assertEquals(dog, deserialize.orElse(null));

    }

}
