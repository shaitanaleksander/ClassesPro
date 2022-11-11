package org.example.service;

import com.fasterxml.jackson.databind.json.JsonMapper;
import org.example.enums.Extension;
import org.example.model.Animal;
import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class AnimalSerializerTest {

    private final AnimalSerializer animalJsonSerializer = new AnimalSerializer(new JsonMapper(), Extension.JSON);
    private final Animal input = new Animal("sharik", "2015.03.11", 7, false, "doberman");

    // problem test ?

    @Test
    public void serializeTest(){
        animalJsonSerializer.serialize(input);
    }

    // problem test ?

    @Test
    public void deserializeTest(){
        Optional<Animal> deserialize = animalJsonSerializer.deserialize();
        Assert.assertEquals(input, deserialize.orElse(null));

    }
}
