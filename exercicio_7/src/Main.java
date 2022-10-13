import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor1, valor2, valor3;

        System.out.printf("DIGITE O 1º NUMERO ");
        valor1 = ler.nextInt();

        System.out.printf("DIGITE 0 2º NUMERO ");
        valor2 = ler.nextInt();

        System.out.printf("DIGITE O 3º NUMERO ");
        valor3 = ler.nextInt();

        if (valor1 > valor2 && valor1 > valor3) {

            System.out.println("O NUMERO MAIOR È: " + valor1);

        } else if (valor2 > valor1 && valor2 > valor3) {

            System.out.println("O NUMERO MAIOR É:: " + valor1);

        } else if (valor3 > valor1 && valor3 > valor2) {

            System.out.println("O NUMERO MAIOR É: " + valor3);

        }
    }
}