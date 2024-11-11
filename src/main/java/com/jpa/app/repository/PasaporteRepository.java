package com.jpa.app.repository;

import com.jpa.app.model.Pasaporte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasaporteRepository extends JpaRepository<Pasaporte, Long> {
}
