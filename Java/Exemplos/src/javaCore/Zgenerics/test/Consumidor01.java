package javaCore.Zgenerics.test;


import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Consumidor01 {

    private Long id;

    private String nome;

    public Consumidor01(String nome) {
        this.id = ThreadLocalRandom.current().nextLong(0,1000_000);
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consumidor01 that = (Consumidor01) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Consumidor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }
}
