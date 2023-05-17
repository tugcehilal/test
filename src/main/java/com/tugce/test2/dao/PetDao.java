package com.tugce.test2.dao;

import com.tugce.test2.model.Person;
import com.tugce.test2.model.Pet;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.Optional;

@Component
public class PetDao {
    private final PetRepository petRepository;

    public PetDao(PetRepository personRepository) {
        this.petRepository = personRepository;
    }

    public Pet insertPetData(Pet person) {
        return petRepository.insert(person);
    }

    public Collection<Pet> getAllPetInformation() {
        return petRepository.findAll();
    }

    public Optional<Pet> getPetInformationById(String id) {
        return petRepository.findById(id);
    }

    public Pet updatePetUsingId(String id, Pet pet) {
        Optional<Pet> findPersonQuery = petRepository.findById(id);
        Pet tmpPet = findPersonQuery.get();
        tmpPet.setId(pet.getId());
        tmpPet.setName(pet.getName());
        return petRepository.save(tmpPet);
    }

    public void deletePetUsingId(String id) {
        try {
            petRepository.deleteById(id);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

}
