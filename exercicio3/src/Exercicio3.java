public class Exercicio3 {
    public static void main(String[] args) {

        System.out.print(" A SOMA DOS NUMEROS DE 1 A 15: ");
        int valor = 0;

        for (int i = 1; i <= 15; i++) {
            valor += i;
            System.out.print(valor + ",");
        }
    }
}