package br.com.sistema.desenvolvimento.web;

import br.com.sistema.desenvolvimento.dtos.PersonDTO;
import br.com.sistema.desenvolvimento.service.IPersonService;
import br.com.sistema.desenvolvimento.service.PersonService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
public class WebControllerTest {

    @InjectMocks
    WebController webController;

    @Mock
    PersonService personService;

    private MockMvc mockMvc;

    private PersonDTO personDTO;

    private String toJson;

    private String url;

    private ObjectMapper objectMapper =new ObjectMapper();

    @BeforeEach
    void setup() throws JsonProcessingException {
        mockMvc = MockMvcBuilders.standaloneSetup(webController).alwaysDo(print()).build();
        url = "/person";
        personDTO = PersonDTO.builder().nome("Manoel").salario(1000.00).nascimento(LocalDate.now()).build();
        toJson = objectMapper.writeValueAsString(personDTO);
    }

    @Test
    void deveBuscarPessoaESalvarComSucesso() throws Exception {
        when(personService.getPerson()).thenReturn(personDTO);
        mockMvc.perform(get(url + "/find")
                .contentType(MediaType.APPLICATION_JSON)
                //.content(toJson)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

        verify(personService).getPerson();
        verifyNoMoreInteractions(personService);
    }
}
