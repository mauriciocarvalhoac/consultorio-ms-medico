package com.mrc.consultorio_ms_medico.services;

import com.mrc.consultorio_ms_medico.model.dto.MedicoDTO;
import com.mrc.consultorio_ms_medico.model.record.MedicoRecord;

public interface MedicoService {
    MedicoRecord save(MedicoDTO dto);
}
