package com.api.clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.clientes.entity.ServicoPrestado;

@Repository
public interface ServicoPrestadoRepository extends JpaRepository<ServicoPrestado, Integer> {

}
