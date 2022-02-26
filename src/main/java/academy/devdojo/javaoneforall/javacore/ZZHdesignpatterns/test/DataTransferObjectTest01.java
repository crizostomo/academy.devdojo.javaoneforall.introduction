package academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.test;

//251 - Design Patterns pt 06 - Data Transfer Object

import academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.domain.*;
import academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.dto.ReportDto;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person person = Person.PersonBuilder.builder().firstName("Diogo").lastName("Almeida").build();
        ReportDto reportDto = ReportDto.ReportDtoBuilder.builder()
                .aircraftName(aircraft.getName())
                .country(country)
                .currency(currency)
                .personName(person.getFirstName())
                .build();

        System.out.println(reportDto);
    }
}
