package com.mrc.consultorio_ms_medico.resource;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mrc.consultorio_ms_medico.model.dto.MedicoDTO;
import com.mrc.consultorio_ms_medico.model.record.MedicoRecord;
import com.mrc.consultorio_ms_medico.services.MedicoService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MedicoResource.class)
public class MedicoResourceTests {
    @MockitoBean
    private MedicoService service;
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;


    @Test
    void save() throws Exception {
        MedicoDTO dto = new MedicoDTO(1L, "Mauricio Carvalho", "03140222521", "mauriciocarvalhoac@gmail.com", "71988417444");
        MedicoRecord record = new MedicoRecord(1L, "Mauricio Carvalho");

        Mockito.when(service.save(dto)).thenReturn(record);

        mockMvc.perform(post("/medicos")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(dto)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").value(1L))
                .andExpect(jsonPath("$.nome").value("Mauricio Carvalho"));
    }


}
