package com.mrc.consultorio_ms_medico.resource;

import com.mrc.consultorio_ms_medico.model.dto.MedicoDTO;
import com.mrc.consultorio_ms_medico.model.record.MedicoRecord;
import com.mrc.consultorio_ms_medico.services.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoResource {
    @Autowired
    private MedicoService service;

    @PostMapping
    public ResponseEntity<MedicoRecord> save(@RequestBody MedicoDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(dto));
    }

    @GetMapping
    public ResponseEntity<List<MedicoDTO>> listAll() {
        return ResponseEntity.ok(service.listAll());
    }
}
