package com.mrc.consultorio_ms_medico.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoResource {

    @GetMapping
    public String get() {
        return "Agora";
    }
}
