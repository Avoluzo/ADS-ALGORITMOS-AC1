import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE UM NUMERO: ");
        int valor1, valor2, valor3;
        valor1 = sc.nextInt();

        System.out.println("DIGITE UM NUMERO: ");
        valor2 = sc.nextInt();

        valor3 = valor1 + valor2;

        if (valor3 > 20) {
            valor3 += 8;

        }else {
            valor3 -= 5;
        }

        System.out.println("O VALOR INSERIDO FOI: " + valor3);

    }
}
