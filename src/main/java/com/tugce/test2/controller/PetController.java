package com.tugce.test2.controller;

import com.tugce.test2.model.Person;
import com.tugce.test2.model.Pet;
import com.tugce.test2.service.PersonService;
import com.tugce.test2.service.PetService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pet")
public class PetController {

    private final PetService petService;
    public PetController(PetService petService) {
        this.petService = petService;
    }

    @PostMapping
    public Pet create(@RequestBody Pet pet) {
        return petService.insertPetData(pet);
    }
}
