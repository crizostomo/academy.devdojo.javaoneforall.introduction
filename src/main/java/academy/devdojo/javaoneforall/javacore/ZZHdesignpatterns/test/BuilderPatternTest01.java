package academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.test;

//246 - Design Patterns pt 01 - Builder

//Settings > Plugins > Marketplace > builder > Apply > Alt+Insert > builder
// Method prefix: empty and select 'inner builder'

import academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.domain.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person person = Person.PersonBuilder
                .builder()
                .firstName("Diogo")
                .lastName("Almeida")
                .userName("diogoAlmeida")
                .email("sdsdsd@sds.com")
                .build();

        System.out.println(person);
    }
}

