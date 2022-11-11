package org.example.service;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.example.model.Animal;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

public class AnimalXmlSerializer {


    public void serialize(Animal animal) {

        XmlMapper xmlMapper = new XmlMapper();

        try {
            xmlMapper.writeValue(new File("src/main/resources/animal.xml"), animal);
        } catch (IOException e) {
            System.out.println("cannot create file !");
            e.printStackTrace();
        }
    }

    public Optional<Animal> deserialize() {
        XmlMapper xmlMapper = new XmlMapper();

        try {
            return Optional.of( xmlMapper.readValue(new File("src/main/resources/animal.xml"), Animal.class));
        } catch (IOException e) {
            System.out.println("Cannot read file");
            e.printStackTrace();
            return Optional.empty();
        }
    }
}
