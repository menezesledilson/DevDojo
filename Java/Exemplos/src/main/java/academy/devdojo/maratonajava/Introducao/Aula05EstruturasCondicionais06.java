package academy.devdojo.maratonajava.Introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //utilizando o switch dados os valores de um a sete, imprima se é dia útil ou final de semana
        //Considerando 1 como domingo

        byte dia = 1;

        switch (dia) {

            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("opção inválida");
                break;
        }
    }
}
