package javaCore.Npolimorfismo.servico;

import javaCore.Npolimorfismo.Repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("salvando em Memoria");
    }
}
