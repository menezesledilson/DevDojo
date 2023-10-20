package academy.devdojo.maratonajava.Introducao;

public class Aula06EstruturaDeRepeticao04 {

    //Dado o valor de um carro, descubra em quantas ele pode ser parcelado
    //Condção  valorParcela >= 10000

    public static void main(String[] args) {
        double valorTotal = 3000;

        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
                // continue;
            }
            System.out.println("Parcela " + parcela + "R$" + valorParcela);
        }
    }
}

