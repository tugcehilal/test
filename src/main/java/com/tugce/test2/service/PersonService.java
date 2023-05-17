package com.tugce.test2.service;

import com.tugce.test2.dao.PersonDao;
import com.tugce.test2.model.Person;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class PersonService {

    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public Person insertPersonData(Person person) {
        return personDao.insertPersonData(person);
    }

    public Collection<Person> getAllPersonInformation() {
        return personDao.getAllPersonInformation();
    }

    public Collection<Person> getAllPersonInformationOlderThan(String age) {
        return personDao.getAllPersonInformationOlderThan(Integer.valueOf(age));
    }

    public Optional<Person> getPersonInformationUsingId(String id) {
        return personDao.getPersonInformationById(id);
    }

    public void updatePersonUsingId(String id, Person person) {
        personDao.updatePersonUsingId(id, person);
    }

    public void deletePersonUsingId(String id) {
        personDao.deletePersonUsingId(id);
    }

}
