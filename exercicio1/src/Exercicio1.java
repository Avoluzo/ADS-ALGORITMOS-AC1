import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("DIGITE UM NUMERO ");
        num = scanner.nextInt();

        if (num > 100 && num < 200) {
            System.out.println("0 NÚMERO SE ENCONTRA NO INTERVALO");
        } else {

            System.out.println("0 NÚMERO NÃO SE ENCONTRA NO INTERVALO");
        }
    }
}