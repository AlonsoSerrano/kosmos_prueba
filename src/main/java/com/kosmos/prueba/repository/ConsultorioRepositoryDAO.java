package com.kosmos.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kosmos.prueba.entity.ConsultorioEntity;

public interface ConsultorioRepositoryDAO extends JpaRepository<ConsultorioEntity, Integer>{


}
