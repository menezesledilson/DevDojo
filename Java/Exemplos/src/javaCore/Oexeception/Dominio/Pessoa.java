package javaCore.Oexeception.Dominio;

import java.io.FileNotFoundException;

public class Pessoa {

    public void salvar ( )throws LoginInvalidoExeption, FileNotFoundException{
        System.out.println("Salvando pessoa ");
    }
}
