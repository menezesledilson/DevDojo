package javaCore.ZZHpadroesProjeto.test;

import javaCore.ZZHpadroesProjeto.dominio.*;
public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person person = Person.PersonBuilder.builder()
                .FirstName("will")
                .LastName("Suane")
                .build();

        ReportDto reportDto = ReportDto.ReportDtoBuilder.builder()
                .aircraftName(aircraft.getName())
                .Country(country)
                .Currency(currency)
                .PersonName(person.getFirstName())
                .build();

        System.out.println(reportDto);

    }
}
