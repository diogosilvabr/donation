package com.springframework.donation.repository;

import com.springframework.donation.model.Usuario;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface UsuarioRepository extends Neo4jRepository<Usuario, Long> {
    // ADICIONAR MÉTODOS AQUI
}
