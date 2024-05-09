package com.univesp.odontoservice.repository;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.univesp.odontoservice.models.AgendaEntity;

@Repository
public interface AgendaRepository extends JpaRepository<AgendaEntity, Long> {

    @Query(value = "SELECT * FROM tAgenda ta WHERE ta.Data = :data AND ta.ProfissionalID = :id", nativeQuery = true)
    AgendaEntity findAgendaEntity(Date data, int id);

}
