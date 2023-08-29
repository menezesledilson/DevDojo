package javaCore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void impremi() {

        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
        return;
        }
            for (double salario : salarios) {
                System.out.print(salario + " ");
            }
            imprimeMediaSalario();
        }

    public void imprimeMediaSalario() {
        if (salarios == null) {
            return;
        }
        double media = 0;

        for (double salario : salarios) {
            media += salario;

            System.out.println(salario + " ");
        }
        media /= salarios.length;

        System.out.println("\nMédia salarial " + media);

    }
}
