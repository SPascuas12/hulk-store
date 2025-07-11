package com.sergiopascuas.hulk_store.repository;

import com.sergiopascuas.hulk_store.model.NombreRol;
import com.sergiopascuas.hulk_store.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
    Optional<Rol> findByNombre(NombreRol nombre);
}

