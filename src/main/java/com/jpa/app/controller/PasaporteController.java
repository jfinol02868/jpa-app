package com.jpa.app.controller;

import com.jpa.app.model.Pasaporte;
import com.jpa.app.service.PasaporteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pasaporte")
public class PasaporteController {

    private final PasaporteService pasaporteService;

    public PasaporteController(PasaporteService pasaporteService) {
        this.pasaporteService = pasaporteService;
    }

    @GetMapping
    public List<Pasaporte> getAllPersonas() {
        return pasaporteService.getAllPasaportes();
    }

    @PostMapping
    public Pasaporte savePersona(@RequestBody Pasaporte pasaporte) {
        return pasaporteService.savePasaporte(pasaporte);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pasaporte> getPersonaById(@PathVariable Long id) {
        return pasaporteService.getPasaporteById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePersona(@PathVariable Long id) {
        pasaporteService.deletePasaporte(id);
        return ResponseEntity.noContent().build();
    }
}
