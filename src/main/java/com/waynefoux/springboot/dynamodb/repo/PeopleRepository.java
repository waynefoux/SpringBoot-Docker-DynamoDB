package com.waynefoux.springboot.dynamodb.repo;

import com.waynefoux.springboot.dynamodb.model.People;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@EnableScan
public interface PeopleRepository extends CrudRepository<People, String> {

    List<People> findByAge(String age);
}
