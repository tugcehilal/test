package com.tugce.test2.service;

import com.tugce.test2.dao.PersonDao;
import com.tugce.test2.dao.PetDao;
import com.tugce.test2.model.Person;
import com.tugce.test2.model.Pet;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class PetService {

    private final PetDao petDao;

    public PetService(PetDao petDao) {
        this.petDao = petDao;
    }

   public Pet insertPetData(Pet person) {
        return petDao.insertPetData(person);
    }

    public Collection<Pet> getAllPersonInformation() {
        return petDao.getAllPetInformation();
    }

    public Optional<Pet> getPersonInformationUsingId(String id) {
        return petDao.getPetInformationById(id);
    }

    public void updatePersonUsingId(String id, Pet person) {
        petDao.updatePetUsingId(id, person);
    }

    public void deletePersonUsingId(String id) {
        petDao.deletePetUsingId(id);
    }

}
