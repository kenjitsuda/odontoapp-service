package com.univesp.odontoservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.univesp.odontoservice.models.ProfissionalEntity;

@Repository
public interface ProfissionalRepository extends JpaRepository<ProfissionalEntity, Long> {

    @Query(value = "SELECT * FROM tProfissional", nativeQuery = true)
    List<ProfissionalEntity> findProfissionais();
    
}
