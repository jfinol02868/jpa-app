package com.jpa.app.service;

import com.jpa.app.model.Persona;
import com.jpa.app.repository.PersonaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

    private final PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public List<Persona> getAllPersonas() {
        return personaRepository.findAll();
    }

    public Persona savePersona(Persona persona) {
        return personaRepository.save(persona);
    }

    public Optional<Persona> getPersonaById(Long id) {
        return personaRepository.findById(id);
    }

    public void deletePersona(Long id) {
        personaRepository.deleteById(id);
    }
}
