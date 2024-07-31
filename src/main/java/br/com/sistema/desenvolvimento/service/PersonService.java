package br.com.sistema.desenvolvimento.service;

import br.com.sistema.desenvolvimento.converter.PersonConverter;
import br.com.sistema.desenvolvimento.dao.PersonDao;
import br.com.sistema.desenvolvimento.dtos.PersonDTO;
import br.com.sistema.desenvolvimento.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonService implements IPersonService{

    @Autowired
    PersonDao personDao;

    @Autowired
    PersonConverter converter;

    @Override
    public PersonDTO getPerson() {
        return converter.toDTO(personDao.getPerson());
    }

    @Override
    public List<PersonDTO> listPerson() {
        return converter.toDtoList(personDao.getAll());
    }
}
