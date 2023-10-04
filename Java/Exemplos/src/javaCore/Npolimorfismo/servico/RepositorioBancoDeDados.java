package javaCore.Npolimorfismo.servico;

import javaCore.Npolimorfismo.Repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salva");
    }
}
