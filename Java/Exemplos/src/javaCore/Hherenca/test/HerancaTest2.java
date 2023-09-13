package javaCore.Hherenca.test;

import javaCore.Hherenca.dominio.Funcionario;

public class HerancaTest2 {
    /*
    * 0- Bloco inicialização estatico da super classe e executado quando a JVM carrgar classe pai
    * 1- Bloco de inicalização estático da sub classe é executado quando a JVM carregar classe filha
    * 2- Alocado espaco em memória pro objeto
    * 3- Cada atributo de classe é criado e inicializado com valores default ou o quer for passado
    * 4- Bloco de inicialização é executado
    * 5- Construtor é executado da superclasse
    * 6- Alocado espaco em memoria pro objeto da subclasse
    * 7- Cada atributo de subclasse é criado e inicializado com valores default ou o quer for passado da classe
    * 8- Bloco de inicialização da subclasse é executado na ordem em que aparece
    * 9- Construtor é executado da superclasse    * */

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
