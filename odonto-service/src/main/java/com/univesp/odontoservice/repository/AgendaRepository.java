package com.univesp.odontoservice.repository;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.univesp.odontoservice.models.AgendaEntity;

@Repository
public interface AgendaRepository extends JpaRepository<AgendaEntity, Long> {

    @Query(value = "SELECT * FROM tAgenda ta WHERE ta.Data = :data AND ta.ProfissionalID = :id", nativeQuery = true)
    AgendaEntity findAgendaEntity(Date data, int id);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO tAgenda (ProfissionalID, Data, Agenda) VALUES (:profissionalID, :data, :agenda)", nativeQuery = true)
    void insertAgenda(int profissionalID, Date data, String agenda);

    @Modifying
    @Transactional
    @Query(value = "UPDATE tAgenda SET Agenda = :agenda WHERE Data = :data AND ProfissionalID = :profissionalID", nativeQuery = true)
    void updateAgenda(int profissionalID, Date data, String agenda);
}
