package com.mrc.consultorio_ms_medico.services.impl;

import com.mrc.consultorio_ms_medico.model.dto.MedicoDTO;
import com.mrc.consultorio_ms_medico.model.entities.Medico;
import com.mrc.consultorio_ms_medico.model.record.MedicoRecord;
import com.mrc.consultorio_ms_medico.model.repositories.MedicoRepository;
import com.mrc.consultorio_ms_medico.services.MedicoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceImpl implements MedicoService {
    @Autowired
    private MedicoRepository repository;

    @Override
    public MedicoRecord save(MedicoDTO dto) {
        Medico obj = repository.save(toObj(dto));
        return new MedicoRecord(obj.getId(), obj.getNome());
    }

    @Override
    public List<MedicoDTO> listAll() {
        return repository.findAll().stream().map(this::toDto).collect(Collectors.toList());
    }

    public MedicoDTO toDto(Medico obj) {
        MedicoDTO dto = new MedicoDTO();
        BeanUtils.copyProperties(obj, dto);
        return dto;
    }

    public Medico toObj(MedicoDTO dto) {
        Medico obj = new Medico();
        BeanUtils.copyProperties(dto, obj);
        return obj;
    }
}
