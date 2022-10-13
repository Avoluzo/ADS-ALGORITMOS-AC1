import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float p;
        float a;
        float imc;

        System.out.println("Qual seu peso: ");
        p = sc.nextFloat();
        System.out.println("Qual sua altura: ");
        a = sc.nextFloat();

        imc = p / (a * a);
        System.out.println("Seu IMC(índice de massa corporal) é " + imc);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso ");

        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso normal ");

        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso ");

        } else if (imc >= 25) {
            System.out.println("Obeso ");

        }
    }


}
