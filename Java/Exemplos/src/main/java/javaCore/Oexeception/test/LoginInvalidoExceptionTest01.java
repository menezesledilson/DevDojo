package javaCore.Oexeception.test;

import javaCore.Oexeception.Dominio.LoginInvalidoExeption;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {

        try {
            logar();
        }catch (LoginInvalidoExeption e){
            e.printStackTrace();
        }
    }
    private static void logar() throws LoginInvalidoExeption {
        Scanner teclado = new Scanner(System.in);

        String usernameDB = "Goku";
        String senhaDB = "123";

        System.out.println("Usuario");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha");
        String senhaDigitada = teclado.nextLine();
        if(!usernameDigitado.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoExeption("Usuário ou senha invalidos");
        }
        System.out.println("Usuario logado com Sucesso");
    }
}
