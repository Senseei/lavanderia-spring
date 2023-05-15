package com.projects.lavanderia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import com.projects.lavanderia.entities.Person;
import com.projects.lavanderia.dto.PersonDTO;
import com.projects.lavanderia.projections.PersonProjection;
import com.projects.lavanderia.repositories.PersonRepository;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    @Transactional(readOnly = true)
    public List<PersonDTO> findAll() {
        List<Person> result = personRepository.findAll();
        return result.stream().map(x -> new PersonDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public PersonDTO findByUsernameAndPassword(String username, String password) {
        Optional<PersonProjection> result = personRepository.findByUsernameAndPassword(username, password);
        if (result.isPresent()) return new PersonDTO(result.get());
        else return new PersonDTO();
    }
}