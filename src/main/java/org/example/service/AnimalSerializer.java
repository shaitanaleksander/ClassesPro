package org.example.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.enums.Extension;
import org.example.model.Animal;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

public class AnimalSerializer {

    private final ObjectMapper mapper;
    private final Extension extension;
    private final String path  = "src/main/resources/animal";

    public AnimalSerializer(ObjectMapper mapper, Extension extension) {
        this.mapper = mapper;
        this.extension = extension;
    }

    public void serialize(Animal animal) {
        try {
            mapper.writeValue(new File(path + extension), animal);
        } catch (IOException e) {
            System.out.println("cannot create file !");
            e.printStackTrace();
        }
    }

    public Optional<Animal> deserialize() {
        try {
            return Optional.of(mapper
                    .readValue(new File(path+ extension), Animal.class));
        } catch (IOException e) {
            System.out.println("Cannot read file");
            e.printStackTrace();
            return Optional.empty();
        }
    }
}
