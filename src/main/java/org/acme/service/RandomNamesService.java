package org.acme.service;

import java.util.ArrayList;
import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RandomNamesService {

    public RandomNamesService() {

    }

    public List<String> getRandomNames() {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Paul");
        names.add("George");
        names.add("Ringo");
        return names;
    }
}
