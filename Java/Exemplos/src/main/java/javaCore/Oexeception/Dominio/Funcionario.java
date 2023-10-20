package javaCore.Oexeception.Dominio;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

public class Funcionario  extends  Pessoa{
    public void salva() throws LoginInvalidoExeption, FileNotFoundException {
        System.out.println("Salvando Funcionário");
    }
}
