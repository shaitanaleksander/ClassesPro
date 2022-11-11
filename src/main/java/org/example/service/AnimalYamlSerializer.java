package org.example.service;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import org.example.model.Animal;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

public class AnimalYamlSerializer {


    public void serialize(Animal animal) {

        YAMLMapper xmlMapper = new YAMLMapper();

        try {
            xmlMapper.writeValue(new File("src/main/resources/animal.yaml"), animal);
        } catch (IOException e) {
            System.out.println("cannot create file !");
            e.printStackTrace();
        }
    }

    public Optional<Animal> deserialize() {

        YAMLMapper xmlMapper = new YAMLMapper();
        try {
            return Optional.of( xmlMapper.readValue(new File("src/main/resources/animal.yaml"), Animal.class));
        } catch (IOException e) {
            System.out.println("Cannot read file");
            e.printStackTrace();
            return Optional.empty();
        }
    }

}
