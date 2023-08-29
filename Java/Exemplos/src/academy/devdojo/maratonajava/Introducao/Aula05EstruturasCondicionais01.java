package academy.devdojo.maratonajava.Introducao;

public class Aula05EstruturasCondicionais01 {

    public static void main(String[] args) {

        int idade = 15;
        boolean isAutorazidadoComprarBebida = idade > 18;

        //!

        if (isAutorazidadoComprarBebida != false) {
            System.out.println("Autorizado ao comprar bebidas");

        } else {
            System.out.println(" Não Autorizado ao comprar bebidas");
        }
        if (!isAutorazidadoComprarBebida) {
            System.out.println(" não Autorizado ao comprar bebidas");
        }
        boolean c = true;

        System.out.println("Fora do if");
    }
}
