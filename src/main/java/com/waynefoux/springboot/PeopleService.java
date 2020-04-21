package com.waynefoux.springboot;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PeopleService {

    private final ArrayList<Person> people;

    public PeopleService() {
        people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public List<Person> findAll() {
        return people;
    }

}

