package com.univesp.odontoservice.repository;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.univesp.odontoservice.models.ConsultaEntity;

@Repository
public interface ConsultaRepository extends JpaRepository<ConsultaEntity, Long> {
    
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO tConsulta (ProfissionalID, Paciente, Data, Horario) VALUES (:profissionalID, :paciente, :data, :horario)", nativeQuery = true)
    void insertConsulta(int profissionalID, String paciente, Date data, String horario);

}
