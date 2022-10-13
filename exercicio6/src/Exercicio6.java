import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        double temperatura;
        double celsius;
        double fahrenheit;
        int num = 0;

        Scanner ler = new Scanner(System.in);
        System.out.println("opção 1 CELSISUS , opção 2 FAHRENHEIT ");
        num = ler.nextInt();
        System.out.print("QUANTIDADE A SER CONVERTIDA: ");
        temperatura = ler.nextDouble();

        if (num == 1) {

            fahrenheit = (temperatura * 9 / 5.0) + 32;
            System.out.println("CELSIUS CONVERTIDO EM FAHRENHEIT É: " + fahrenheit);
        } else if (num == 2) {

            celsius = (temperatura - 32) * 5 / 9.0;
            System.out.println(" FAHRENHEIT CONVERTIDO EM CELSIUS É: " + celsius);
        }
    }
}