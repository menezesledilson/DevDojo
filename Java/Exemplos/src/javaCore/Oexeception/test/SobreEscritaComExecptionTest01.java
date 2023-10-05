package javaCore.Oexeception.test;

import javaCore.Oexeception.Dominio.Funcionario;
import javaCore.Oexeception.Dominio.LoginInvalidoExeption;
import javaCore.Oexeception.Dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobreEscritaComExecptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try{
            funcionario.salvar();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (LoginInvalidoExeption e) {

        }
    }
}
