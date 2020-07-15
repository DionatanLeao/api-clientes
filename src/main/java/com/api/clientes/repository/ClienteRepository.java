package com.api.clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.clientes.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
