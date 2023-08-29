package javaCore.Eblocosinicializacao.dominio;

// bloco de inicialização executado antes do construtor
public class Anime01 {
    private String nome;
    private int[] episodios;
// 1 alocado em momoria pro objeto
// 2 cada atributo e criado inicializado com valores default for passado
// 3 bloco de inicialização é executado
//4 Construtor é executado

    {
        System.out.println("Dentro do bloco de inicializaçao");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime01(String nome) {
        this.nome = nome;
    }

    public Anime01() {
        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}

