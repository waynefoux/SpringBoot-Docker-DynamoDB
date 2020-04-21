package com.waynefoux.springboot;

import com.waynefoux.springboot.dynamodb.model.People;
import com.waynefoux.springboot.dynamodb.repo.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PeopleController {

    @Autowired
    PeopleService peopleService;

    @Autowired
    PeopleRepository peopleRepository;

    @RequestMapping(value = "/people", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> listPeople() {

        //System.out.println(peopleRepository.findByAge("35"));

        return peopleService.findAll();




    }

    @RequestMapping(value = "/people", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> addPerson(@RequestBody Person person) {
        //peopleService.addPerson(person);
        peopleRepository.save(new People("Wayne", "39"));

        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
