package javaCore.Gassociacao.test;

import javaCore.Gassociacao.dominio.Escola;
import javaCore.Gassociacao.dominio.Professor;

public class EscolaTest01 {

    public static void main(String[] args) {
        Professor  professor = new Professor("Jiraya Sensei", "Mestre");
        Professor [] professores = {professor};
        Escola escola = new Escola( "Konoha", professores);

        escola.imprime();


    }
}
