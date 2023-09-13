package javaCore.Hherenca.dominio;

import javaCore.Gassociacao.dominio.Aluno;

public class Funcionario extends Pessoa  {
    private double salario;

    public  void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public  void relatorioPagamento(){
        System.out.println("Eu" +this.getNome()+ "rececbi o salario  de  " + this.salario);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
