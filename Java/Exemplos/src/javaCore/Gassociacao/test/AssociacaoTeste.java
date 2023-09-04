package javaCore.Gassociacao.test;

import javaCore.Gassociacao.dominio.Aluno;
import javaCore.Gassociacao.dominio.Local;
import javaCore.Gassociacao.dominio.Professor;
import javaCore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das flores ");

        Aluno aluno = new Aluno("Will", 17);
        Professor professor = new Professor("Josef", "Mestre");
        Aluno[] alunoParaSeminario = {aluno};


        Seminario seminario = new Seminario("Estudar Lógica", alunoParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
