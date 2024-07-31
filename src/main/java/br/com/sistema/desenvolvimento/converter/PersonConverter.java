package br.com.sistema.desenvolvimento.converter;

import br.com.sistema.desenvolvimento.dtos.PersonDTO;
import br.com.sistema.desenvolvimento.model.Person;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class PersonConverter {

    public Person toEntity(PersonDTO dto){
        return Person.builder()
                     .nome(dto.getNome())
                     .condigo(String.valueOf(UUID.randomUUID()))
                     .salario(dto.getSalario())
                     .nascimento(dto.getNascimento())
                     .build();
    }
    public PersonDTO toDTO(Person person){
        return PersonDTO.builder()
                        .nome(person.getNome())
                        .nascimento(person.getNascimento())
                        .salario(person.getSalario())
                        .build();
    }
    public List<Person> toList(List<PersonDTO> personListDto){
        return personListDto.stream().map(this::toEntity).toList();
    }

    public List<PersonDTO> toDtoList(List<Person> personListDto){
        return personListDto.stream().map(this::toDTO).toList();
    }
}
