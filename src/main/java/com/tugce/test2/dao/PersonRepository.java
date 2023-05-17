package com.tugce.test2.dao;

import com.tugce.test2.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {


    @Query(value = "{age:{$gte:?0}}")
    public Collection<Person> getAllPersonOlderThan(Integer age);

}