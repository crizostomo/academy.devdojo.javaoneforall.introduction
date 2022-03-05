package academy.devdojo.javaoneforall.javacore.ZZKjunit.service;

//280 - Unit tests with jUnit pt 01

import academy.devdojo.javaoneforall.javacore.ZZKjunit.domain.Person;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

//Cursor over 'PersonService' and press 'alt + enter' + 'create a test'

public class PersonService {

    public boolean isAdult(Person person){
        Objects.requireNonNull(person, "Person can't be null");
//        if(person == null){
//            throw new IllegalArgumentException();
//        }
        return person.getAge() >= 18;
    }

    public List<Person> filterRemovingAdult(List<Person> personList){
        return personList
                .stream()
                .filter(this::isAdult)
                .collect(Collectors.toList());
    }
}
