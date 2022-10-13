import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {


        double bim1;
        double bim2;

        double bim3;
        double bim4;

        double media;
        double falta1;

        double falta2;
        double falta3;

        double falta4;
        double faltaTotal;

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 1; i++) {

            System.out.print("NOTA DO 1º BIMESTRE: ");
            bim1 = sc.nextInt();

            System.out.print("FALTAS NO 1º BIMESTRE: ");
            falta1 = sc.nextInt();

            System.out.print("NOTA DO 2º BIMESTRE: ");
            bim2 = sc.nextInt();

            System.out.print("FALTAS DO 2º BIMESTRE: ");
            falta2 = sc.nextInt();

            System.out.print("NOTA DO 3º BIMESTRE: ");
            bim3 = sc.nextInt();

            System.out.print("FALTAS DO 3º BIMESTRE: ");
            falta3 = sc.nextInt();

            System.out.print("NNOTA DO 4º BIMESTRE: ");
            bim4 = sc.nextInt();

            System.out.print("FALTAS DO 4º BIMESTRE: ");
            falta4 = sc.nextInt();

            media = (bim1 + bim2 + bim3 + bim4) / 4;
            System.out.println("MÉDIA: " + media);

            faltaTotal = falta1 + falta2 + falta3 + falta4;
            System.out.println("TTATAL DE FALTAS " + faltaTotal);

            if (media > 7.0 && media <= 10 && faltaTotal <= 36) {
                System.out.println("APROVADO ");

            } else if (media > 4.0 && media <= 6.9 && faltaTotal <= 36) {
                System.out.println("REALIZAR EXAME FINAL ");

            } else if (media < 4.0 && faltaTotal > 36) {
                System.out.println("REPROVADO ");

            }
        }

    }
}