package javaCore.Hherenca.dominio;

import javaCore.Gassociacao.dominio.Aluno;

public class Funcionario extends Pessoa {
    private double salario;
    static {
        System.out.println("Dentro do bloc inicialização estático de Funcionario ");
    }

    {
        System.out.println("Dentro do bloco inicialização de Funcionario 1  ");
    }
    {
        System.out.println("Dentro do bloco inicialização de Funcionario 2 ");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do  construtor Funcionario");
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void relatorioPagamento() {
        System.out.println("Eu" + this.getNome() + "rececbi o salario  de  " + this.salario);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
