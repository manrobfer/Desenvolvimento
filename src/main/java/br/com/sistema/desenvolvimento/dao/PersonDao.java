package br.com.sistema.desenvolvimento.dao;

import br.com.sistema.desenvolvimento.model.Person;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Component
public class PersonDao {

   public Person getPerson(){
        return new Person("100","Manoel", LocalDate.now(),1000.00);
    }

   public List<Person> getAll(){
        return List.of(new Person("100","Manoel", LocalDate.now(),1000.00),
                       new Person("200","Roberto", LocalDate.now(),2000.00),
                       new Person("300","Ferreira", LocalDate.now(),3000.00));
    }
}
