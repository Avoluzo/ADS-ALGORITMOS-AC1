import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int num , maior = 0, menor = 0, igual = 0;

        for( int i = 1; i<=5; i++) {

            System.out.print("DIGITE nNUMEROS DIFERENTES ");
            num = ler.nextInt();

            if (num > 50 )
            {
                maior = maior + 1;
                System.out.println("VOCE DIGITOU " + maior + " NUMEROS MAIORES QUE 50: ");
            }

            else if (num == 50)
            {
                igual = igual + 1;
                System.out.println("O NUMERO 50 FOI DIGITADO  " + igual + " VEZES:");
            }

            else if(num < 50)
            {
                menor = menor + 1;
                System.out.println("VOCE DIGITOU " + menor + " NUMEROS MENORES QUE 50");
            }
        }

    }
}