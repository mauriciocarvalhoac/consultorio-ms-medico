package com.mrc.consultorio_ms_medico.model.repositories;

import com.mrc.consultorio_ms_medico.model.entities.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
