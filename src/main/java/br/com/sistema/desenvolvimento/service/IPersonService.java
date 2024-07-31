package br.com.sistema.desenvolvimento.service;

import br.com.sistema.desenvolvimento.dtos.PersonDTO;

import java.util.List;

public interface IPersonService {
    PersonDTO getPerson();
    List<PersonDTO> listPerson();
}
