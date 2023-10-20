package javaCore.Npolimorfismo.test;

import javaCore.Npolimorfismo.Repositorio.Repositorio;
import javaCore.Npolimorfismo.servico.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio  = new RepositorioBancoDeDados();
        repositorio.salvar();
        List<String> list = new ArrayList<>();
        list.add("Goku");
        list.add("Vedita");
        list.add("kuririn");

        System.out.println(list);
    }
}
