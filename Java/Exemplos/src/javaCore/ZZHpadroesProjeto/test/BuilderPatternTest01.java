package javaCore.ZZHpadroesProjeto.test;


import javaCore.ZZHpadroesProjeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = Person.PersonBuilder
                .builder()
                .FirstName("William")
                .LastName("Suane")
                .UserName("ViradoNoJiraya")
                .Email("william@suane.com")
                 .build();

        System.out.println(build);
    }
}
