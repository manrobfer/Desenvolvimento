package br.com.sistema.desenvolvimento.web;

import br.com.sistema.desenvolvimento.dtos.PersonDTO;
import br.com.sistema.desenvolvimento.model.Person;
import br.com.sistema.desenvolvimento.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class WebController {

    @Autowired
    PersonService personService;

    @GetMapping("/find")
    public PersonDTO getPerson(){
        return personService.getPerson();
    }

    @GetMapping("/list")
    public List<PersonDTO> getAllPerson(){
        return personService.listPerson();
    }
}
