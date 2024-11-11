package com.jpa.app.service;

import com.jpa.app.model.Pasaporte;
import com.jpa.app.repository.PasaporteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PasaporteService {

    private final PasaporteRepository pasaporteRepository;

    public PasaporteService(PasaporteRepository pasaporteRepository) {
        this.pasaporteRepository = pasaporteRepository;
    }

    public List<Pasaporte> getAllPasaportes() {
        return pasaporteRepository.findAll();
    }

    public Pasaporte savePasaporte(Pasaporte pasaporte) {
        return pasaporteRepository.save(pasaporte);
    }

    public Optional<Pasaporte> getPasaporteById(Long id) {
        return pasaporteRepository.findById(id);
    }

    public void deletePasaporte(Long id) {
        pasaporteRepository.deleteById(id);
    }
}
