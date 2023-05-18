package com.springframework.donation.repository;

import com.springframework.donation.model.Servicos;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ServicoRepository extends Neo4jRepository<Servicos, Long> {
    // Métodos personalizados podem ser adicionados aqui, se necessário
}
