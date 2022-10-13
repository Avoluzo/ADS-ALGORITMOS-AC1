import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um numero: ");
        int valor;
        valor = sc.nextInt();

        if ((valor < 3) || (valor > 25)) {
            System.out.println("Valor menor q 3 ou maior q 25");
        } else {
            System.out.println("Condicao falsa");
        }
    }
}