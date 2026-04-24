package com.mrc.consultorio_ms_medico.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MedicoDTO {
    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String celular;
}
