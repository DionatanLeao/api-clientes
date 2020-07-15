package com.api.clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.clientes.entity.Servico;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Integer> {

}
