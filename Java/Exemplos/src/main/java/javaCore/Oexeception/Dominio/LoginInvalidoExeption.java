package javaCore.Oexeception.Dominio;

public class LoginInvalidoExeption extends Exception{
    public LoginInvalidoExeption() {
        super("Login invalido");
    }

    public LoginInvalidoExeption(String message) {
        super(message);
    }
}
